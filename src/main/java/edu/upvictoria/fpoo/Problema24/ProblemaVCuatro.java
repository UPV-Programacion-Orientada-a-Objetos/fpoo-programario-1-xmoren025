package edu.upvictoria.fpoo.Problema24;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProblemaVCuatro{

    public ProblemaVCuatro(){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try{
            System.out.println("Problema 24. Tu ahorro anual.");
            System.out.println("Sueldo semanal:");
            double sueldo= Double.parseDouble(br.readLine());
            Ahorro a = new Ahorro();
            System.out.println("Total de ahorros al año:  "+ a.calcularAhorro(sueldo) );
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

