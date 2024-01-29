package edu.upvictoria.fpoo.Problema19;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProblemaDNueve {

    public ProblemaDNueve(){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try{
            System.out.println("Problema 19. Tiempo de viaje en bicicleta.");
            System.out.println("Proporciona los datos del viaje.");
            System.out.println("Distancia a recorrer (kilómetros) :");
            double  distancia= Double.parseDouble(br.readLine());
            System.out.println("Velocidad (kilómetros x hora) :");
            double  velocidad= Double.parseDouble(br.readLine());
            Tiempo tb = new Tiempo();
            System.out.println("Tardaría aproximadamente "+ tb.calcularTiempo(distancia, velocidad)+ " horas y "+tb.calcularTiempo(distancia, velocidad)*60+" minutos.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
