package edu.upvictoria.fpoo.Problema23;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProblemaVTres {

    public ProblemaVTres (){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try{
            System.out.println("Problema 23. OFERTA -20% .");
            System.out.println("Precio original del artículo:");
            double  precio= Double.parseDouble(br.readLine());
            Descuento ds = new Descuento();
            System.out.println("Precio con descuento del 20% : $"+ ds.calcularDescuento(precio));
            System.out.println("Total a pagar : $"+ ds.calcularTotal(ds.calcularDescuento(precio)));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
