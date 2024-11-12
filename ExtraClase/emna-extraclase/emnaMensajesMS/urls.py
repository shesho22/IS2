from django.urls import path, include
from rest_framework.routers import DefaultRouter
from .views import MensajeViewSet, TipoMensajeViewSet, ConversacionViewSet

# Crear un enrutador y registrar cada vista
router = DefaultRouter()
router.register(r'mensajes', MensajeViewSet)             # CRUD para Mensaje
router.register(r'tipos_mensaje', TipoMensajeViewSet)    # CRUD para TipoMensaje
router.register(r'conversaciones', ConversacionViewSet)  # CRUD para Conversacion

# Incluir las rutas generadas por el enrutador en las URL principales
urlpatterns = [
    path('', include(router.urls)),
]
