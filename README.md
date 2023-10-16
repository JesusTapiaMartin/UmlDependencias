# ========== UML & Dependencia ==========
### Jesús Tapia Martin

### Análisis del diagrama
![Captura de pantalla 2023-10-15 225751](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/8565a1cc-3b50-4e69-aff6-f6978f25dd0a)


Razones
* Cada Vehículo funciona como una clase separada de la otra, esto debido a que cada uno presenta distintos atributos, comportamientos y métodos que los diferencian entre si.

  
* Tener las clases separadas para cada uno de los vehículos ayuda a mantener el orden, formato y buena práctica en la totalidad del proyecto, esto debido a que si se ocupase una única clase Vehículo,
  se generaría un código "Spaghetti", dificultando la legibilidad y futura mantención de esta única clase.


* La estructura del proyecto, facilita la reutilización del código, ahorrando mucho tiempo.

  
### Código entregado en base al diagrama
* Main

![Captura de pantalla 2023-10-15 235423](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/e21d5c0f-dd0c-413b-b6a7-645d47818721)


* Auto
  
![Captura de pantalla 2023-10-15 235509](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/fd400e8e-c334-4384-9733-5326409f04f5)
![Captura de pantalla 2023-10-15 235521](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/9f34d9ac-8c06-4e42-8dd9-6f8ed15a3e7a)


* Bici
  
![Captura de pantalla 2023-10-15 235509](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/46382cdf-0772-412a-b11a-4738d42183d6)
![Captura de pantalla 2023-10-15 235521](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/554b35c7-2eaf-4550-bcb0-01850a293b84)



* Persona
  
![Captura de pantalla 2023-10-15 235532](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/59d8c10e-40a9-4aee-955b-eefed4a9b7a1)
![Captura de pantalla 2023-10-15 235545](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/edb703b9-a858-4421-bcf2-e34286c3413b)



* Moto
  
![Captura de pantalla 2023-10-15 235558](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/643f2236-b414-4c47-bf1c-a2a717269edb)
![Captura de pantalla 2023-10-15 235614](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/a9e21f9a-ba9b-40c2-964a-fcc123af8d5d)




### Cambios y detalles del código
Los cambios respecto al código que nos da el VisualParadigm en base al diagrama de Clase
* [1] Revisar la estructura del código la cual es la correcta.
* [2] Añadír el código fuente a cada método y atributo de la Clase.
* [3] Conectar las clases haciendo los respectivos llamados a los métodos.
* [4] Control de expeciones y pruebas unitarias.


### Código final
* Main

![Captura de pantalla 2023-10-16 002453](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/3d26fe48-c8f0-4acc-9c71-bbb1600fe3b5)
![Captura de pantalla 2023-10-16 002520](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/e4543364-a6fe-418d-9e36-222ee5e74594)


* Persona

![Captura de pantalla 2023-10-16 002547](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/d3648cd2-63cf-4677-8d75-a1965e43ff49)
![Captura de pantalla 2023-10-16 002611](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/96db4fae-696f-4f70-8269-75728b95e830)
![Captura de pantalla 2023-10-16 002629](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/6a0a3360-e068-43ea-b947-a9ba5fc75fda)


* Auto
  
![Captura de pantalla 2023-10-16 002654](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/f39b7e4d-2dfd-47ce-a707-2f0ac70c1c37)
![Captura de pantalla 2023-10-16 002740](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/64b93d14-c537-4289-bf53-a64cb6ea027f)



* Moto

![Captura de pantalla 2023-10-16 002804](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/2bfc2981-c313-42b8-9ad4-596b866d7aa4)
![Captura de pantalla 2023-10-16 002818](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/ff855fd8-5c25-4ce6-97a2-deb3d83c17a2)


* Bici

![Captura de pantalla 2023-10-16 002840](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/e6330894-fad9-4db5-99fb-a60f25b5ef0a)
![Captura de pantalla 2023-10-16 002850](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/4001ef68-5417-41f1-ba6f-e186c3ba446e)



### Pruebas unitarias

* Test --> Clase Auto
  
![Captura de pantalla 2023-10-16 003017](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/75ddb8c3-636a-402b-a692-10d34051e36e)


* Test --> Clase Moto
  
 ![Captura de pantalla 2023-10-16 003039](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/2a6be235-d2c1-4b65-b289-18415b18f936)


* Test --> Clase Bici

![Captura de pantalla 2023-10-16 003107](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/5c1cd811-af53-493e-9a65-606db95156bb)



### Relaciones de Dependencia
En el programa la clase Persona, funciona como el puente que une a todas las Clases, esta depende de  todas las otras 
para funcionar. Esto hace sentido, ya que es la Persona quien maneja y controla la información sobre todos los Vehículos.

Además la Clase Persona es utilizada por la Clase Main.

* [1] En este caso la Clase Persona instancia un objeto de cada Clase, para poder usarlo como parámetro en los métodos para estimar el tiempo.

![Captura de pantalla 2023-10-16 003745](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/38d6f011-5b3c-4a2e-9fb3-5cddbc691c66)



* [2] Se recibe como parámetro el nombre que ingresa el Usuario, el cual es un atributo de un ojeto tipo Persona.

![Captura de pantalla 2023-10-16 003842](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/0f674358-3d34-4b0a-8a4d-65faeb252ce1)



* [3] El método Menu depende de todas las funcionalidades presente en la Clase Persona, ya que es esta clase la que maneja toda la información.

![Captura de pantalla 2023-10-16 003924](https://github.com/JesusTapiaMartin/UmlDependencias/assets/142464450/e6532685-9e39-4131-8a3d-b0d3e3ba9ad8)








