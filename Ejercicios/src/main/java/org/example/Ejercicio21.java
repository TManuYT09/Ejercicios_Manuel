package org.example;

import java.util.Scanner;

public class Ejercicio21 {
    public void ejercicio21(){
        System.out.println("INTRODUCE UNA PALABRA O FRASE");
        Scanner entrada=new Scanner(System.in);
        String texto=entrada.next();
        String m1=texto.substring(0,texto.length()/2);
        String m2=texto.substring(texto.length()/2);

        System.out.println(texto);
        System.out.println(texto.length());
        System.out.println(texto.replace(" ",""));
        System.out.println("Primera mitad del texto es "+ m1 +" y la segunda mitad del texto es: "+ m2);
        System.out.println(m1.concat(m2));
        System.out.println(texto.toUpperCase());
    }
}
