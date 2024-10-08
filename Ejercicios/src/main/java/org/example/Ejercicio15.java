package org.example;

// Realizar un programa para calcular el mínimo de 3 números diferentes leídos desde teclado.
// En caso de que el usuario introduzca dos o tres números iguales, informaremos con el siguiente mensaje:
// "ERROR: hay números introducidos que son iguales".

import java.util.Scanner;

public class Ejercicio15 {
    public void ejercicio15(){
        Scanner entrada=new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        while (num1==num2 || num1==num3 || num2==num3){
            System.out.println("Introduce el primer número");
            num1 = entrada.nextInt();
            System.out.println("Introduce el segundo número");
            num2 = entrada.nextInt();
            System.out.println("Introduce el tercer número");
            num3 = entrada.nextInt();
            if (num1==num2 || num1==num3 || num2==num3){
                System.out.println("ERROR: hay números introducidos que son iguales");
            }
        }
        if (num1 < num2 && num1 < num3){
            System.out.println("El primer número introducido es el menor");
        }else {
            if (num2 < num1 && num2 < num3){
                System.out.println("El segundo número introducido es el menor");
            }else {
                System.out.println("El tercer número introducido es el menor");
            }
        }
    }
}
