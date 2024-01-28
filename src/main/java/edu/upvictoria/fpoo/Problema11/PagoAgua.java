package edu.upvictoria.fpoo.Problema11;

import static java.lang.Math.*;

public class PagoAgua {
    public Double calcularPagoAgua(double precioxm3,double A, double L, double H){
        double m3 =A*L*H;
        return (double) round(precioxm3*m3);
    }
}
