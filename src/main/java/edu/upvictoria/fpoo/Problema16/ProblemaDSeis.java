package edu.upvictoria.fpoo.Problema16;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProblemaDSeis{
    int i =0;
    String op="s";
    public ProblemaDSeis(){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try{
            System.out.println("Problema 16. Pinturas <<La brocha gorda>> .");
            System.out.println("Precio por metro cuadrado :");
            double  precioxm2= double.parseDouble(br.readLine());
            do {

            }while (op=="s");
            System.out.println("Precio por metro cuadrado :");
            double  precioxm2= double.parseDouble(br.readLine());
            Edad ce = new Edad();
            System.out.println("Edad del entrevistado:  "+ pd.calcularEdad(anio) + " dólares."+ " años.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}