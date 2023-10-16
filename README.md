# ============ UML & Dependencia ============
### Jesús Tapia Martin

### Análisis del diagrama
![image](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/b8e6a4ea-4e92-43d4-bfc9-90cef2615afa)

Razones
* Cada Vehículo funciona como una clase separada de la otra, esto debido a que cada uno presenta distintos atributos, comportamientos y métodos que los diferencian entre si.

  
* Tener las clases separadas para cada uno de los vehículos ayuda a mantener el orden, formato y buena práctica en la totalidad del proyecto, esto debido a que si se ocupase una única clase Vehículo,
  se generaría un código "Spaghetti", dificultando la legibilidad y futura mantención de esta única clase.


* La estructura del proyecto, facilita la reutilización del código, ahorrando mucho tiempo.

  
### Código entregado en base al diagrama
* Main

![image](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/e013fdf1-77b7-4a50-a3e5-a78819a3f5a9)

* Auto
  
![image](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/fc0f5bf4-6ce1-4da4-9f50-2bb5b21a3253)
![image](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/fcbc64f1-caf9-4291-bd7c-47cff1d4c702)


* Bici
  
![image](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/e85bccbc-4cbd-4bfd-aedf-3c82125be2b8)
![image](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/1c1bdadb-f890-41b9-bf1b-cf2b59bc135c)


* Persona
  
![image](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/0d8529d2-e391-4178-9c15-16d4fc74ff5c)
![image](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/2a43f2e7-5da1-45c5-97e6-5b24ce21dbaf)


* Moto
  
![image](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/9dab6bba-0c41-490f-b3d0-1cf130fc9540)
![image](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/728ddb51-c297-4686-a0a3-34b41e2f6718)


### Cambios y detalles del código
Los cambios respecto al código que nos da el VisualParadigm en base al diagrama de Clase
* [1] Revisar la estructura del código la cual es la correcta.
* [2] Añadír el código fuente a cada método y atributo de la Clase.
* [3] Conectar las clases haciendo los respectivos llamados a los métodos.
* [4] Control de expeciones y pruebas unitarias.


### Código final
* Main

![image](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/e4708dbb-dce6-4782-ace6-59977a15afde)
![image](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/dea2111e-6f30-49a6-bb1b-e9bba804f3ab)

* Persona

![image](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/b40174ef-c1d0-4773-a9f9-ed0c410561a7)
![image](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/c1384604-9aa6-46b8-8e44-1d2e36fb94e3)
![image](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/b01dde29-5001-480c-aaca-59935861fb2c)

* Auto

![image](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/8adc78f3-9527-4741-8ad0-4e92d53807c1)
![image](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/249e5ab5-b600-4384-a820-e27719388525)

* Moto

![image](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/0a5d9367-ec46-40ea-8bfc-2ba477c56fe7)
![image](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/2cc40c81-4917-4e5c-93d9-c7b67e342e7e)

* Bici

![image](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/66c50ae6-86d5-47e7-a5aa-4584ad89c9c2)
![image](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/e27ef97c-448f-468b-be1f-4a8601633e4b)


### Pruebas unitarias

* Test --> Clase Auto
* 
![image](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/dd1607c3-89ea-4ba8-b045-67b27216ed7d)


* Test --> Clase Moto
 
![image](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/6f055301-24df-436b-9ab5-48a2333f7c4c)


* Test --> Clase Bici

![image](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/88b02bbc-1422-46dd-9b71-b427142b5285)


### Relaciones de Dependencia
En el programa la clase Persona, funciona como el puente que une a todas las Clases, esta depende de  todas las otras 
para funcionar. Esto hace sentido, ya que es la Persona quien maneja y controla la información sobre todos los Vehículos.

Además la Clase Persona es utilizada por la Clase Main.

* [1] En este caso la Clase Persona instancia un objeto de cada Clase, para poder usarlo como parámetro en los métodos para estimar el tiempo.

![image](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/ffd00be5-900e-436e-b50f-d19053db9ad8)


* [2] Se recibe como parámetro el nombre que ingresa el Usuario, el cual es un atributo de un ojeto tipo Persona.

![image](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/22b8c659-f691-4533-81f2-5c43207875ef)


* [3] El método Menu depende de todas las funcionalidades presente en la Clase Persona, ya que es esta clase la que maneja toda la información.

![image](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/b7a80e93-fef7-4e17-ab9f-1f78edff7059)








