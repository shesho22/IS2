# Generated by Django 5.1.2 on 2024-11-19 05:23

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('emnaSeguridadMS', '0002_alter_pagina_contenido'),
    ]

    operations = [
        migrations.AlterField(
            model_name='diario',
            name='fecha_creacion',
            field=models.DateTimeField(auto_now_add=True),
        ),
    ]
