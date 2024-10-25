from django.urls import path
from . import views
from .views import UsuarioCreate


urlpatterns = [
    path('',views.hola),
    path('hola/',views.about),
    path('hola/<str:name>',views.hola),
    path('usuario/',views.usuarios),
    path('tipousuario/',views.tipoUsuarios),
    path('invitacion/',views.invitaciones),
    path('tipoinvitacion/',views.tipoInvitaciones),
    path('notificacion/',views.notificaciones),
    path('tiponotificacion/',views.tipoNotificaciones),

    path('',UsuarioCreate.as_view(),name='listar_usuarios'),
]
