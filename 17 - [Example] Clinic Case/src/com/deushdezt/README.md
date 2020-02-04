# Indicaciones

## Contexto

Su jefe ha visto en usted un alto pontencial para aportar valor a su empresa; el ha iniciado un nuevo proyecto 
y desea poner a disposición de todos los miembros de la empresa una clínica, para asegurar la salud y el bienestar 
de todos sus empleados. Le ha solicitado a usted que cree la primera versión de un sistema para gestionar dicha clínica,
el cual deberá llevar el control de los medicos asignados, lo pacientes que asisten y su historial clínico.k



Su jefe ha visto en usted un alto pontencial para aportar valor a su empresa; el ha iniciado un nuevo proyecto y desea poner a disposición de todos los miembros de la empresa una clínica, para asegurar la salud y el bienestar de todos sus empleados. Le ha solicitado a usted que cree la primera versión de un sistema para gestionar dicha clínica, el cual deberá llevar el control de los medicos asignados, lo pacientes que asisten y su historial clínico.

## Estructura básica

Cree dos paquetes **controllers** y **models**. Recuerde trabajar con los estándares y convenciones de nombres tanto de clases como de atributos.

## Modelos
Dentro del paquete "models" realice lo siguiente:

* Cree una clase Person, la cual contendrá los siguientes atributos:
    * Id -> String
    * Age -> int
    * Firstname -> String
    * Lastname -> String
    * Gender -> char ('M' o 'F')
    
    Todos los atributos deben tener tipo de acceso privado; además cada uno de ellos deben poseer su respectivo "setter" y "getter".
    
    Cree dos contructores de clase. Uno habrá que dejarlo como el constructor por defecto, y el otro que se encargue de asignar todos los atributos de la clase.
    
    Por último, genere los siguientes métodos, "toString", "hashCode" y "equals".
    * El método toString sirve para listar los atributos de un objeto con su respectivo valor. 
    * El método equals compara dos objetos con respecto a un atributo. Sobreescríbalo de tal forma que lo compare con respecto al id de los objetos.
    
    **Sugerencia**: Utilice la ayuda del IDE para auto generar estos últimos métodos
    
* Cree una clase Patient, la cual heredará de Person, y contendrá los siguientes atributos:
    * InsuraceCode -> String
    
    Este atributo corresponde al número de seguro médico, el cual posee el siguiente formato "SXXX-XXX".
    
    De igual forma se deben crear los "setters" y "getters", un constructor por defecto, y un constuctor con todos los atributos;
    este último debe recibir tanto los atributos de la clase Person, como los atributos de Patient.
    
    **Sugerencia**: Buscar la referencia sobre la palabra reservada "super", y su uso.
    
    Por último sobreescriba el método toString y concatene al resultado del método del padre, los nuevos atributos.
    
* Por último, cree una clase Doctor, la cual, de igual forma, heredará de la clase Person, y contendrá los siguientes atributos:
    * DoctorCode -> String
    * Specialty -> String
    
    El código médico posee el siguiente formato "MXXX".
    
    Los métodos implementados en la clase pasada, se deben incluir en esta de la misma forma.
    
    **Observación**: Al momento de asignar los códigos tanto de Doctor como de Patient, valide que el formato sea correcto. Sugerencia: Bascar la referencia de "Regex" en Java y su uso.
    
## Controladores 

Cree dentro del paquete de controladores dos clases extras, las cuales representarán los controladores para las entidades de Doctor y Patient.

Estas deberán ser identificadas con el nombre de la entidad que representan en plural, por ejemplo "Doctors".

Ambos controladores deberán de cumplir con los siguientes requerimientos:
* Guardar una cantidad indefinida de entidades en una Colección
* Tener un método que reciba los datos de una entidad, cree un objeto con estos datos, y lo almacene en la colección.
* Tener un método que dado el código de una entidad, retorne este registro dentro de la colección.
* Tener un método que dado el código de una entidad, elimine este registro de la colección.
* Por último, un método que reciba, de igual forma, el código de la entidad y, al ser ubicada dentro de la colección, modifique los valores de los atributos de la misma con nuevos datos.

## Menú 

Dentro del paquete principal del programa se debe crear una clase llamada Menú, la cual contendrá un método estático que mostrará al usuario una serie de opciones, este podrá seleccionar una opción, y de acuerdo 
a esta se realizarán acciones dentro del programa; las opciones que deberá tener el menú son las siguientes:

* Manage Doctors
* Manage Patients
* Exit

Si el usuario selecciona cualquiera de las primeras dos opciones, se deberá desplegar un Submenú, el cual contedrá 
las siguientes opciones:
* Agregar \<Entidad\>
* Buscar \<Entidad\>
* Eliminar \<Entidad\>
* Modificar \<Entidad\>
* Mostrar todas las \<Entidades\>

