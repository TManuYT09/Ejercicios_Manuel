package org.example;

import java.util.Scanner;

public class Ejercicio23 {
    public void ejercicio23(){
        System.out.println("Introduce un numero");
        Scanner entrada=new Scanner(System.in);
        String num1= entrada.next();
        System.out.println("Introduce el numero de caracteres que quieres quitar");
        int num2= entrada.nextInt();
        System.out.println(num1.substring(0,num1.length()num2));
    }
}
