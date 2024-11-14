# Usar la imagen oficial de Python 3.12.7 como base
FROM python:3.12.7-slim

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar los archivos de la aplicación en el contenedor
COPY . /app/

# Crear un entorno virtual y activar el entorno
RUN python3 -m venv /venv
RUN /venv/bin/pip install --no-cache-dir -r requirements.txt

# Establecer la variable de entorno para usar el entorno virtual
ENV PATH="/venv/bin:$PATH"

# Exponer el puerto 8000 para acceder a la aplicación Django
EXPOSE 8000

# Comando para iniciar el servidor de desarrollo de Django
CMD ["python", "manage.py", "runserver", "0.0.0.0:8000"]
