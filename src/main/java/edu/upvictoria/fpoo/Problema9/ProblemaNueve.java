package edu.upvictoria.fpoo.Problema9;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProblemaNueve {

    public ProblemaNueve(){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try{
            System.out.println("Problema 9. Sueldo semanal de un trabajador.");
            System.out.println("Ingrese los datos necesarios:");
            System.out.println("Horas de trabajo a la semana:");
            int horas = Integer.parseInt(br.readLine());
            System.out.println("Pago por hora:");
            double  pagoxhora= Double.parseDouble(br.readLine());
            Sueldo cs = new Sueldo();
            System.out.println("El sueldo semanal del trabajador es de: $"+ cs.calcularSueldo(horas,pagoxhora));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
