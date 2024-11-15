# Usa una imagen base con Python
FROM python:3.12.7

# Establece el directorio de trabajo
WORKDIR /app

# Copia los archivos del proyecto
COPY . /app/

# Crea un entorno virtual
RUN python -m venv /venv

# Activa el entorno virtual e instala las dependencias
RUN /venv/bin/pip install -r requirements.txt

# Expón el puerto en el que Django escuchará
EXPOSE 8000

# Ejecuta el servidor de Django
CMD ["/venv/bin/python", "manage.py", "runserver", "0.0.0.0:8000"]
