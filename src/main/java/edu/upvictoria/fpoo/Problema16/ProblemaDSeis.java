package edu.upvictoria.fpoo.Problema16;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProblemaDSeis{
    int i =0;

    public ProblemaDSeis(){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {

            System.out.println("Problema 16. Pinturas <<La brocha gorda>> .");
            System.out.println("Precio por metro cuadrado :");
            double precioxm2 = Double.parseDouble(br.readLine());
            int op;
            do {
                i = i + 1;
                System.out.println("Cliente No. " + i);
                System.out.println("Metros cuadrados:");
                double m2 = Double.parseDouble(br.readLine());
                Pintura cp = new Pintura();
                System.out.println("[Cliente " + i + "]");
                System.out.println("Pago de servicio:  $" + cp.calcularPagoP(precioxm2, m2));
                System.out.println("-- Agregar cliente (1)Sí (0)No");
                op = Integer.parseInt(br.readLine());
            } while (op == 1);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}