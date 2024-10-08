package org.example;

//Realizar un programa para dividir dos números leídos por teclado y escribir el resultado.
// Se debe controlar que el divisor no sea igual a 0 e informaremos con el siguiente mensaje:
// "ERROR: no se puede dividir entre 0".

import java.util.Scanner;

public class Ejercicio13 {
    public void ejercicio13(){
        System.out.println("Introduce el divisor");
        Scanner entrada=new Scanner(System.in);
        int divisor=entrada.nextInt();
        System.out.println("Introduce el cociente");
        int cociente=entrada.nextInt();
        if (cociente==0){
            System.out.println("ERROR: no se puede dividir entre 0");
        }else {
            System.out.println(divisor +" / "+ cociente +" = "+ divisor/cociente);
        }
    }
}
