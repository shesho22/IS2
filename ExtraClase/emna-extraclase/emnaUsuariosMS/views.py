from rest_framework import viewsets
from .models import Usuario, TipoUsuario, Notificacion, TipoNotificacion, Invitacion, TipoInvitacion
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

# Vista para el modelo TipoInvitacion
class TipoInvitacionViewSet(viewsets.ModelViewSet):
    queryset = TipoInvitacion.objects.all()
    serializer_class = TipoInvitacionSerializer
