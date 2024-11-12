from django.urls import path, include
from rest_framework.routers import DefaultRouter
from .views import (
    UsuarioViewSet,
    TipoUsuarioViewSet,
    NotificacionViewSet,
    TipoNotificacionViewSet,
    InvitacionViewSet,
    TipoInvitacionViewSet,
)

# Crear un enrutador y registrar cada vista
router = DefaultRouter()
router.register(r'usuarios', UsuarioViewSet)               # CRUD para Usuario
router.register(r'tipos_usuario', TipoUsuarioViewSet)      # CRUD para TipoUsuario
router.register(r'notificaciones', NotificacionViewSet)    # CRUD para Notificacion
router.register(r'tipos_notificacion', TipoNotificacionViewSet)  # CRUD para TipoNotificacion
router.register(r'invitaciones', InvitacionViewSet)        # CRUD para Invitacion
router.register(r'tipos_invitacion', TipoInvitacionViewSet)  # CRUD para TipoInvitacion

# Incluir las rutas generadas por el enrutador en las URL principales
urlpatterns = [
    path('', include(router.urls)),
]

