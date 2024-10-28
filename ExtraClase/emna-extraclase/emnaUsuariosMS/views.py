from django.http import HttpResponse, JsonResponse
from .models import Usuario
from django.shortcuts import get_list_or_404
from rest_framework import status
from.serializers import UsuarioSerializer
from rest_framework.views import APIView
from rest_framework.response import Response

# Create your views here.
def hola(request,name):
    print(name)
    return HttpResponse("<h2>Hola %s<h2>" %name)

def about(request):
    return HttpResponse(";-;")


def usuarios(request):
    return HttpResponse("usuarios")


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

class UsuarioCreate(APIView):
    def post(self,request):
        serializer = UsuarioSerializer(data=request.data)
        if serializer.is_valid():
            serializer.save()
            return Response(serializer.data,status=status.HTTP_201_CREATED)
        return Response(serializer.errors,status=status.HTTP_400_BAD_REQUEST)
    
