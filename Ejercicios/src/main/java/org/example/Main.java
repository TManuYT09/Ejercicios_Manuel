package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        Ejercicio1 ejercicio1 = new Ejercicio1();
        Ejercicio2 ejercicio2 = new Ejercicio2();
        Ejercicio3 ejercicio3 = new Ejercicio3();
        Ejercicio4 ejercicio4 = new Ejercicio4();
        Ejercicio5 ejercicio5 = new Ejercicio5();
        Ejercicio6 ejercicio6 = new Ejercicio6();
        System.out.println("1.- Ejercicio 1");
        System.out.println("2.- Ejercicio 2");
        System.out.println("3.- Ejercicio 3");
        System.out.println("4.- Ejercicio 4");
        System.out.println("5.- Ejercicio 5");
        System.out.println("6.- Ejercicio 6");
        System.out.println(" ");
        int ejercicio = entrada.nextInt();
        switch (ejercicio){
            case 1:ejercicio1.ejercicio1();break;
            case 2:ejercicio2.ejercicio2();break;
            case 3:ejercicio3.ejercicio3();break;
            case 4:ejercicio4.ejercicio4();break;
            case 5:ejercicio5.ejercicio5();break;
            case 6:ejercicio6.ejercicio6();break;
            default:System.out.println("ERROR. No existe el ejercicio "+ejercicio+".");
        }
//        Actividad_inicial actividad_inicial = new Actividad_inicial();
//        actividad_inicial.ejecutar();

//        Operadores operadores = new Operadores();
//        operadores.operadores();
//        operadores.asignacion();
//        operadores.comparacion();
//        operadores.logico();

    }
}