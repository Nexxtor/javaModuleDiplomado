# Indicaciones
## Estructura básica

Cree dos paquetes con los nombres "controllers" y "models". Recuerde trabajar con los estándares y convenciones de nombres tanto de clases como de atributos.

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
    
* Por último, cree una clase Medic, la cual, de igual forma, heredará de la clase Person, y contendrá los siguientes atributos:
    * MedicCode -> String
    * Specialty -> String
    
    El código médico posee el siguiente formato "MXXX".
    
    Los métodos implementados en la clase pasada, se deben incluir en esta de la misma forma.
    
    **Observación**: Al momento de asignar los códigos tanto de Medic como de Patient, valide que el formato sea correcto. Sugerencia: Bascar la referencia de "Regex" en Java y su uso.