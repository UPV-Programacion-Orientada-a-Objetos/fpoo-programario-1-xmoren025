package edu.upvictoria.fpoo.Problema23;

import static java.lang.Math.*;

public class Descuento{
    public double calcularDescuento(double precio){
        double desc = precio*0.2;
        double precio_20=precio-desc;
        return precio_20 ;
    }
    public double calcularTotal(double precio_20){
        double iva = precio_20*0.15;
        return (double)  precio_20+iva ;
    }
}
