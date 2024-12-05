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

        System.out.println(Arrays.toString(semanaOrdenada));
    }
}// class solution
