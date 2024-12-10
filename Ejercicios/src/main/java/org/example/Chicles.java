package org.example;

import java.util.Arrays;

public class Chicles {
    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        String datos = in.nextLine();
        String datos_entrada[] = datos.split(" ");

        if (Integer.parseInt(datos_entrada[0])==0){
            return false;
        }else {
            System.out.println(Arrays.toString(datos_entrada));
            return true;
        }
    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }
}
