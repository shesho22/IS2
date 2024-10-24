from django.http import HttpResponse, JsonResponse
from .models import Usuario
from .serializers import *
from django.shortcuts import get_list_or_404
from rest_framework.decorators import api_view
from rest_framework import status

# Create your views here.
def hola(request,name):
    print(name)
    return HttpResponse("<h2>Hola %s<h2>" %name)

def about(request):
    return HttpResponse(";-;")


def usuarios(request):
    return HttpResponse("usuarios")

@api_view(['POST'])
def crear_usuario(request):
    serializers = UsuarioSerializer(data=request.data)
    if serializers.is_valid():
        usuario = serializers.save()
        return JsonResponse({'message':'Usuario creado exitosamente','id':usuario.id},status=status.HTTP_201_CREATED)
    return JsonResponse(serializers.errors,status=status.HTTP_400_BAD_REQUEST)

def tipoUsuarios(request):
    return HttpResponse("tipoUsuario")

def notificaciones(request):
    return HttpResponse("notificaciones")

def tipoNotificaciones(request):
    return HttpResponse("tipoNotificaciones")

def invitaciones(request):
    return HttpResponse("invitaciones")

def tipoInvitaciones(request):
    return HttpResponse("tipoInvitaciones")