package com.clases;

public class Director extends Gerente {
    private double acciones;

    // Constructor
    public Director(String nombre, int id, double salarioBase, double bono, double acciones) {
        super(nombre, id, salarioBase, bono);
        this.acciones = acciones;
    }

    // Sobrescribir método para calcular salario total
    @Override
    public double calcularSalarioTotal() {
        return (getSalarioBase() * 160) + acciones;
    }

    // Método para mostrar información
    @Override
    public void mostrarInformacion() {
        System.out.println("Director: " + getNombre());
        System.out.println("ID: " + getId());
        System.out.println("Salario Base: " + getSalarioBase());
        System.out.println("Acciones: " + acciones);
        System.out.println("Salario Total: " + calcularSalarioTotal());
        System.out.println("-----------------------------");
    }
}
