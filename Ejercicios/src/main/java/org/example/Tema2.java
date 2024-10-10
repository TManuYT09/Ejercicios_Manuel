package org.example;

import java.util.Scanner;

public class Tema2 {
    public void ejercicio1(){
        System.out.println("INTRODUCE UNA PALABRA O FRASE");
        Scanner entrada=new Scanner(System.in);
        String texto=entrada.nextLine();
        String m1=texto.substring(0,texto.length()/2);
        String m2=texto.substring(texto.length()/2);

        System.out.println(texto);
        System.out.println(texto.length());
        System.out.println(texto.replace(" ",""));
        System.out.println("Primera mitad del texto es "+ m1 +" y la segunda mitad del texto es: "+ m2);
        System.out.println(m1.concat(m2));
        System.out.println(texto.toUpperCase());
    }
    public void ejercicio2(){
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
    public void ejercicio3(){
        System.out.println("Introduce un numero");
        Scanner entrada=new Scanner(System.in);
        String num1= entrada.next();
        System.out.println("Introduce el numero de caracteres que quieres quitar");
        int num2= entrada.nextInt();
        System.out.println(num1.substring(0,num1.length()-num2));
    }
    public void ejercicio4(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzce el texto");
        String texto = entrada.nextLine();
        texto=texto.toLowerCase();

        System.out.println("Introduce la palabra que quieres contar");
        String subcadena = entrada.nextLine();
        subcadena=subcadena.toLowerCase();

        String texto2 = texto.replace(subcadena, "");
        int num = (texto.length() - texto2.length())/subcadena.length();

        System.out.println("La subcadena "+ subcadena +" aparece "+ num +" veces.");

    }
    public void ejercicio5() {
        String j1 = "Jugador 1";
        String j2 = "Jugador 2";
        int intentos = 10;
        boolean terminar = true;

        System.out.println(j1 + " introduzca un cadena de texto");
        Scanner entrada = new Scanner(System.in);
        String cadena = entrada.nextLine();

        while (intentos != 0 && terminar == true){

            System.out.println(j2 + " introduzca una palabra");
            String palabra = entrada.next();
            if (cadena.contains(palabra) == false) {
                intentos = intentos - 1;
                if (intentos>=1){
                    System.out.println("Te quedan " + intentos + " intentos");
                }

            } else {
                System.out.println("¡Enhorabuena, has acertado una palabra!");
                terminar=false;
            }
        }
        if (intentos == 0){
            System.out.println("Lo siento, no has acertado ninguna palabra");
        }
    }
}
