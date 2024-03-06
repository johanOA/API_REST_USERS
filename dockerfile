# Utiliza una imagen base que tenga soporte para MySQL, por ejemplo:
FROM mysql:latest

# Copia el archivo .sql al contenedor
COPY data.sql /docker-entrypoint-initdb.d/

# Otorga permisos al archivo .sql
RUN chown mysql:mysql /docker-entrypoint-initdb.d/data.sql

# Si es necesario, cambia los permisos del archivo .sql para que sea legible por el usuario MySQL
RUN chmod 644 /docker-entrypoint-initdb.d/data.sql
