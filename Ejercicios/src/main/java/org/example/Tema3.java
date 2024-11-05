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
        int num = 5;
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
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        int numeros[]=new int[25];
        for(int i=0;i<numeros.length;i++){
            numeros[i]=aleatorio.nextInt(100)+1;
        }
        System.out.println("Ingresa un número para buscar [0,100]: ");
        int num=0;
        do {
            if (entrada.hasNextInt()){
                num= entrada.nextInt();
            }else {
                System.out.println("Introduce un formato valido");
                entrada.nextLine();
            }
        }while (num<0||num>100);

        int contador=0;

        for (int i=0;i<numeros.length;i++){
            if (num==numeros[i]){
                contador++;
            }
        }
        System.out.println("El numero "+num+" aparece "+contador+" veces en el array");
    }
    public void ejercicio4(){

    }
}
