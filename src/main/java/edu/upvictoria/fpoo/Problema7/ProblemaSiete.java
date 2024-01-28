package edu.upvictoria.fpoo.Problema7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProblemaSiete {
    public ProblemaSiete(){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try{
            System.out.println("Problema 7. Pago por producción de leche.");
            System.out.println("Litros producidos en el día: ");
            double L = Double.parseDouble(br.readLine());
            System.out.println("Precio por galón: ");
            double precio = Double.parseDouble(br.readLine());
            PagoLeche cp = new PagoLeche();
            System.out.println("Recibirá de pago $"+ cp.calcularPagoL(L,precio));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
