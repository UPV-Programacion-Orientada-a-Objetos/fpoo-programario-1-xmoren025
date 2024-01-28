package edu.upvictoria.fpoo.Problema10;

import static java.lang.Math.*;

public class PedidoTela {
    public Double calcularPedido(double metros){
        double metro_pulgada = 1 / 0.0254;
        return (double) round(metros*metro_pulgada);
    }
}
