package org.example;

import java.time.LocalDateTime;
import java.util.InputMismatchException;
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
    public void ejercicio5(){
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
                intentos -=  1;
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
    public void actividad1(){
        Scanner entrada = new Scanner(System.in);
        LocalDateTime hoy = LocalDateTime.now();
        int anyo_actual = hoy.getYear();

        System.out.println("Elige el modo del programa");
        int modo = 0;
        boolean comp = true;
        while (comp){
            try{
                modo = entrada.nextInt();
                comp = false;
            }catch (InputMismatchException err){
                System.out.println("Introducción erronea del modo debido a caracteres no deseados: "+ err);
                entrada.nextLine();
            }
        }
        int anyo = 1800;

        switch (modo){
            case 1:
                System.out.println("Introduzca tu año de nacimiento");
                String ano = entrada.next();

                try{
                    anyo = Integer.parseInt(ano);
                }catch (NumberFormatException e){
                    System.out.println("Has introducido un formato erróneo. No es un número.");
                }

                if (anyo<1900||anyo>anyo_actual){
                    System.out.println("El año introducido no es corrector");
                }else if (anyo >= 1900 && anyo <= 1927){
                        System.out.println("Tu generazión no fue bautizada");
                }else if (anyo >= 1928 && anyo <= 1944){
                    System.out.println("Tu generación es Silent");
                }else if (anyo >= 1945 && anyo <= 1964){
                    System.out.println("Tu generación es Baby Boomers");
                }else if (anyo >= 1965 && anyo <= 1981){
                    System.out.println("Tu generación es X");
                }else if (anyo >= 1982 && anyo <= 1994){
                    System.out.println("Tu generación es Y/Milennial");
                }else if (anyo >= 1995 && anyo <= anyo_actual){
                    System.out.println("Tu generación es Z/Centennials");
                }else {
                    System.out.println("No eres de ninguna generación");
                }

                break;
            case 2:
                System.out.println("Introduzca su edad:");
                int edad = 0;

                if (entrada.hasNextInt()){
                    edad = entrada.nextInt();
                }else {
                    System.out.println("La edad introducida no tiene un formato válido");
                }

                if (edad < 0){
                  System.out.println("La edad introducida no es válida.");
                }else {
                     anyo = anyo_actual - edad;
                    System.out.println("Naciste en el "+ anyo);
                }

                if (anyo<1900||anyo>anyo_actual){
                    System.out.println("El año introducido no es corrector");
                }else if (anyo >= 1900 && anyo <= 1927){
                    System.out.println("Tu generazión no fue bautizada");
                }else if (anyo >= 1928 && anyo <= 1944){
                    System.out.println("Tu generación es Silent");
                }else if (anyo >= 1945 && anyo <= 1964){
                    System.out.println("Tu generación es Baby Boomers");
                }else if (anyo >= 1965 && anyo <= 1981){
                    System.out.println("Tu generación es X");
                }else if (anyo >= 1982 && anyo <= 1994){
                    System.out.println("Tu generación es Y/Milennial");
                }else if (anyo >= 1995 && anyo <= anyo_actual){
                    System.out.println("Tu generación es Z/Centennials");
                }else {
                    System.out.println("No eres de ninguna generación");
                }

                break;
            default:System.out.println("El modo "+ modo +" no existe.");
        }
    }
}
