package com.uped.proyecto;

import com.uped.proyecto.modelo.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== MÓDULO PROYECTO: JERARQUÍA DE PERSONAS ===");

        Persona[] personas = {
                new Cliente("Ana López", "04512378-9", "7777-1111", 4000.0),
                new Empleado("Carlos Gómez", "01234567-8", 800.0),
                new Estudiante("Luis Hernández", "09876543-2", "20240001", "Ing. de Sistemas", 9.1),
                new Docente("Dra. Beatriz Peña", "03456789-1", "Programación", 10),
                new Voluntario("Marcos Solís", "08123456-5", "Reforestación", 40),
                new Gerente("Marta Díaz", "05123456-7", 1200.0, 5)
        };

        for (Persona p : personas) {
            System.out.println(p.presentarse() + " | Beneficio Anual: $" + p.calcularBeneficioAnual());
        }
    }
}