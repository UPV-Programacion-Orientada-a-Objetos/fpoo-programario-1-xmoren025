package edu.upvictoria.fpoo.Problema7;

import static java.lang.Math.round;

public class PagoLeche {
    public double calcularPagoL(double L,double precio){
        Double ltro_galon = L/3.785;
        return round(ltro_galon*precio);
    }
}
