package edu.upvictoria.fpoo.Problema18;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProblemaDOcho {

    public ProblemaDOcho(){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try{
            System.out.println("Problema 18. <<La curva loca>> .");
            System.out.println("Proporciona los datos del viaje.");
            System.out.println("Costo por kilómetro:");
            double  costoxk= Double.parseDouble(br.readLine());
            System.out.println("Kilómetros a recorrer:");
            double  kilometros= Double.parseDouble(br.readLine());
            CostoBoleto cb = new CostoBoleto();
            System.out.println("El costo del boleto es de  : $"+ cb.calcularCosto(costoxk,kilometros));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
