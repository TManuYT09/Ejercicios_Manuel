package org.example;

import java.util.Scanner;

public class Bateria1Tema4 {
    public static void principal(){
        Scanner entrada=new Scanner(System.in);

        System.out.println("Introduzca un numero: ");
        int num=entrada.nextInt();
        int resultado=calculo(num);
        System.out.println("El resultado es "+resultado);
    }
    public static int calculo(int num){
        int resultado=num;
        for (int i = 1; i < 3; i++) {
            resultado=resultado*num;
        }
        return resultado;
    }
}
