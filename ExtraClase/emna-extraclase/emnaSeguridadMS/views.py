from rest_framework import viewsets
from .models import Diario, Pagina
from .serializers import DiarioSerializer, PaginaSerializer

# Vista para el modelo Diario
class DiarioViewSet(viewsets.ModelViewSet):
    queryset = Diario.objects.all()
    serializer_class = DiarioSerializer

# Vista para el modelo Pagina
class PaginaViewSet(viewsets.ModelViewSet):
    queryset = Pagina.objects.all()
    serializer_class = PaginaSerializer
