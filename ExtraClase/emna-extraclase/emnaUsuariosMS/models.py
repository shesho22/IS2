from django.db import models
from django.utils import timezone

# Create your models here.
class Usuario(models.Model):
    nombre = models.CharField(max_length=255)
    email = models.EmailField(unique=True)
    clave = models.CharField(max_length=128)
    fecha_registro = models.DateTimeField(default=timezone.now)
    tipo_usuario = models.ForeignKey('TipoUsuario', on_delete=models.CASCADE, related_name='usuarios')
    es_activo = models.BooleanField(default=True)


class TipoUsuario(models.Model):
    nombre = models.CharField(max_length=255, null=False, blank=False)
    descripcion = models.TextField(max_length=500)



class Notificacion(models.Model):
    usuario = models.ForeignKey('Usuario', on_delete=models.CASCADE, related_name='notificaciones')
    titulo = models.CharField(max_length=255)  
    mensaje = models.TextField()  
    es_leido = models.BooleanField(default=False)  
    fecha_envio = models.DateTimeField(default=timezone.now)  
    es_aceptado = models.BooleanField(default=False) 


    
class TipoNotificacion(models.Model):
    nombre = models.CharField(max_length=255, null=False, blank=False)
    descripcion = models.TextField(max_length=500)


class Invitacion(models.Model):
    usuario_envia = models.ForeignKey('Usuario', on_delete=models.CASCADE, related_name='emisor')
    email_invitado = models.EmailField(unique=True)
    tipo_invitacion = models.ForeignKey('TipoInvitacion', on_delete=models.CASCADE, related_name='invitaciones')
    mensaje_personalizado = models.TextField(blank=True, null=True)
    fecha_envio = models.DateTimeField(default=timezone.now)
    es_aceptado = models.BooleanField(default=False)
    fecha_aceptacion = models.DateTimeField(null=True, blank=True)
    conversacion = models.ForeignKey('emnaMensajesMS.Conversacion', on_delete=models.CASCADE, related_name='invitados')

class TipoInvitacion(models.Model):
    nombre = models.CharField(max_length=255, null=False, blank=False)
    descripcion = models.TextField(max_length=500)
