# Diseccionando un examen
El objetivo de esta práctica es **realizar paso a paso los diferentes ejercicios de un examen.**

![image](https://github.com/profeMelola/Programacion-04-2023-24/assets/91023374/ab67a0e9-7659-4516-829f-3c6581f69f99) ![image](https://github.com/profeMelola/Programacion-04-2023-24/assets/91023374/55ec1193-b823-403b-aada-f4f75c987c0e)



Comprobaremos cómo dividiendo el problema en problemas más sencillos podemos resolverlo.

También iremos detectando **problemas que se pueden resolver por "imitación"** aplicando los conceptos aprendidos en clase en ejercicios similares.

Finalmente nos daremos cuenta que dichos ejercicios eran más fácil de solucionar de lo que en un principio nos pueda parecer.

Vamos a aprender estrategias para en un ambiente hostil, como es un examen, podamos salir victoriosos!!!!

![image](https://github.com/profeMelola/Programacion-04-2023-24/assets/91023374/0d2b8014-ce1b-42fa-8506-072a2853934f)

# EJERCICIO 1: manipular información de un array de String
Vamos a partir del siguiente array de cadenas que contiene información de matrículas de alumnos:

```
String[] matriculas = {
            "Ana,11111111A,18,6,GM",
            "Juan,11111111B,25,3,GS",
            "Sonia,22222222A,42,6,GS",
            "Pepe,22222222B,21,2,Gm",
            "Lucas,11111111B,32,2,gs",
            "Lola,33333333B,32,4,gs",
            "Lucas,33333333B,32,2,gs",};
```

Cada cadena está compuesta por: 
- nombre del alumno.
- su DNI
- su edad
- el número de módulos en los que se ha matriculado
- el ciclo (Grado Medio: GM, Grado Superior: GS).


Para poder realizar las tres métodos que se detallan a continuación es necesario procesar cada una de las cadenas para **diseccionar** la información y clasificarlas en diferentes arrays unidimensionales (vectores), ya que los métodos van a recibir dicha información en ese formato.

En el caso de que no supieras hacerlo, se daba la opción de crear dichos arrays a mano (con la siguiente penalización lógicamente). Tal que así:

```
  String[] nombres = {"Ana","Juan","Sonia","Pepe","Lucas"};
  String[] dnis = {"11111111A","11111111B","22222222A","22222222B","11111111A"};
  String[] edades = {"18","25","42","21","32"};
  String[] numModulos = {"6","3","6","2","2"};
  String[] ciclos = {"GM","GS","Gm","gs"};
```
o directamente haciendo la conversión a entero de los datos numéricos

```
  String[] nombres = {"Ana","Juan","Sonia","Pepe","Lucas"};
  String[] dnis = {"11111111A","11111111B","22222222A","22222222B","11111111A"};
  int[] edades = {18,25,42,21,32};
  int[] numModulos = {6,3,6,2,2};
  String[] ciclos = {"GM","GS","Gm","gs"};
```

## Comprobar DNIs repetidos (comprobarDNIs)
Debes implementar un método estático privado en base a los siguientes requisitos:

- Comprueba si hay DNIs repetidos y si es así, devuelve la posición del primer DNI repetido que encuentre.
- Recibe como argumento un array unidimensional con los DNIs.
- Debe devolver la posición del primer DNI encontrado o -1 en caso de que no haya repetidos.

### Ejemplo de salida por consola:
```
1. El primer DNI repetido es: 11111111B
```

## Obtener la edad media de los alumnos (obtenerEdadMedia)
Debes implementar un método estático privado en base a los siguientes requisitos:

- Calcula la edad media de todos los alumnos matriculados.
- Recibe como argumento un array con las edades.
- Debe devolver la edad media sin decimales, con redondeo por defecto.

### Ejemplo de salida por consola:
```
2. La edad media de los alumnos matriculados es: 29
```


## Obtener nombre del alumno que ha pagado mayor importe por la matrícula (obtenerNombreAlumnoMayorImporte)
Debes implementar un método estático privado en base a los siguientes requisitos:

- Obtiene el nombre del alumno que ha pagado más por la matrícula, teniendo en cuenta que la matrícula de un módulo en GS son 70 euros y en GM son 50 euros.
- Tú decides los argumentos.
- Obligatoriamente debe devolver una cadena con el nombre del alumno.

### Ejemplo de salida por consola:
```
3. El nombre del alumno que ha pagado más por la matrícula es: Sonia
```


