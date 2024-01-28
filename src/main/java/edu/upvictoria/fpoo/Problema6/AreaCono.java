package edu.upvictoria.fpoo.Problema6;

import static java.lang.Math.*;

public class AreaCono {
    public Double calcularACono(double R,double H){
       double AMCirculo= (PI*pow(R,2))/2;
       double ladoB= sqrt(pow(H,2)-pow(R,2));
       double ACono= R*ladoB;
       return (double) round(AMCirculo+ACono);
    }
}
