package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Bateria4Tema4 {
    static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        while (casoDePrueba()) {
        }
    }//main

    public static boolean casoDePrueba() {
        float dato = teclado.nextFloat();
        if (dato==-1){
            return false;
        } else {
            float semana[] = rellenarDatos(dato);
            resultadoSemanal(semana);
            System.out.println("---");
            return true;
        }
    }// casoDePrueba

    public static float[] rellenarDatos(float dato){
        float datos[]=new float[6];

        datos[0]=dato;

        for (int i = 1; i < datos.length; i++) {
            datos[i] = teclado.nextFloat();
        }

        return datos;
    }

    public static void resultadoSemanal(float[] semana){
        float[] semanaOrdenada = semana.clone();
        Arrays.sort(semanaOrdenada);

        int menor=Arrays.binarySearch(semana,semanaOrdenada[0]);
        int mayor=Arrays.binarySearch(semana,semanaOrdenada[semanaOrdenada.length-1]);

        switch (mayor){
            case 0: System.out.print("MARTES");break;
            case 1: System.out.print("MIERCOLES");break;
            case 2: System.out.print("JUEVES");break;
            case 3: System.out.print("VIERNES");break;
            case 4: System.out.print("SÁBADO");break;
            case 5: System.out.print("DOMINGO");break;
        }
        System.out.print(" ");
        switch (menor){
            case 0: System.out.print("MARTES");break;
            case 1: System.out.print("MIERCOLES");break;
            case 2: System.out.print("JUEVES");break;
            case 3: System.out.print("VIERNES");break;
            case 4: System.out.print("SÁBADO");break;
            case 5: System.out.print("DOMINGO");break;
        }
        System.out.print(" ");
        if (mayor==5){
            System.out.print("SI");
        }else {
            System.out.print("NO");
        }
        System.out.println();
    }
}// class solution
