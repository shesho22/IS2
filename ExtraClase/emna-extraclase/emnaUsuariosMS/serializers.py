from rest_framework import serializers
from .models import Usuario, TipoUsuario, Notificacion, TipoNotificacion, Invitacion, TipoInvitacion

# Serializer para el modelo Usuario
class UsuarioSerializer(serializers.ModelSerializer):
    class Meta:
        model = Usuario
        fields = ['id', 'nombre', 'email', 'clave', 'fecha_registro', 'tipo_usuario', 'es_activo']
        extra_kwargs = {
            'clave': {'write_only': True}  # Ocultar el campo clave en las respuestas
        }

# Serializer para el modelo TipoUsuario
class TipoUsuarioSerializer(serializers.ModelSerializer):
    class Meta:
        model = TipoUsuario
        fields = ['id', 'nombre', 'descripcion']

# Serializer para el modelo Notificacion
class NotificacionSerializer(serializers.ModelSerializer):
    class Meta:
        model = Notificacion
        fields = ['id', 'usuario', 'titulo', 'mensaje', 'es_leido', 'fecha_envio', 'es_aceptado']

# Serializer para el modelo TipoNotificacion
class TipoNotificacionSerializer(serializers.ModelSerializer):
    class Meta:
        model = TipoNotificacion
        fields = ['id', 'nombre', 'descripcion']

# Serializer para el modelo Invitacion
class InvitacionSerializer(serializers.ModelSerializer):
    class Meta:
        model = Invitacion
        fields = [
            'id', 'usuario_envia', 'email_invitado', 'tipo_invitacion', 
            'mensaje_personalizado', 'fecha_envio', 'es_aceptado', 'fecha_aceptacion', 'conversacion'
        ]

# Serializer para el modelo TipoInvitacion
class TipoInvitacionSerializer(serializers.ModelSerializer):
    class Meta:
        model = TipoInvitacion
        fields = ['id', 'nombre', 'descripcion']
