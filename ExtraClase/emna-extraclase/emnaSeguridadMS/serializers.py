from rest_framework import serializers
from .models import Diario, Pagina
from emnaMensajesMS.models import Conversacion, Mensaje  # Si están en otra app, ajusta el import

# Serializer para el modelo Conversacion (relacionado con Diario)
class ConversacionSerializer(serializers.ModelSerializer):
    class Meta:
        model = Conversacion
        fields = ['id', 'nombre', 'fecha_creacion']

# Serializer para el modelo Mensaje (relacionado con Pagina)
class MensajeSerializer(serializers.ModelSerializer):
    class Meta:
        model = Mensaje
        fields = ['id', 'contenido', 'fecha_creacion']

# Serializer para el modelo Diario
class DiarioSerializer(serializers.ModelSerializer):
    conversacion = ConversacionSerializer(read_only=True)  # Relacionamos con Conversacion
    fecha_creacion = serializers.DateTimeField(format='%Y-%m-%d %H:%M:%S')
    vigencia = serializers.DateTimeField(format='%Y-%m-%d %H:%M:%S', required=False)

    class Meta:
        model = Diario
        fields = ['id', 'nombre', 'conversacion', 'fecha_creacion', 'es_activo', 'vigencia']

# Serializer para el modelo Pagina
class PaginaSerializer(serializers.ModelSerializer):
    diario = DiarioSerializer(read_only=True)  # Relacionamos con Diario
    mensaje = MensajeSerializer(read_only=True)  # Relacionamos con Mensaje

    class Meta:
        model = Pagina
        fields = ['id', 'diario', 'mensaje', 'contenido', 'es_temporal']
