from django.urls import path, include
from rest_framework.routers import DefaultRouter
from .views import DiarioViewSet, PaginaViewSet

# Crear un enrutador y registrar cada vista
router = DefaultRouter()
router.register(r'diarios', DiarioViewSet)       # CRUD para Diario
router.register(r'paginas', PaginaViewSet)       # CRUD para Pagina

# Incluir las rutas generadas por el enrutador en las URL principales
urlpatterns = [
    path('', include(router.urls)),  # Incluir las rutas generadas por el enrutador bajo el prefijo 'api/'
]
