# serializers.py
from rest_framework import serializers
from .models import Usuario, TipoUsuario, Notificacion, TipoNotificacion, Invitacion, TipoInvitacion

class TipoUsuarioSerializer(serializers.ModelSerializer):
    class Meta:
        model = TipoUsuario
        fields = ['id', 'nombre', 'descripcion']  # Incluye 'id' si quieres que sea parte del serializer

class UsuarioSerializer(serializers.ModelSerializer):
    tipo_usuario = TipoUsuarioSerializer()  # Incluye los detalles del tipo de usuario
    class Meta:
        model = Usuario
        fields = ['id', 'nombre', 'email', 'fecha_registro', 'tipo_usuario', 'es_activo']  # Incluye 'id' para el usuario
        extra_kwargs={
            'clave':{'write_only':True}
        }

class NotificacionSerializer(serializers.ModelSerializer):
    class Meta:
        model = Notificacion
        fields = ['id', 'usuario', 'titulo', 'mensaje', 'es_leido', 'fecha_envio', 'es_aceptado']  # Incluye 'id' para la notificación

class TipoNotificacionSerializer(serializers.ModelSerializer):
    class Meta:
        model = TipoNotificacion
        fields = ['id', 'nombre', 'descripcion']  # Incluye 'id' para el tipo de notificación

class InvitacionSerializer(serializers.ModelSerializer):
    class Meta:
        model = Invitacion
        fields = ['id', 'usuario_envia', 'email_invitado', 'tipo_invitacion', 'mensaje_personalizado', 'fecha_envio', 'es_aceptado', 'fecha_aceptacion', 'conversacion']  # Incluye 'id' para la invitación

class TipoInvitacionSerializer(serializers.ModelSerializer):
    class Meta:
        model = TipoInvitacion
        fields = ['id', 'nombre', 'descripcion']  # Incluye 'id' para el tipo de invitación
