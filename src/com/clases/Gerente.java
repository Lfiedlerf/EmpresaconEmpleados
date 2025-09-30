package com.clases;

public class Gerente extends Empleado {
    private double bono;

    // Constructor
    public Gerente(String nombre, int id, double salarioBase, double bono) {
        super(nombre, id, salarioBase);
        this.bono = bono;
    }

    // Sobrescribir método para calcular salario total
    @Override
    public double calcularSalarioTotal() {
        return (getSalarioBase() * 160) + bono;
    }

    // Método para mostrar información
    @Override
    public void mostrarInformacion() {
        System.out.println("Gerente: " + getNombre());
        System.out.println("ID: " + getId());
        System.out.println("Salario Base: " + getSalarioBase());
        System.out.println("Bono: " + bono);
        System.out.println("Salario Total: " + calcularSalarioTotal());
        System.out.println("-----------------------------");
    }
}
