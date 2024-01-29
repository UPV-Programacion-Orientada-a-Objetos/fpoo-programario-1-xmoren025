package edu.upvictoria.fpoo.Problema20;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProblemaVeinte {

    public ProblemaVeinte (){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try{
            System.out.println("Problema 20. Costo de llamadas.");
            System.out.println("Duración (minutos):");
            double  duracion= Double.parseDouble(br.readLine());
            System.out.println("Costo por minuto:");
            double  costoxmin= Double.parseDouble(br.readLine());
            CostoLlamada cl = new CostoLlamada();
            System.out.println("Costo por la llamada: $"+ cl.calcularCostoLl(costoxmin, duracion));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}