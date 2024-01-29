package edu.upvictoria.fpoo.Problema22;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProblemaVDos {

    public ProblemaVDos (){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try{
            System.out.println("Problema 22. <<CLS>>.");
            System.out.println("Costo por kilowatt:");
            double  costoklw= Double.parseDouble(br.readLine());
            System.out.println("Consumo de energía (kilowatts):");
            double  klw= Double.parseDouble(br.readLine());
            CostoLuz cl = new CostoLuz();
            System.out.println("Total a pagar: $"+ cl.calcularCostoLuz(costoklw,klw));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
