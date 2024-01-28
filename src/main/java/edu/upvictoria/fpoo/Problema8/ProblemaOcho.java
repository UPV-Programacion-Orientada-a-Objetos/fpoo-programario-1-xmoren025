package edu.upvictoria.fpoo.Problema8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProblemaOcho {
    public ProblemaOcho(){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try{
            System.out.println("Problema 8. Distancia entre dos puntos.");
            System.out.println("-- Punto A");
            System.out.println("Valor en x:");
            int x1 = Integer.parseInt(br.readLine());
            System.out.println("Valor en y:");
            int y1 = Integer.parseInt(br.readLine());
            System.out.println("-- Punto B");
            System.out.println("Valor en x:");
            int x2 = Integer.parseInt(br.readLine());
            System.out.println("Valor en y:");
            int y2 = Integer.parseInt(br.readLine());
            Distancia cd = new Distancia();
            System.out.println("La distancia entre A y B es de: "+ cd.calcularDistancia(x1,y1,x2,y2));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
