package org.example;

import java.util.Arrays;

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
}