package org.example;

//Traduce el siguiente diagrama de flujo Java:

import java.util.Scanner;

public class Ejercicio4 {
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
}
