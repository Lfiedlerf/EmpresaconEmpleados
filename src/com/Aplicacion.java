package com;

import com.clases.Director;
import com.clases.Empleado;
import com.clases.Gerente;

public class Aplicacion {
    public static void main(String[] args) {
        // Crear objetos de cada tipo
        Empleado empleado = new Empleado("Ludvig Perez", 101, 15.5);
        Gerente gerente = new Gerente("Maria Antonieta Gomez", 102, 25.0, 3000.0);
        Director director = new Director("Kvothe Elir", 103, 30.0, 5000.0, 10000.0);

        // Mostrar información de cada uno
        empleado.mostrarInformacion();
        gerente.mostrarInformacion();
        director.mostrarInformacion();
    }
}
