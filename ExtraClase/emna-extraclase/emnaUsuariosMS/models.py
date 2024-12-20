from django.db import models
from cryptography.fernet import Fernet
from django.utils import timezone
from django.contrib.auth.hashers import make_password, check_password

# Create your models here.
class Usuario(models.Model):
    nombre = models.CharField(max_length=255)
    email = models.EmailField(unique=True)
    clave = models.CharField(max_length=128)
    fecha_registro = models.DateTimeField(auto_now_add=True)
    tipo_usuario = models.ForeignKey('TipoUsuario', on_delete=models.CASCADE, related_name='usuarios')
    es_activo = models.BooleanField(default=True)
    def set_password(self, raw_password):
        self.clave = make_password(raw_password)
    def check_password(self, raw_password):
        return check_password(raw_password, self.clave)
     


class TipoUsuario(models.Model):
    nombre = models.CharField(max_length=255, null=False, blank=False)
    descripcion = models.TextField(max_length=500)



class Notificacion(models.Model):
    usuario = models.ForeignKey('Usuario', on_delete=models.CASCADE, related_name='notificaciones')
    titulo = models.CharField(max_length=255)  
    mensaje = models.TextField()  
    es_leido = models.BooleanField(default=False)  
    fecha_envio = models.DateTimeField(auto_now_add=True)  
    es_aceptado = models.BooleanField(default=False) 


    
class TipoNotificacion(models.Model):
    nombre = models.CharField(max_length=255, null=False, blank=False)
    descripcion = models.TextField(max_length=500)


class Invitacion(models.Model):
    usuario_envia = models.ForeignKey('Usuario', on_delete=models.CASCADE, related_name='emisor')
    email_invitado = models.EmailField(unique=True)
    tipo_invitacion = models.ForeignKey('TipoInvitacion', on_delete=models.CASCADE, related_name='invitaciones')
    mensaje_personalizado = models.TextField(blank=True, null=True)
    fecha_envio = models.DateTimeField(auto_now_add=True)
    es_aceptado = models.BooleanField(default=False)
    fecha_aceptacion = models.DateTimeField(null=True, blank=True)
    conversacion = models.ForeignKey('emnaMensajesMS.Conversacion', on_delete=models.CASCADE, related_name='invitados')

class TipoInvitacion(models.Model):
    nombre = models.CharField(max_length=255, null=False, blank=False)
    descripcion = models.TextField(max_length=500)
