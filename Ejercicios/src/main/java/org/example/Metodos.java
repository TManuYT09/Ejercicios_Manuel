package org.example;

public class Metodos {
    public static int gradoKelvin(int celsius){
        final int CTE_KELVIN=273;
        int kelvin=celsius+CTE_KELVIN;

        return kelvin;
    }
    public static void prueba_mismaclase(){
        gradoKelvin(17);
    }
}
