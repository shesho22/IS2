from django.http import HttpResponse

# Create your views here.
def hola(request):
    return HttpResponse("<h2>Hola<h2>")

def about(request):
    return HttpResponse(";-;")