from django.core.mail import send_mail
from django.core.mail import BadHeaderError
from django.conf import settings
from django.http import HttpResponse

# Función para enviar la invitación por correo
def enviar_invitacion(usuario_envia, email_invitado, mensaje_personalizado):
    asunto = 'Invitación a unirse'
    mensaje = f'Hola,\n\n{usuario_envia} te invita a unirte a nuestra plataforma. \n\nMensaje personal: {mensaje_personalizado}'

    remitente = settings.DEFAULT_FROM_EMAIL  # Correo del remitente
    destinatario = [email_invitado]  # El correo del destinatario

    try:
        # Intentamos enviar el correo en texto plano
        send_mail(
            asunto,  # Asunto del correo
            mensaje,  # Cuerpo del correo en texto plano
            remitente,  # Remitente del correo
            destinatario,  # Destinatarios
            fail_silently=False  # Si algo falla, lanzará una excepción
        )
    except BadHeaderError:
        return HttpResponse('Hubo un error con el encabezado del correo. Por favor, intenta nuevamente.')
    except Exception as e:
        return HttpResponse(f'Hubo un error al intentar enviar el correo: {str(e)}')
    
    return HttpResponse("Invitación enviada correctamente")
