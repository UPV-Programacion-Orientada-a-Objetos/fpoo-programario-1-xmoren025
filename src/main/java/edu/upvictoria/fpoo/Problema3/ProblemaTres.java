package edu.upvictoria.fpoo.Problema3;

import java.awt.geom.Area;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProblemaTres {
    public  ProblemaTres(){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        try{
            System.out.println("Problema 3. Calcular el área de un rectángulo.");
            System.out.println("Proporciona los datos necesarios: ");
            System.out.println("Base: ");
            float b = Float.parseFloat(br.readLine());
            System.out.println("Altura: ");
            float h = Float.parseFloat(br.readLine());
            AreaRect ca = new AreaRect();
            System.out.println("El área del rectángulo es: "+ ca.calcularARect(b,h));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
