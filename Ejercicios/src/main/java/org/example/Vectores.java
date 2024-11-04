package org.example;

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
}