package edu.upvictoria.fpoo.Problema17;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProblemaDSiete {

    public ProblemaDSiete(){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try{
            System.out.println("Problema 17. Calcular la hipotenusa de un triángulo rectángulo.");
            System.out.println("Proporciona los datos.");
            System.out.println("Cateto a:");
            double  ca= Double.parseDouble(br.readLine());
            System.out.println("Cateto b:");
            double  cb= Double.parseDouble(br.readLine());
            Hipotenusa h = new Hipotenusa ();
            System.out.println("Hipotenusa del triángulo  : "+ h.calcularHipo(ca,cb));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
