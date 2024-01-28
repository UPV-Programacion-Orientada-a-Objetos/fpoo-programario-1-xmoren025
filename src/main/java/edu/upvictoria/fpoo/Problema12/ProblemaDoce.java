package edu.upvictoria.fpoo.Problema12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProblemaDoce {

    public ProblemaDoce(){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try{
            System.out.println("Problema 12. Calcular el área de un triángulo.");
            System.out.println("Proporciona los datos:");
            System.out.println("Base:");
            double  b = Double.parseDouble(br.readLine());
            System.out.println("Altura:");
            double  h = Double.parseDouble(br.readLine());
            AreaTri ca = new AreaTri();
            System.out.println("Área del triángulo:"+ ca.calcularAreaTri(b,h));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}