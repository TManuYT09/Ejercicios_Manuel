package org.example;

import java.util.Scanner;

public class actividad2 {

    public void ejecutar(){
        System.out.println("¿Cómo te llamas?");

        Scanner entrada = new Scanner (System.in);
        String nombre = entrada.next();

        System.out.println("¿A que curso vas?");
        String curso = entrada.next();

        System.out.println("Hola "+nombre+", bienvenido a "+curso+".");

        System.out.println("Introduce un número");
        int num1 = entrada.nextInt();

        System.out.println("Introduce otro número");
        int num2 = entrada.nextInt();

        int resultado = num1 + num2;

        System.out.println("El resultado de sumar los dos numeros es: "+ resultado);
    }
}