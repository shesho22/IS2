from rest_framework import viewsets
from .models import Usuario, TipoUsuario, Notificacion, TipoNotificacion, Invitacion, TipoInvitacion
from .signals import enviar_invitacion 
from .serializers import (
    UsuarioSerializer,
    TipoUsuarioSerializer,
    NotificacionSerializer,
    TipoNotificacionSerializer,
    InvitacionSerializer,
    TipoInvitacionSerializer
)

# Vista para el modelo Usuario
class UsuarioViewSet(viewsets.ModelViewSet):
    queryset = Usuario.objects.all()
    serializer_class = UsuarioSerializer
    def perform_create(self, serializer):
        # Obtener la contraseña del request
        raw_password = self.request.data.get('clave')
        # Crear el usuario, pero sin guardar la contraseña
        usuario = serializer.save()
        # Usar el método set_password para cifrar la contraseña
        if raw_password:
            usuario.set_password(raw_password)
            usuario.save()

# Vista para el modelo TipoUsuario
class TipoUsuarioViewSet(viewsets.ModelViewSet):
    queryset = TipoUsuario.objects.all()
    serializer_class = TipoUsuarioSerializer

# Vista para el modelo Notificacion
class NotificacionViewSet(viewsets.ModelViewSet):
    queryset = Notificacion.objects.all()
    serializer_class = NotificacionSerializer

# Vista para el modelo TipoNotificacion
class TipoNotificacionViewSet(viewsets.ModelViewSet):
    queryset = TipoNotificacion.objects.all()
    serializer_class = TipoNotificacionSerializer

# Vista para el modelo Invitacion
class InvitacionViewSet(viewsets.ModelViewSet):
    queryset = Invitacion.objects.all()
    serializer_class = InvitacionSerializer
    def perform_create(self, serializer):
        # Guardamos la invitación
        invitacion = serializer.save()
        # Asumimos que el usuario que hace la solicitud es quien envía la invitación
        usuario_envia = self.request.user.username
        # Suponemos que el campo 'email' de la invitación contiene el correo del destinatario
        email_invitado = invitacion.email
        # El mensaje personalizado que se incluye en la invitación
        mensaje_personalizado = invitacion.mensaje_personalizado
        # Llamamos a la función para enviar la invitación por correo
        enviar_invitacion(usuario_envia, email_invitado, mensaje_personalizado)


# Vista para el modelo TipoInvitacion
class TipoInvitacionViewSet(viewsets.ModelViewSet):
    queryset = TipoInvitacion.objects.all()
    serializer_class = TipoInvitacionSerializer
