from django.urls import path
from . import views

urlpatterns = [
    path('',views.hola),
    path('hola/',views.about),
    path('hola/<str:name>',views.hola),
    path('usuario/',views.usuarios),
    path('registrar/',views.crear_usuario,name='crear_usuario'),
    path('tipousuario/',views.tipoUsuarios),
    path('invitacion/',views.invitaciones),
    path('tipoinvitacion/',views.tipoInvitaciones),
    path('notificacion/',views.notificaciones),
    path('tiponotificacion/',views.tipoNotificaciones),
]
