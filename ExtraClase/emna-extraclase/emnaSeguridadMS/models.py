from django.db import models
from django.utils import timezone

# Create your models here.
class Diario(models.Model):
    nombre = models.CharField(max_length=255)  
    conversacion = models.ForeignKey('emnaMensajesMS.Conversacion', on_delete=models.CASCADE, related_name='diarios') 
    fecha_creacion = models.DateTimeField(auto_now_add=True)
    es_activo = models.BooleanField(default=True) 
    vigencia = models.DateTimeField(null=True, blank=True)  

class Pagina(models.Model):
    diario = models.ForeignKey('Diario', on_delete=models.CASCADE, related_name='paginas')  
    mensaje = models.ForeignKey('emnaMensajesMS.Mensaje', on_delete=models.CASCADE, related_name='paginas')  
    contenido = models.TextField(max_length=500)  
    es_temporal = models.BooleanField(default=False) 
