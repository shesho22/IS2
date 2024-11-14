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
        # Sobrescribimos el método `perform_create` para enviar el correo al crear una invitación
    def perform_create(self, serializer):
        # Guardamos la invitación
        invitacion = serializer.save()
        # Enviar la invitación por correo después de guardarla
        usuario_envia = self.request.user.username  # Asumimos que el usuario que hace la solicitud es quien envía
        email_invitado = invitacion.email  # Suponemos que el campo 'email' de la invitación contiene el correo del destinatario
        mensaje_personalizado = invitacion.mensaje_personalizado  # El mensaje que se incluye en la invitación
        # Llamamos a la función para enviar el correo
        enviar_invitacion(usuario_envia, email_invitado, mensaje_personalizado)

# Vista para el modelo TipoInvitacion
class TipoInvitacionViewSet(viewsets.ModelViewSet):
    queryset = TipoInvitacion.objects.all()
    serializer_class = TipoInvitacionSerializer
