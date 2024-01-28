package edu.upvictoria.fpoo.Problema5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProblemaCinco {
    public ProblemaCinco(){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try{
            System.out.println("Problema 5. Calcular el área del terreno.");
            System.out.println("Proporciona los datos: ");
            System.out.println("Medida A: ");
            double A = Double.parseDouble(br.readLine());
            System.out.println("Medida B: ");
            double B = Double.parseDouble(br.readLine());
            AreaTerr ca = new AreaTerr();
            System.out.println("Área del terreno: "+ ca.calcularATerr(A,B));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
