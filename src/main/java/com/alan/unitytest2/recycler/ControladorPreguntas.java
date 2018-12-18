package com.alan.unitytest2.recycler;

import java.util.Random;

public class ControladorPreguntas {
    private String cuento1[][];
    private String cuento2[][];
    private String cuento3[][];
    Random generador= new Random();

    public boolean existe(int [] dat, int dato){
        for (int i=0;i<dat.length;i++){
            if (dat[i]==dato){
                return true;
            }
        }
        return false;
    }

    public String[][] Regresa(String [][] datos){
        String [][] aux= new String[3][2];
        int [] num= new int[3];
        for(int i=0;i<3;i++){
            int rand;
            do {
                rand = Math.abs(generador.nextInt()%datos.length);
            }while(existe(num,rand)==true);
            num[i]=rand;
        }
        //vaciando preguntas
        for(int j=0;j<3;j++){
            aux[j][0]=datos[num[j]][0];
            aux[j][1]=datos[num[j]][1];
        }
        return aux;
    }

    public String[][] getCuento1(){
        cuento1[0][0]="¿este cuento es de animales?";
        cuento1[0][1]="true";
        cuento1[1][0]="¿este cuento trata habla de una hormiga?";
        cuento1[1][1]="true";
        cuento1[2][0]="¿este cuento se lleva acabo en el bosque?";
        cuento1[2][1]="true";
        cuento1[3][0]="¿el cuento es habla de moustros?";
        cuento1[3][1]="false";
        cuento1[4][0]="¿el cuento se trata de un lobo?";
        cuento1[4][1]="false";
        cuento1[5][0]="¿el cuento se lleva acabo en una ciudad?";
        cuento1[5][1]="false";

        return cuento1;
    }
    public String[][] getCuento2(){
        cuento2[0][0]="¿este cuento es de animales?";
        cuento2[0][1]="true";
        cuento2[1][0]="¿este cuento trata habla de un leon?";
        cuento2[1][1]="true";
        cuento2[2][0]="¿este cuento se lleva acabo en el bosque?";
        cuento2[2][1]="true";
        cuento2[3][0]="¿el cuento es habla de moustros?";
        cuento2[3][1]="false";
        cuento2[4][0]="¿el cuento se trata de un lobo?";
        cuento2[4][1]="false";
        cuento2[5][0]="¿hay personas en el cuento ?";
        cuento2[5][1]="true";

        return cuento2;
    }

    public String[][] getCuento3(){
        cuento2[0][0]="¿este cuento es de animales?";
        cuento2[0][1]="true";
        cuento2[1][0]="¿este cuento trata habla de un pato?";
        cuento2[1][1]="true";
        cuento2[2][0]="¿hay agua en este cuento ?";
        cuento2[2][1]="true";
        cuento2[3][0]="¿el cuento es habla de personas ?";
        cuento2[3][1]="false";
        cuento2[4][0]="¿el cuento se trata de un lobo?";
        cuento2[4][1]="false";
        cuento2[5][0]="¿hay cochinitos en el cuento ?";
        cuento2[5][1]="false";

        return cuento3;
    }

}
