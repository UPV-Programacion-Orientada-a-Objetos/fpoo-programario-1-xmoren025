package edu.upvictoria.fpoo.Problema25;

import static java.lang.Math.*;

public class Cheque {
    public double calcularHotel(int dias, double precioH){
        double t_hotel = precioH*dias;
        return t_hotel ;
    }
    public double calcularComida(int dias, double precioC){
        double t_comida = precioC*dias;
        return t_comida ;
    }
    public double calcularExtra(int dias){
        double t_extra = dias*100;
        return t_extra;
    }
    public double calcularCheque(double t_hotel, double t_comida, double t_extra){
        return t_comida+t_extra+t_hotel ;
    }
}