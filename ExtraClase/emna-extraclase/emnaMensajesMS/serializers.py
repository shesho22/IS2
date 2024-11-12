from rest_framework import serializers
from .models import Mensaje, TipoMensaje, Conversacion

# Serializer para el modelo Mensaje
class MensajeSerializer(serializers.ModelSerializer):
    class Meta:
        model = Mensaje
        fields = ['id', 'conversacion', 'emisor', 'contenido', 'fue_leido', 'tipo_mensaje', 'fecha_envio', 'es_temporal']
        
# Serializer para el modelo TipoMensaje
class TipoMensajeSerializer(serializers.ModelSerializer):
    class Meta:
        model = TipoMensaje
        fields = ['id', 'nombre', 'descripcion']

# Serializer para el modelo Conversacion
class ConversacionSerializer(serializers.ModelSerializer):
    class Meta:
        model = Conversacion
        fields = ['id', 'fecha_conversacion', 'usuario1', 'usuario2', 'titulo', 'descripcion', 'es_activo', 'vigencia']
