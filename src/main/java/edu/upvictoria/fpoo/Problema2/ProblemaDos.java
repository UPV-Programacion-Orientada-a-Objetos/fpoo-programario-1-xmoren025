package edu.upvictoria.fpoo.Problema2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProblemaDos{
    public ProblemaDos(){
        float sum=0;
        int i;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        try{
            System.out.println("Problema 2. Calcular el promedio de cuatro materias.");
            for(i=1; i<5;i++){
                System.out.println("Calificación " + i + ":");
                float calif = Float.parseFloat(br.readLine());
                sum = sum + calif;
            }
            Promedio p = new Promedio();
            System.out.println("El promedio es: "+ p.Promediar(sum));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
