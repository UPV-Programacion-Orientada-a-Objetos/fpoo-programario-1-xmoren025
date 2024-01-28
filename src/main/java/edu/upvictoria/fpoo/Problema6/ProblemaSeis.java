package edu.upvictoria.fpoo.Problema6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProblemaSeis {
    public ProblemaSeis(){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try{
            System.out.println("Problema 6. Calcular el área de <<Cono de nieve>>.");
            System.out.println("Proporciona los datos: ");
            System.out.println("Medida R: ");
            double R = Double.parseDouble(br.readLine());
            System.out.println("Medida H: ");
            double H = Double.parseDouble(br.readLine());
            AreaCono ca = new AreaCono();
            System.out.println("Área del <<Cono de nieve>>: "+ ca.calcularACono(R,H));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
