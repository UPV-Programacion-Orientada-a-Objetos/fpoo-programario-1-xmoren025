package edu.upvictoria.fpoo.Problema11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProblemaOnce {

    public ProblemaOnce(){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try{
            System.out.println("Problema 11. Pago de agua por metro cúbico.");
            System.out.println("Proporciona los datos:");
            System.out.println("Precio de agua por metro cúbico:");
            double  precioxm3= Double.parseDouble(br.readLine());
            System.out.println("-- Dimensiones de la alberca (m)");
            System.out.println("Alto:");
            double  A = Double.parseDouble(br.readLine());
            System.out.println("Largo:");
            double  L = Double.parseDouble(br.readLine());
            System.out.println("Ancho:");
            double H = Double.parseDouble(br.readLine());
            PagoAgua pa = new PagoAgua();
            System.out.println("Total a pagar: $"+ pa.calcularPagoAgua(precioxm3,A,L,H));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
