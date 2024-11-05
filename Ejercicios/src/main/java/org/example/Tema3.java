package org.example;

import java.util.Random;
import java.util.Scanner;

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
    public void ejercicio2(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cuantos numeros quieres?");
        int num = entrada.nextInt();
        int numeros[]=new int[num];
        int numeros1[]=new int[num];

        Random random = new Random();
        for (int i=0;i<numeros.length;i++){
            numeros[i]=random.nextInt(num)+1;
        }

        System.out.println("Array original:");
        for (int i=0;i<numeros.length;i++){
            System.out.print(numeros[i]+" ");
        }
        System.out.println(" ");

        System.out.println("Array invertido: ");
        for (int i=0;i<numeros.length;i++){
            numeros1[i]=numeros[i];
        }
        for (int i=0;i<numeros.length;i++){
            numeros[i]=numeros1[i];
        }

        for (int i=numeros.length-1;i>=0;i--){
            System.out.print(numeros[i]+" ");
        }
    }
    public void ejercicio3(){

    }
}
