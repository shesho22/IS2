from django.contrib import admin

from .models import Usuario, TipoUsuario, Notificacion, TipoNotificacion, Invitacion, TipoInvitacion

admin.site.register(Usuario)
admin.site.register(TipoUsuario)
admin.site.register(Notificacion)
admin.site.register(TipoNotificacion)
admin.site.register(Invitacion)
admin.site.register(TipoInvitacion)