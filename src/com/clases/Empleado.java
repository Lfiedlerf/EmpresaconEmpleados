package com.clases;

public class Empleado {
    // Atributos
    private String nombre;
    private int id;
    private double salarioBase;

    // Constructor
    public Empleado(String nombre, int id, double salarioBase) {
        this.nombre = nombre;
        this.id = id;
        this.salarioBase = salarioBase;
    }

    // Método para calcular salario total
    public double calcularSalarioTotal() {
        return salarioBase * 160; // suponiendo 160 horas al mes
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("Empleado: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Salario Base: " + salarioBase);
        System.out.println("Salario Total: " + calcularSalarioTotal());
        System.out.println("-----------------------------");
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
}
