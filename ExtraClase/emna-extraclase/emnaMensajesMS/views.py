from rest_framework import viewsets
from .models import Mensaje, TipoMensaje, Conversacion
from .serializers import MensajeSerializer, TipoMensajeSerializer, ConversacionSerializer

# Vista para el modelo Mensaje
class MensajeViewSet(viewsets.ModelViewSet):
    queryset = Mensaje.objects.all()
    serializer_class = MensajeSerializer

# Vista para el modelo TipoMensaje
class TipoMensajeViewSet(viewsets.ModelViewSet):
    queryset = TipoMensaje.objects.all()
    serializer_class = TipoMensajeSerializer

# Vista para el modelo Conversacion
class ConversacionViewSet(viewsets.ModelViewSet):
    queryset = Conversacion.objects.all()
    serializer_class = ConversacionSerializer
