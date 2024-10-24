package org.example;

import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Random;
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
            break;
            case 2:
                System.out.println("Introduzca su edad:");
                int edad = 0;
                boolean compo = false;

                if (entrada.hasNextInt()){
                    edad = entrada.nextInt();
                }else {
                    System.out.println("La edad introducida no tiene un formato válido");
                    compo = true;
                }

                if (!compo) {
                    if (edad < 0) {
                        System.out.println("La edad introducida no es válida.");
                    } else {
                        anyo = anyo_actual - edad;
                        System.out.println("Naciste en el " + anyo);
                    }
                }
            break;
            default:
                System.out.println("El modo introducido es erronero");
            break;
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
    }
    public void ejercicioAzul1(){
        System.out.println("Introduzca su altura (en cm):");
        Scanner entrada = new Scanner(System.in);
        int altura = 0;

        while (altura==0){
            try{
                altura = entrada.nextInt();
            }catch (InputMismatchException err){
                System.out.println("Error: "+ err);
                entrada.nextLine();
            }
        }

        if (altura <= 150){
            System.out.println("Persona de altura baja");
        }else if (altura >=151 && altura <=175) {
            System.out.println("Persona de altura media");
        }else if (altura >=176){
            System.out.println("Persona alta");
        }
    }
    public void ejercicioAzul2(){
        System.out.println("Introduzca un numero");
        Scanner entrada = new Scanner(System.in);
        int num = 0;
        boolean comp = true;

        while (comp){
            try{
                num = entrada.nextInt();
                comp = false;
            }catch (InputMismatchException err){
                System.out.println("Valor introducido no válido");
                entrada.nextLine();
            }
        }

        switch (num){
            case 1: System.out.println("Lunes");break;
            case 2: System.out.println("Martes");break;
            case 3: System.out.println("Miércoles");break;
            case 4: System.out.println("Jueves");break;
            case 5: System.out.println("Viernes");break;
            case 6: System.out.println("Sábado");break;
            case 7: System.out.println("Domingo");break;
            default: System.out.println("Nada");break;
        }
    }
    public void ternaria(){
        int a=1, b=2, c=4;
        int resultado = b++ == c && a++ > b ? b -= a :
                            c<10 && b>=a? c+=b :
                                    a==c ? b++ : b--;
    }
    public void bateria1(){
        Scanner entrada = new Scanner(System.in);
        String psw = "augusto";
        String contra;
        do {
            System.out.println("Introduce tu contraseña");
            contra = entrada.next();

        }while(!contra.equals(psw));

        System.out.println("BIENVENIDO. Contraseña correcta.");
    }
    public void bateria2(){
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.println("Introduzca un número");
        num = entrada.nextInt();
        for (int i=num;i>=1;i--){
            System.out.println(i);
        }
    }
    public void bateria3(){
        for(int i=1;i<=50;i++){
            if (i%3==0){
                System.out.println(i);
            }
        }
    }
    public void bateria4(){
        Scanner entrada=new Scanner(System.in);
        String texto=entrada.nextLine();
        for (int i=0;i<texto.length();i++){
            System.out.println(texto.substring(i,i+1));
        }
    }
    public void bateria5(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int num=entrada.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(num+" x "+i+" = "+ num*i);
        }
    }
    public void bateria6(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cuántos números quieres sumar?:");
        int num = entrada.nextInt();
        int temp;
        int tot = 0;
        for (int i=1;tot!=num;i++){
            System.out.println("Inserta nº"+i);
            temp=entrada.nextInt();
            tot = tot+temp;
        }
        System.out.println("El resultado es: "+tot);
    }
    public void bateria7(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int num = entrada.nextInt();
        int tot=1;
        for (int i=num;i>0;i--){
            tot = tot*i;
        }
        System.out.println("El resultado es = "+ tot);
    }
    public void bateria8(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un texto:");
        String texto = entrada.nextLine();
        String otxet = "";
        for (int i=texto.length();i>0;i--){
            otxet = otxet+texto.substring(i-1,i);
        }
        System.out.println(otxet);
    }
    public void random1(){
        Random random = new Random();
        int dado1 = random.nextInt(6)+1;
        int dado2 = random.nextInt(6)+1;
        System.out.println("Los numeros son el "+ dado1 +" y el "+dado2);
        System.out.println("Has sacado un "+ (dado1+dado2));
    }
    public void random2(){
        Random random = new Random();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String contrasena="";
        int num=0;
        String letra;
        for (int i=random.nextInt(100);i>0;i--){
            num=random.nextInt(caracteres.length())+1;
            letra=caracteres.substring(num-1,num);
            contrasena=contrasena+letra;
        }
        System.out.println("Tu nueva contraseña es: "+contrasena);
    }
    public void random3(){
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Dime un numero");
        int nummin=entrada.nextInt();
        System.out.println("Dime otro numero");
        int nummax=entrada.nextInt();
        int ale=0;
        if (nummin <= nummax){
            System.out.println("Cuandos numeros quieres que salgan por pantalla");
            int num = entrada.nextInt();
            for(int i=num;i>0;i--){
                ale=random.nextInt(nummax-nummin+1)+nummin;
                System.out.println(ale);
            }
        }else {
            System.out.println("ERROR. El primer numero introducido es mayor que el segundo");
        }
    }
    public void random4(){
        Random random = new Random();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String contrasena="";
        int num=0;
        String letra;
        for (int i=random.nextInt(6,9);i>0;i--){
            num=random.nextInt(caracteres.length())+1;
            letra=caracteres.substring(num-1,num);
            contrasena=contrasena+letra;
        }
        System.out.println("Tu nueva contraseña es: "+contrasena);
    }
    public void bateriapre1(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca cuantas veces quiere meter numeros:");
        int cantidad = entrada.nextInt();
        int num;
        int mayor=0;
        int menor=0;
        int cero=0;
        for (int i=cantidad;i!=0;i--){
            System.out.println("Introduzca un numero");
            num=entrada.nextInt();
            if (num>0){
                mayor=mayor+1;
            }else {
                if (num<0){
                    menor=menor+1;
                }else {
                    cero=cero+1;
                }
            }
        }
        System.out.println(mayor+" mayor que 0");
        System.out.println(menor+" menor que 0");
        System.out.println(cero+" iguales que 0");
    }
    public void bateriapre2(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int num1=entrada.nextInt();
        int num2;
        do {
            System.out.println("Introduzca otro numero");
            num2=entrada.nextInt();
            if (num2<0){
                System.out.println("ERROR: no se permiten negativos");
            }
        }while (num2<0);
        int resultado = 1;
        if (num2==0){
            resultado=1;
        }else {
            for (int i=num2;i!=0;i--){
                resultado=resultado*num1;
            }
        }
        System.out.println("El resultado es: "+resultado);

    }
    public void bateriapre3(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("¿Cuantos meses financió?");
        int mes=entrada.nextInt();
        System.out.println("Financiación a "+mes+" meses");
        int cant=10;
        int tot=0;
        for (int i=1;i<=mes;i++){
            System.out.println("Mes "+i+": "+cant+"€");
            tot=tot+cant;
            cant=cant*2;
        }
        System.out.println("Total a pagar: "+tot+"€");
    }
    public void bateriapre4(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Meta su nota");
        double nota=entrada.nextDouble();
        String notat=String.valueOf(nota);
        int notat1= notat.indexOf(".");
        String dect = notat.substring(notat1+1);
        notat=notat.substring(0,notat1);
        int notai=Integer.valueOf(notat);
        int dec=Integer.valueOf(dect);
        if (dec>=5){
            notai=notai+1;
        }
        switch (notai){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4: System.out.println("INSUFICIENTE");break;
            case 5: System.out.println("SUFICIENTE");break;
            case 6: System.out.println("BIEN");break;
            case 7:
            case 8: System.out.println("NOTABLE");break;
            case 9:
            case 10: System.out.println("SOBRESALIENTE");break;
            default: System.out.println("No válido");break;
        }
    }
    public void bateriapre5(){
        Scanner entrada=new Scanner(System.in);
        int sueldo;
        int mil=0;
        int mayor=0;
        for(int i=5;i!=0;i--){
            System.out.println("Introduzca el sueldo");
            sueldo=entrada.nextInt();
            if (sueldo>1000){
                mil=mil+1;
            }
            if (mayor>sueldo){
                mayor=sueldo;
            }
        }
        System.out.println("El mayor sueldo es de "+ mayor);
        System.out.println("Y hay "+mil+" sueldo mayores a 1.000€");
    }
    public void bateriapre6(){}
}