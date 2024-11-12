# Importamos el módulo necesario para enviar correos
from django.core.mail import send_mail
from django.conf import settings

# Función para enviar la invitación por correo
def enviar_invitacion(usuario_envia, email_invitado, mensaje_personalizado):
    asunto = 'Invitación a unirse'
    mensaje = f'Hola,\n\n{usuario_envia} te invita a unirte a nuestra plataforma. \n\nMensaje personal: {mensaje_personalizado}'
    remitente = settings.DEFAULT_FROM_EMAIL  # Este es el correo desde el que se enviará el mensaje
    destinatario = [email_invitado]  # El correo del destinatario

    # Enviar el correo
    send_mail(asunto, mensaje, remitente, destinatario)
