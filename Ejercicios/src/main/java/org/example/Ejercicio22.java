package org.example;

import java.util.Scanner;

public class Ejercicio22 {
    public void ejercicio22(){
        System.out.println("Introduce una cadena de texto");
        Scanner entrada=new Scanner(System.in);
        String t1 = entrada.nextLine();
        System.out.println("Introduce una cadena de texto");
        String t2 = entrada.nextLine();
        if (t1.length()>t2.length()){
            System.out.println("El primer texto introducido es quien tiene más caracteres");
        }else {
            System.out.println("El segundo texto introducido es quien tiene más caracteres");
        }
    }
}
