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
    public void navidad(){
        Scanner entrada=new Scanner(System.in);
        final String palabra = "NAVIDAD";
        String palabras[] = palabra.split("");

        System.out.println("Introduce cuantas letras quieres en la palabra "+palabra+"...");
        String num=entrada.nextLine();

        String cantidades[] = num.split(" ");

        System.out.println(Arrays.toString(cantidades));
        System.out.println(Arrays.toString(palabras));
        String resultado="";

        if (cantidades.length==palabras.length){
            for (int i=0;i< cantidades.length;i++){
                for (int j=0;j<Integer.parseInt(cantidades[i]);j++){
                    resultado=resultado+palabras[i];
                }
            }
            System.out.println(resultado);
        }else {
            System.out.println("no hay un numero por letra");
        }
    }
    public void ruleta(){
        Scanner entrada=new Scanner(System.in);
        Random random=new Random();
        String colores[]={"rojo", "negro"};
        Integer numeros[]={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36};
        String opciones[]={"par","impar"};
        int num_ganador;
        int num_color;
        String color_ganador;
        String opcion_ganador;
        boolean comp=false;
        int num;
        String color="";
        String opcion="";
        System.out.println("Introduzca un numeros");
        num=entrada.nextInt();
        if (Arrays.asList(numeros).contains(num)){
            if (num>0){
                System.out.println("Introduzca un color");
                color=entrada.next();
                color=color.trim();
                color=color.toLowerCase();
                if (Arrays.asList(colores).contains(color)){
                    System.out.println("Introduzca su opcion (par o impar)");
                    opcion=entrada.next();
                    opcion=opcion.trim();
                    opcion=opcion.toLowerCase();
                    if (Arrays.asList(opciones).contains(opcion)) {
                        comp=true;
                    }else {
                        System.out.println("ERROR, opcion no valida");
                    }
                }else {
                    System.out.println("ERROR, color no valido");
                }
            }else {
                comp=true;
            }
            if (comp){
                num_ganador= random.nextInt(numeros.length);
                num_color= random.nextInt(colores.length);
                color_ganador=colores[num_color];
                if (num_ganador%2==0){
                    opcion_ganador=opciones[0];
                }else {
                    opcion_ganador=opciones[1];
                }
                System.out.println("Ha tocado "+num_ganador+" "+color_ganador+" "+opcion_ganador);
                if (num_ganador==num&&color_ganador.equals(color)&&opcion_ganador.equals(opcion)){
                    System.out.println("GANADOR");
                } else if (color_ganador.equals(color)) {
                    System.out.println("Has acertado el color");
                } else if (opcion_ganador.equals(opcion)) {
                    System.out.println("Has acertado que es "+opcion_ganador);
                } else if (num_ganador==num) {
                    if (num==0){
                        System.out.println("HA GANADOR");
                    }else {
                        System.out.println("Has acertado el numero");
                    }
                }else {
                    System.out.println("Has perdido");
                }
            }
        }else {
            System.out.println("ERROR, numero no valido");
        }
    }
    public void duplicacion(){
        Random random = new Random();
        int original[]=new int[random.nextInt(10)+1];

        for (int i=0;i<original.length;i++){
            original[i]= random.nextInt(10)+1;
        }

        System.out.println(Arrays.toString(original));
        Arrays.sort(original);
        System.out.println(Arrays.toString(original));
        boolean comp=false;

        do {
            for (int i=0;i<original.length-1;i++){
                if (original[i]==original[i+1]) {
                    original[i + 1] = 0;
                }
            }

            Arrays.sort(original);

            for (int i=0;i<original.length-1;i++){
                if (original[i]==original[i+1]&&original[i]!=0) {
                    comp=true;
                    break;
                }else {
                    comp=false;
                }
            }
        }while (comp);

        int cero=0;

        for (int i=0;i<original.length;i++){
            if (original[i]==0) {
                cero++;
            }
        }

        int sin_duplicados[]=new int[original.length-cero];
        int pos=0;

        for (int i=0;i< original.length;i++){
            if (original[i]!=0){
                sin_duplicados[pos]=original[i];
                pos++;
            }
        }

        System.out.println(Arrays.toString(sin_duplicados));
    }
    public void bateria2(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduzca un numero:");
        int num=entrada.nextInt();
        System.out.println("Altura: "+num);
        String texto="";
        for (int i=1;i<=num;i++){
            for (int j=i;j!=0;j--){
                texto=texto+"*";
            }
            System.out.println(texto);
            texto="";
        }
    }
    public void bateria3(){
        for (int i=1;i<=10;i++){
            for (int j=1;j<=10;j++){
                System.out.println(i+" x "+j+" = "+(i*j));
            }
            System.out.println("");
        }
    }
    public void bateria4(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduzca el valor m:");
        int m=entrada.nextInt();
        String texto= "";
        bucle:
        for (int i=2;i<=m;i++){
            for (int j=2;j<i;j++){
                if(i%j==0){
                    continue bucle;
                }
            }
            texto=texto+String.valueOf(i)+" ";
        }
        System.out.println("Números primos: "+texto.trim());
    }
    public void matrices1(){
        Scanner entrada=new Scanner(System.in);
        int matriz[][]=new int[3][3];
        System.out.println("Introduzca los valores que contengala matriz:");
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++){
                System.out.println("Posición ("+i+", "+j+")");
                matriz[i][j]=entrada.nextInt();
            }
        }
        System.out.println("¿Que numero quieres buscar?");
        int num=entrada.nextInt();

        System.out.println("Matriz:");
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("Número a buscar: "+num);
        System.out.println("Salida:");
        int columna=-1;
        int fila=-1;
        filas:
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++){
                if (matriz[i][j]==num){
                    columna=j;
                    fila=i;
                    break filas;
                }
            }
        }
        if (columna>-1||fila>-1){
            System.out.println("El número "+num+" se encuentra en la posición ("+fila+", "+columna+")");
        }else {
            System.out.println("El número "+num+" no se encuentra");
        }

    }
    public void matrices2(){
        Random random=new Random();
        int temp=random.nextInt(5)+1;
        int matriz[][]=new int[random.nextInt(5)+1][random.nextInt(5)+1];

        System.out.println("Matriz:");
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++){
                matriz[i][j]=random.nextInt(10)+1;
                System.out.print(matriz[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        System.out.println("Suma de filas:");
        int total=0;
        for (int i=0;i<matriz.length;i++){
            total=0;
            for (int j=0;j<matriz[i].length;j++) {
                total+=matriz[i][j];
            }
            System.out.println("Fila "+(i+1)+": "+total);
        }
        System.out.print("\n");

        System.out.println("Suma de columnas: ");
        for (int i=0;i<matriz[0].length;i++){
            total=0;
            for (int j=0;j<matriz.length;j++){
                total+=matriz[j][i];
            }
            System.out.println("Columna "+(i+1)+": "+total);
        }
    }
    public void matrices3(){
        Scanner entrada=new Scanner(System.in);

        System.out.println("Hola! Cuántos estudiantes tienes?");
        int num_estudiantes= entrada.nextInt();

        System.out.println("Cuántas asignaturas tiene?");
        int num_asignaturas= entrada.nextInt();

        String matriz[][]=new String[num_estudiantes+1][num_asignaturas+1];

        matriz[0][0]="Estudiantes";
        String estudiante="";

        for (int i = 0; i < 1; i++) {
            for (int j = 1; j < matriz.length; j++) {
                System.out.println("Introduce el nombre del estudiante "+ j);
                estudiante=entrada.next();
                matriz[j][i]=estudiante;
            }
        }

        String asignaturas;
        for (int i = 1; i < matriz[0].length; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.println("Introduce la asignatura "+ i);
                asignaturas=entrada.next();
                matriz[j][i]=asignaturas;
            }
        }

        int nota;
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz[i].length; j++) {
                System.out.println("Inserta la nota de "+matriz[i][0]+" para la asignatura de "+matriz[0][j]);
                nota=entrada.nextInt();
                matriz[i][j]= String.valueOf(nota);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.print("\n");
        }

        double media;
        for (int i = 1; i < matriz.length; i++) {
            media=0;
            for (int j = 1; j < matriz[i].length; j++) {
                media+=Integer.parseInt(matriz[i][j]);
            }
            media=media/(num_asignaturas);
            System.out.println("La nota media del alumno "+ matriz[i][0]+" es "+media);
        }

        for (int i = 1; i < matriz[0].length; i++) {
            media=0;
            for (int j = 1; j < matriz.length; j++) {
                media+=Integer.parseInt(matriz[j][i]);
            }
            media=media/(num_estudiantes);
            System.out.println("La nota media de la asignatura "+ matriz[0][i]+" es "+media);
        }
    }
}