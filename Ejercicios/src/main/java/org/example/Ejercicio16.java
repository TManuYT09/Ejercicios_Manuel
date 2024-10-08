package org.example;

//Necesitamos realizar un programa que decida por nosotros si tenemos que ir (o no) a comprar.
//
//Funcionamiento:
//- El programa nos debe preguntar si tenemos tomate.
//- El programa nos debe preguntar si tenemos aceite.
//- El problema nos debe preguntar si tenemos jamón.
//
//En función de las respuestas que le demos, el programa debe decidir y respondernos en un mensaje que aparezca por pantalla con el siguiente texto:
//
//- "¡Tenemos que ir a comprar!" en caso de que se cumpla que no tenemos alguno de los ingredientes necesarios.
//- "¡No tenemos que ir a comprar!" en caso de que se cumpla que ya tenemos todos los ingredientes necesarios.

import java.util.Scanner;

public class Ejercicio16 {
    public void ejercicio16(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("¿Tienes tomates?");
        boolean tomate=entrada.nextBoolean();
        System.out.println("¿Tienes aceite?");
        boolean aceite=entrada.nextBoolean();
        System.out.println("¿Tienes jamón?");
        boolean jamon=entrada.nextBoolean();
        if (!tomate || !aceite || !jamon){
            System.out.println("¡Tenemos que ir a comprar!");
        }else{
            System.out.println("¡No tenemos que ir a comprar!");
        }
    }
}