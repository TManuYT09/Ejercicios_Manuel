package org.example;

import java.util.Random;

public class Tema3 {
    public void ejercicio1(){
        int numeros[]=new int[8];
        Random aleatorios = new Random();
        int suma=0;

        for (int i=0;i<numeros.length;i++){
            numeros[i]= aleatorios.nextInt(500)+1;
            suma+=numeros[i];
        }
        System.out.println("La suma de los elementos es: "+suma);
    }
}
