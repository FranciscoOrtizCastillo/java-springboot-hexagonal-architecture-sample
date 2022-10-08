# Implementación de arquitectura hexagonal con Java


            Primary / Driving Side                 |                Secondary / Driven Side 
                                                   |  

    Input                Input                                         Output        Output
    Adapter    --->      Ports     <------    Aplicación       ------> Ports <------ Adapter
               (Usa)                        ( Casos de uso )     (Usa)          (implementa)
                                                   |
                                                   |
                                                   |
                                                   V
                                                Dominio



Los Ports siempre son interfaces.

## Notas

```bash

mkdir -p src/{main,test}/{java,resources}

sudo docker-compose up

psql -h 127.0.0.1 -U postgres postgres

sudo docker-compose down

#postgres-# \dt
#No se encontró ninguna relación.

#Instalar maven
sudo apt-get -y install maven

mvn clean spring-boot:run

# Se crean las tablas en la BD :
postgres=# \dt
         Listado de relaciones
 Esquema |  Nombre  | Tipo  |  Dueño   
---------+----------+-------+----------
 public  | customer | tabla | postgres
 public  | orders   | tabla | postgres




curl -X POST http://127.0.0.1:8080/customer/create -d "name=prueba&country=ES"
# {"id":"1d69d24e-e47c-4c74-8975-7542223be692","name":"prueba","country":"ES"}     



postgres=# select * from customer;
                  id                  |  name  | country 
--------------------------------------+--------+---------
 1d69d24e-e47c-4c74-8975-7542223be692 | prueba | ES

```
