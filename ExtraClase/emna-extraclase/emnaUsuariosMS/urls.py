from django.urls import path
from . import views

urlpatterns = [
    path('',views.hola),
    path('hola/',views.about),
]
