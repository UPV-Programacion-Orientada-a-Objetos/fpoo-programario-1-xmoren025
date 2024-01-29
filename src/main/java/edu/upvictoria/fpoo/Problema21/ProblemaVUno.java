package edu.upvictoria.fpoo.Problema21;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProblemaVUno {

    public ProblemaVUno (){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try{
            System.out.println("Problema 21. <<CONAGUA>>>.");
            System.out.println("Costo por metro cúbico:");
            double  costoxm3= Double.parseDouble(br.readLine());
            System.out.println("Metros cúbicos de agua:");
            double  m3= Double.parseDouble(br.readLine());
            CostoAgua ca = new CostoAgua();
            System.out.println("Total a pagar: $"+ ca.calcularCostoAgua(costoxm3, m3));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
