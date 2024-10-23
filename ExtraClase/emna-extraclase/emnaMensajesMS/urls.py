from django.urls import path
from . import views

urlpatterns = [
    path('hola1/',views.about),
]
