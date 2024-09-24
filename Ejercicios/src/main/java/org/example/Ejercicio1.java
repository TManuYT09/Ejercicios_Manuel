package org.example;

//Realizar un programa que pida un número al usuario, que deberá introducirlo usando el teclado.
// El algoritmo debe identificar si el número introducido se trata de un número positivo (> 0)
// o un número negativo (< 0) y controlar el caso particular del número 0, que es natural.

import java.util.Scanner;

public class Ejercicio1 {
    public void ejercicio1(){
        System.out.println("Introduce un número...");
        Scanner entrada = new Scanner (System.in);
        int numero = entrada.nextInt();
        if (numero>0){
            System.out.println("El número es positivo.");
        }else{
            if (numero==0){
                System.out.println("El número es 0.");
            }else{
                System.out.println("El número es negativo.");
            }
        }
    }
}