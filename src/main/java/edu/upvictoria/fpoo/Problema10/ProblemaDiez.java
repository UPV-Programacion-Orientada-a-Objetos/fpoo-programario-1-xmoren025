package edu.upvictoria.fpoo.Problema10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProblemaDiez {

    public ProblemaDiez(){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try{
            System.out.println("Problema 10. Pedido de tela.");
            System.out.println("Ingrese cuántos metros de tela necesita:");
            System.out.println("Metros:");
            double  metros= Double.parseDouble(br.readLine());
            PedidoTela pt = new PedidoTela();
            System.out.println("Debe pedir "+ pt.calcularPedido(metros)+ " pulgadas de tela.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}