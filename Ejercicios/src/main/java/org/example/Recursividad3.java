package org.example;

public class Recursividad3 {
    static int resu;
    public static void main(String[] args){
        System.out.println(resulato(1));
    }
    public static int resulato(int numi){
        if(numi<=10){
            resu+=numi;
            resulato(numi+1);
        }

        return resu;
    }
}
