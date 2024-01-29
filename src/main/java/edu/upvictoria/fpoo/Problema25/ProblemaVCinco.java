package edu.upvictoria.fpoo.Problema25;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProblemaVCinco{

    public ProblemaVCinco(){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try{
            System.out.println("Problema 25. Cheque para viaje de trabajo.");
            System.out.println("Días de ospedaje:");
            int  dias= Integer.parseInt(br.readLine());
            System.out.println("-- HOTEL:");
            System.out.println("Precio por noche:");
            double precioH  = Double.parseDouble(br.readLine());
            System.out.println("-- COMIDA:");
            System.out.println("Monto destinado a comida diaria:");
            double precioC  = Double.parseDouble(br.readLine());
            Cheque ch = new Cheque();
            System.out.println("-- CHEQUE --:");
            System.out.println("-- hotel:  $"+ ch.calcularHotel(dias,precioH));
            System.out.println("-- comida:  $"+ ch.calcularComida(dias,precioC));
            System.out.println("-- extra:  $"+ ch.calcularExtra(dias));
            System.out.println("Total:  $"+ ch.calcularCheque( ch.calcularHotel(dias,precioH), ch.calcularComida(dias,precioC), ch.calcularExtra(dias)));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
