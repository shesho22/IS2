from django.db import models
from django.utils import timezone

# Create your models here.
class Mensaje(models.Model):
    conversacion = models.ForeignKey('Conversacion', on_delete=models.CASCADE, related_name='mensajes')
    emisor = models.ForeignKey('emnaUsuariosMS.Usuario', on_delete=models.CASCADE, related_name='mensajes_enviados')  
    contenido = models.TextField() 
    fue_leido = models.BooleanField(default=False)  
    tipo_mensaje = models.ForeignKey('TipoMensaje', on_delete=models.CASCADE, related_name='mensajes')
    fecha_envio = models.DateTimeField(auto_now_add=True) 
    es_temporal = models.BooleanField(default=False)  

class TipoMensaje(models.Model):
    nombre = models.CharField(max_length=255, null=False, blank=False)
    descripcion = models.TextField()

class Conversacion(models.Model):
    fecha_conversacion = models.DateTimeField(auto_now_add=True)
    usuario1 = models.ForeignKey('emnaUsuariosMS.Usuario', on_delete=models.CASCADE, related_name='conversaciones_usuario1')
    usuario2 = models.ForeignKey('emnaUsuariosMS.Usuario', on_delete=models.CASCADE, related_name='conversaciones_usuario2')
    titulo = models.CharField(max_length=255)  
    descripcion = models.CharField(max_length=255)  
    es_activo = models.BooleanField(default=True)
    vigencia = models.DateTimeField(null=True, blank=True)
    