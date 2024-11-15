# Generated by Django 5.1.2 on 2024-10-17 09:12

import django.db.models.deletion
from django.db import migrations, models


class Migration(migrations.Migration):

    initial = True

    dependencies = [
        ('emnaMensajesMS', '0001_initial'),
        ('emnaUsuariosMS', '0001_initial'),
    ]

    operations = [
        migrations.AddField(
            model_name='conversacion',
            name='usuario1',
            field=models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, related_name='conversaciones_usuario1', to='emnaUsuariosMS.usuario'),
        ),
        migrations.AddField(
            model_name='conversacion',
            name='usuario2',
            field=models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, related_name='conversaciones_usuario2', to='emnaUsuariosMS.usuario'),
        ),
        migrations.AddField(
            model_name='mensaje',
            name='conversacion',
            field=models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, related_name='mensajes', to='emnaMensajesMS.conversacion'),
        ),
        migrations.AddField(
            model_name='mensaje',
            name='emisor',
            field=models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, related_name='mensajes_enviados', to='emnaUsuariosMS.usuario'),
        ),
        migrations.AddField(
            model_name='mensaje',
            name='tipo_mensaje',
            field=models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, related_name='mensajes', to='emnaMensajesMS.tipomensaje'),
        ),
    ]
