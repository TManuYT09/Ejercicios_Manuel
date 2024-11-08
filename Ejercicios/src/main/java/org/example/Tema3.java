package org.example;

import java.util.Arrays;
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
        Random random = new Random();
        int numeros[]=new int[5];
        int aux=0;
        for (int i=0;i<numeros.length;i++){
            numeros[i]=random.nextInt(5)+1;
        }
        System.out.println("Array original:");
        System.out.println(Arrays.toString(numeros));
        System.out.println("Array invertido:");
        for (int i=0;i<numeros.length/2;i++){
            aux=numeros[i];
            numeros[i]=numeros[numeros.length-1-i];
            numeros[numeros.length-1-i]=aux;
        }
        System.out.println(Arrays.toString(numeros));
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
        Scanner entrada=new Scanner(System.in);
        Random random=new Random();
        int numeros[]= new int[5];
        System.out.println("Array original:");
        for (int i=0;i<numeros.length;i++){
            numeros[i]= random.nextInt(5)+1;
        }
        System.out.println(Arrays.toString(numeros));
        System.out.println("Ingresa el índice a eliminar:");
        int pos=entrada.nextInt();
        int numerosres[]=new int[4];
        System.out.println("Array resultante:");
        for (int i=0;i<numerosres.length;i++){
            if (i==pos){
                numerosres[i]=numeros[i+1];
                pos++;
            }else {
                numerosres[i]=numeros[i];
            }
        }
        System.out.println(Arrays.toString(numerosres));
    }
    public void ejercicio5(){
        int numeros[]={4,5,2,10,98};
        int aux=numeros[numeros.length-1];
        for (int i=numeros.length-1;i>=0;i--){
            if (i==0){
                numeros[i]=aux;
            }else {
                numeros[i]=numeros[i-1];
            }
        }
        System.out.println(Arrays.toString(numeros));
    }
    public void ejercicio6(){
        Scanner entrada=new Scanner(System.in);
        Random random=new Random();
        int numeros[]=new int[5];
        System.out.println("Array:");
        for (int i=0;i<numeros.length;i++){
//            numeros[i]=random.nextInt(5)+1;
            numeros[i]=entrada.nextInt();
        }
//        System.out.println(Arrays.toString(numeros));
        System.out.println("Es simétrico:");
        String comp="";
        for (int i=0;i<numeros.length/2;i++){
            if (numeros[i]==numeros[numeros.length-i-1]){
                comp="SI";
            }else {
                comp="NO";
                break;
            }
        }
        System.out.println(comp);
    }
    public void ejercicio7(){
        Scanner entrada=new Scanner(System.in);
        Random random=new Random();
        int numeros1[]=new int[3];
        int numeros2[]=new int[3];
        int combinad[]=new int[numeros1.length+numeros2.length];
        System.out.println("Array 1:");
        for (int i=0;i<numeros1.length;i++){
            numeros1[i]=entrada.nextInt();
        }
        System.out.println("Array 2:");
        for (int i=0;i<numeros2.length;i++){
            numeros2[i]=entrada.nextInt();
        }
        System.out.println("Array combinado:");
        for (int i=0;i<combinad.length/2;i++){
            combinad[i]=numeros1[i];
            combinad[i+numeros1.length]=numeros2[i];
        }
        System.out.println(Arrays.toString(combinad));
    }
    public void ejercicio8(){
        Scanner entrada=new Scanner(System.in);
        Random random=new Random();
        int numeros[]=new int[4];
        int resulta[]=new int[numeros.length+1];
        System.out.println("Array original:");
        for (int i =0;i<numeros.length;i++){
            numeros[i]=entrada.nextInt();
        }
        System.out.print("Inserta el número ");
        int num=entrada.nextInt();
        int pos=random.nextInt(numeros.length);
        System.out.println("En la posición "+ pos);
        System.out.println("Array resultante: ");
//        System.arraycopy(numeros,0,resulta,0,resulta.length-pos);
//        System.arraycopy(numeros,pos,resulta,pos,resulta.length-pos);

        for (int i=0;i<resulta.length-1;i++){
            if (i==pos){
                resulta[i]=num;
            }else {
                System.arraycopy(numeros,i,resulta, i,1);
            }
        }
        System.out.println(Arrays.toString(resulta));
    }
    public void ejercicio9(){
        Scanner entrada=new Scanner(System.in);
        String letras[]=new String[5];
        System.out.println("Array:");
        for (int i=0;i<letras.length;i++){
            letras[i]=entrada.next();
        }
        System.out.println("La palabra mas larga es");
        String palabra="";
        for (int i=0;i<letras.length;i++){
            if (letras[i].length()>palabra.length()){
                palabra=letras[i];
            }
        }
        System.out.println(palabra);
    }
    public void ejercicio10(){
        Scanner entrada=new Scanner(System.in);
        String palabras[]=new String[5];
        System.out.println("Introduzca 5 letras");
        for (int i=0;i<palabras.length;i++){
            palabras[i]=entrada.next();
        }
        System.out.println("Introduzca una letra");
        char letra = entrada.next().charAt(0);
        for (String palabra : palabras) {
            if (palabra.charAt(0) == letra) {
                System.out.println(palabra);
            }
        }
    }

}
