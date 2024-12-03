package org.example;

import java.util.Scanner;

public class Bateria2Tema4 {
    public static void principal(){
        imprimirMenu();
        do {
            int opcion=elejirOpcion();
        }while (true);

    }
    public static void imprimirMenu(){
        for (int i = 0; i <= 5; i++) {
            if (i==5){
                System.out.println(i+".- Salir");
            }else {
                System.out.println(i+".- Opción "+i);
            }
        }
    }
    public static int elejirOpcion(){
        Scanner entrada=new Scanner(System.in);

        int opcion=entrada.nextInt();

        if (opcion==5){
            System.exit(0);
        }

        return opcion;
    }
}
