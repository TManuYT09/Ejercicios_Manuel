package org.example;

import java.util.Scanner;

public class Recusividad2 {
    static int num;
    public static void main(String[] args){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduzca un numero:");
        num=entrada.nextInt();
        resultado(1);
    }
    public static void resultado(int m){
        if (m<=num){
            System.out.println(m);
            resultado(m+1);
        }
    }
}
