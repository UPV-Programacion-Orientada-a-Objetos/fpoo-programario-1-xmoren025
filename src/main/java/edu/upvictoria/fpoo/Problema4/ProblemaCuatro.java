package edu.upvictoria.fpoo.Problema4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProblemaCuatro{
    public ProblemaCuatro(){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try{
            System.out.println("Problema 4. Calcular el área de una circunferencia.");
            System.out.println("Proporciona lo radio: ");
            double r = Double.parseDouble(br.readLine());
            AreaCir ca = new AreaCir();
            System.out.println("El área de la Circunferencia: "+ ca.calcularACir(r));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
