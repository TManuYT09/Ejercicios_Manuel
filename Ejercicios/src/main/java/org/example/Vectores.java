package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Vectores {
    public void vectores(){
        int vector[] = new int[7];

        vector[3] = 27;
        vector[6] = vector[3]*2;
        vector[1] = vector[6]-vector[3];

        for (int i=0;i<vector.length;i++){
            System.out.print(vector[i]+" ");
        }

        String palabras[] = new String[5];

        for (int i=0;i<palabras.length;i++){
            System.out.print(palabras[i]+" ");
        }
    }
    public void vectores_evo(){
        String palabras[]={"paco", "pepe", "manolo", "antonio", "alexandre"};

        for (String i : palabras){
            System.out.println(i);
        }

        System.out.println(Arrays.toString(palabras));

        String salida=Arrays.toString(palabras);
        salida=salida.replace("[","").replace("]","");
        System.out.println(salida);

        System.out.println(palabras);

        String palabras2[]=palabras;

        System.out.println(palabras2);

        String palabras3[]=palabras.clone();

        palabras3[0]="francisco";
        System.out.println(Arrays.toString(palabras2));
        System.out.println(Arrays.toString(palabras3));

        String palabras_corto[]=new String[2];
        System.out.println(Arrays.toString(palabras_corto));

        System.arraycopy(palabras,0,palabras_corto, 0,2);
        System.out.println(Arrays.toString(palabras_corto));
    }
    public void buscar(){
        String nombres[]={"Paco", "Pepe", "Ximo", "Alfonso"};
        String palabra_buscar = "Pepe";
        boolean existe = Arrays.asList(nombres).contains(palabra_buscar);
        if (existe){
            System.out.println(palabra_buscar+" existe");
        }else {
            System.out.println(palabra_buscar+" no existe");
        }
        Integer numeros[]={3,5,6,8,24,56};
        int num = 25;
        boolean num_existe = Arrays.asList(numeros).contains(num);
        if (num_existe){
            System.out.println(num+" existe");
        }else {
            System.out.println(num+" no existe");
        }
    }
    public void prueba(){
        int array[]={3,8,5,6,10};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length-1; i++) {
            System.out.println("i="+i);
            for (int j = i+1; j < array.length ; j++) {
                System.out.println("j="+j);
                System.out.println(array[j]+">"+array[i]);
                if (array[j]>array[i]){
                    int aux = array[j];
                    System.out.println(aux);
                    array[j] = array[i];
                    System.out.println(Arrays.toString(array));
                    array[i] = aux;
                    System.out.println(Arrays.toString(array));
                }
            }
        }
    }
    public void ordenacion(){
        int vector[]={7,8,1,4,6};
        int numero = 4;
        int posicion=Arrays.binarySearch(vector,numero);
        System.out.println(posicion);
        Arrays.sort(vector);
        System.out.println(Arrays.toString(vector));
        posicion=Arrays.binarySearch(vector,numero);
        System.out.println(posicion);
    }
    public void prueba_distinc(){
        int original[]={1,1,2,2,3,4,9,9};
        System.out.println(Arrays.toString(original));
        int limpio[]= Arrays.stream(original).distinct().toArray();
        System.out.println(Arrays.toString(limpio));
    }
    public void matriz(){
        Scanner teclado = new Scanner(System.in);
        int matriz[][] = new int[3][4];

        int matriz2[][] = {{12,32,44,1},{33,2,90,56}};

        System.out.println(matriz2[0][2]);

        System.out.println("Tamaño fila: "+matriz2.length);
        System.out.println("Tamaño columna: "+matriz2[0].length);

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j]+" ");
            }
            System.out.print("\n");
        }

        for (int[] filas:matriz2){
            System.out.println(Arrays.toString(filas));
        }

        for (int[] filas:matriz2){
            for (int columnas : filas){
                System.out.print(columnas+" ");
            }
            System.out.print("\n");
        }

        for (int i=0;i<matriz2.length;i++){
            for (int j=0;j<matriz2[i].length;j++){
                if (matriz2[i][j]==90){
                    System.out.println("Existe el 90");
                }
            }
        }

        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++){
                System.out.println("Dime el valor de la posición ("+i+","+j+"):");
                matriz[i][j]= teclado.nextInt();
            }
        }

        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
    public void matriz2(){
        int matriz[][]=new int[5][5];
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++){
                if(i==j){
                    matriz[i][j]=1;
                }
            }
        }
        for (int[] filas:matriz){
            for (int columnas:filas){
                System.out.print(columnas+" ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++){
                if (matriz[i][j]==1){
                    System.out.print("X ");
                }else {
                    System.out.print("- ");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for (int i=0;i<matriz.length;i++){
            for (int j=matriz[i].length-1;j>=0;j--){
                if (matriz[i][j]==1){
                    System.out.print("X ");
                }else {
                    System.out.print("- ");
                }
            }
            System.out.print("\n");
        }
    }
    public void matriz3(){
        Random random=new Random();
        int fila=4;
        int columna=4;

        int[][] matriza=new int[4][4];
        int[][] matrizb=new int[fila][columna];

        for (int i=0;i<matriza.length;i++){
            for (int j=0;j<matriza[i].length;j++){
                matriza[i][j]=random.nextInt(10);
            }
        }

        for (int i=0;i<matriza.length;i++){
            for (int j=0;j<matriza[i].length;j++){
                matrizb[i][j]=random.nextInt(10);
            }
        }

        int[][] matrizm=new int[matriza.length][matriza[0].length];

        for (int i=0;i<matrizm.length;i++){
            for (int j=0;j<matrizm[i].length;j++){
                if (matriza[i][j]>matrizb[i][j]){
                    matrizm[i][j]=matriza[i][j];
                }else {
                    matrizm[i][j]=matrizb[i][j];
                }
            }
        }

        for (int i=0;i<matriza.length;i++){
            for (int j=0;j<matriza.length;j++){
                System.out.print(matriza[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for (int i=0;i<matrizb.length;i++){
            for (int j=0;j<matrizb.length;j++){
                System.out.print(matrizb[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for (int i=0;i<matrizm.length;i++){
            for (int j=0;j<matrizm.length;j++){
                System.out.print(matrizm[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
    public void prueba_vectores(){
        Scanner entrada=new Scanner(System.in);

        int vector[]={3,4,5,3,2};
        int matriz[][]=new int[2][vector.length];

        for (int i = 0; i < vector.length; i++) {
            matriz[0][i]=vector[i];
        }

        for (int filas[]:matriz) {
            for (int columnas:filas){
                System.out.print(columnas+" ");
            }
            System.out.print("\n");
        }

        int matriz2[][]=new int[3][4];

        for (int i = 0; i < matriz2.length; i++) {
            System.out.println("Introduce valores de la fila: ");
            String fila[]=entrada.next().split(",");
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j]=Integer.parseInt(fila[j]);
            }
        }

        for (int filas[]:matriz2) {
            for (int columnas:filas){
                System.out.print(columnas+" ");
            }
            System.out.print("\n");
        }

        String matriz3[][]=new String[10][10];

        for (int i = 0; i < matriz3.length; i++) {
            System.out.println("Introduce valores de la fila: ");
            String fila[]=entrada.next().toUpperCase().split("");
            for (int j = 0; j < matriz3[i].length; j++) {
                matriz3[i][j]=fila[j];
            }
        }

        for (String fila[]:matriz3) {
            for (String columna:fila){
                System.out.print(columna+" ");
            }
            System.out.print("\n");
        }
    }
}