package edu.upvictoria.fpoo.Problema14;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProblemaCatorce{

    public ProblemaCatorce(){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try{
            System.out.println("Problema 14. Entrevista de trabajo. Responda lo que se indica.");
            System.out.println("Año de nacimiento :");
            int  anio= Integer.parseInt(br.readLine());
            Edad ce = new Edad();
            System.out.println("Edad del entrevistado:  "+ ce.calcularEdad(anio) + " dólares."+ " años.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
