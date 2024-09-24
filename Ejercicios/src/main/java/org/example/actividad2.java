package org.example;

import java.util.Scanner;

public class Actividad2 {

    public void ejecutar(){
        System.out.println("¿Cómo te llamas?");

        Scanner entrada = new Scanner (System.in);
        String nombre = entrada.next();

        System.out.println("¿A que curso vas?");
        String curso = entrada.next();

        System.out.println("Hola "+nombre+", bienvenido a "+curso+".");

        int num1 = 0;
        int num2 = 0;

        while(num1==0 || num2==0){
            System.out.println("Introduce un número");
            num1 = entrada.nextInt();

            System.out.println("Introduce otro número");
            num2 = entrada.nextInt();

            if (num1==0 || num2==0){
                System.out.println("ERROR. Los números no puede ser 0.");
            }
        }
        int resultado = num1 + num2;
        System.out.println("El resultado de sumar los dos numeros es: " + resultado);
    }
}
