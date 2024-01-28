package edu.upvictoria.fpoo.Problema1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProblemaUno{
    /**
     *  Constructor de la clase
     */
    public ProblemaUno(){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        try{
            System.out.println("Problema 1. Sumar dos números cualesquiera.");
            System.out.println("Primer número:");
            int a = Integer.parseInt(br.readLine());
            System.out.println("Segundo número:");
            int b = Integer.parseInt(br.readLine());
            Suma s = new Suma();
            System.out.println("El resultado es: "+ s.sumar(a,b));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
