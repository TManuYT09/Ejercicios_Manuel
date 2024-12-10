package org.example;

import java.util.Arrays;

public class Spiderman {
    static java.util.Scanner in;
    public static void casoDePrueba() {
        String datos=in.nextLine();
        String datos_entrada[]=datos.split(" ");
        System.out.println(Arrays.toString(datos_entrada));
    }
    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        in.nextLine();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }
}
