package org.example;

import java.util.Scanner;

public class Bateria3Tema4 {
    public static void principal(){
        Scanner entrada=new Scanner(System.in);
        String texto=entrada.nextLine();

        texto=textoMayusculas(texto);
        System.out.println(texto);

        int num=textoNumeros(texto);
        System.out.println(num);
    }
    public static String textoMayusculas(String texto){
        texto=texto.toUpperCase();

        return texto;
    }
    public static int textoNumeros(String texto){
        int numero=0;
        for (int i = 0; i < texto.length(); i++) {
            if(texto.substring(i,i+1).equals("A") || texto.substring(i,i+1).equals("E") || texto.substring(i,i+1).equals("I") || texto.substring(i,i+1).equals("O") || texto.substring(i,i+1).equals("U")){
                numero++;
            }
        }

        return numero;
    }
}
