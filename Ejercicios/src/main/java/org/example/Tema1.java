package org.example;

//Realizar un programa que pida un número al usuario, que deberá introducirlo usando el teclado.
// El algoritmo debe identificar si el número introducido se trata de un número positivo (> 0)
// o un número negativo (< 0) y controlar el caso particular del número 0, que es natural.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tema1 {
    public void ejercicio1(){
        int comp = 1;
        int numero = 0;

        while (comp == 1){
            System.out.println("Introduce un número...");
            Scanner entrada = new Scanner (System.in);
            try {
                comp -= 1;
                numero = entrada.nextInt();
            } catch (NumberFormatException | InputMismatchException e) {
                comp += 1;
                System.out.println("Introduce un número válido.");
            }
        }

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
    public void ejercicio2(){
        System.out.println("Introduce un número:");
        Scanner entrada=new Scanner(System.in);
        int num1=entrada.nextInt();
        System.out.println("Introduce otro número:");
        int num2=entrada.nextInt();
        if (num1==num2){
            System.out.println("ERROR: los números introducidos son iguales.");
        } else{
            if (num1 > num2){
                System.out.println("El primer número introducido es mayor.");
            } else {
                System.out.println("El segundo número introducido es mayor");
            }
        }
    }
    public void ejercicio3(){
        System.out.println("Introduce el divisor");
        Scanner entrada=new Scanner(System.in);
        int divisor=entrada.nextInt();
        System.out.println("Introduce el cociente");
        int cociente=entrada.nextInt();
        if (cociente==0){
            System.out.println("ERROR: no se puede dividir entre 0");
        }else {
            System.out.println(divisor +" / "+ cociente +" = "+ divisor/cociente);
        }
    }
    public void ejercicio4(){
        Scanner entrada=new Scanner(System.in);
        int b = -1;
        int h = -1;
        int A = 0;
        while (b < 0) {
            System.out.println("Introduce la base");
            b = entrada.nextInt();
            if (b < 0) {
                System.out.println("El valor de la base tiene que ser positivo");
            }
        }
        while (h < 0){
            System.out.println("Introduce la altura");
            h = entrada.nextInt();
            if (h < 0){
                System.out.println("El valor de la altura tiene que ser positivo");
            }
        }
        A = (b*h)/2;
        System.out.println("El área del triangulo es "+ A);
    }
    public void ejercicio5(){
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
    public void ejercicio6(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("¿Tienes tomates?");
        boolean tomate=entrada.nextBoolean();
        System.out.println("¿Tienes aceite?");
        boolean aceite=entrada.nextBoolean();
        System.out.println("¿Tienes jamón?");
        boolean jamon=entrada.nextBoolean();
        if (!tomate || !aceite || !jamon){
            System.out.println("¡Tenemos que ir a comprar!");
        }else{
            System.out.println("¡No tenemos que ir a comprar!");
        }
    }
}