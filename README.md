# Empresa con Empleados

Este proyecto es una actividad evaluada de Java, cuyo objetivo es
aplicar los conceptos de **herencia** en la programación orientada a
objetos.

## Objetivos

-   Comprender y aplicar el concepto de herencia en POO.
-   Practicar la creación de clases base y clases derivadas.
-   Implementar constructores y métodos en las clases derivadas para
    extender o sobrescribir comportamientos.
-   Reforzar el encapsulamiento y la reutilización de código.

## Estructura del proyecto

    EmpresaConEmpleados
     └── src
         ├── com
         │   └── Aplicacion.java
         └── com.clases
             ├── Empleado.java
             ├── Gerente.java
             └── Director.java

## Clases principales

### Empleado

-   Atributos: nombre, id, salarioBase.
-   Método `calcularSalarioTotal`: salarioBase \* 160.
-   Método `mostrarInformacion`: imprime los datos y salario total.

### Gerente (hereda de Empleado)

-   Nuevo atributo: bono.
-   Sobrescribe `calcularSalarioTotal`: salarioBase + bono.
-   Método `mostrarInformacion`: imprime datos de gerente.

### Director (hereda de Gerente)

-   Nuevo atributo: acciones.
-   Sobrescribe `calcularSalarioTotal`: salarioBase + bono + acciones.
-   Método `mostrarInformacion`: imprime datos de director.

## Ejemplo de salida en consola

    Empleado: Ludvig Perez
    ID: 101
    Salario Base (hora): 15.5
    Salario Total (mensual): 2480.0
    -----------------------------
    Gerente: Maria Antonieta Gomez
    ID: 102
    Salario Base (mensual): 7000.0
    Bono: 3000.0
    Salario Total (mensual): 10000.0
    -----------------------------
    Director: Kvothe Elir
    ID: 103
    Salario Base (mensual): 10000.0
    Bono: 5000.0
    Acciones: 8000.0
    Salario Total (mensual): 23000.0
    -----------------------------

## Cómo ejecutar

1.  Clonar el repositorio:

    ``` bash
    git clone https://github.com/Lfiedlerf/EmpresaconEmpleados.git
    ```

2.  Importar el proyecto en **Spring Tool Suite** o **Eclipse**.

3.  Ejecutar la clase `Aplicacion.java`.

## Autor

Proyecto desarrollado como parte de la actividad evaluada
**M4_AE6_ABP-Ejercicio individual**.
