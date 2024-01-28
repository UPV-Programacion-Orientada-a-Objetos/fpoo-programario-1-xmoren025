package edu.upvictoria.fpoo.Problema13;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProblemaTrece{

    public ProblemaTrece(){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try{
            System.out.println("Problema 13. Empresa importadora (pesos a dólares).");
            System.out.println("Pesos mexicanos :");
            double  pesos= Double.parseDouble(br.readLine());
            PesoDolar pd = new PesoDolar();
            System.out.println(pesos + " pesos es equivalente a "+ pd.calcularConversion(pesos) + " dólares.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}