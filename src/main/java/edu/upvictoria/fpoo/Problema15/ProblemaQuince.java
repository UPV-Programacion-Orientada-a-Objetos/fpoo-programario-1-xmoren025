package edu.upvictoria.fpoo.Problema15;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProblemaQuince {

    public ProblemaQuince(){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try{
            System.out.println("Problema 15. Cobro de estacionamiento.");
            System.out.println("Precio por 1 hora:");
            double  pagoxhora= Double.parseDouble(br.readLine());
            System.out.println("Horas aparcado:");
            double  horas= Double.parseDouble(br.readLine());
            PagoE pe = new PagoE();
            System.out.println("Pago de estacionamiento : $"+ pe.calcularPagoE(horas,pagoxhora));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
