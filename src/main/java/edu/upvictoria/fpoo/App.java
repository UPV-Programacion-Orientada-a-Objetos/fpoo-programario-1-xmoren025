package edu.upvictoria.fpoo;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try
        {
            System.out.println("## MENÚ ##");
            System.out.println("[1] Sumar dos números\n[2] Promedio de calificaciones\n[3] Área de un rectángulo\n[4] Área de circunferencia\n[5] Área de terreno");
            System.out.println("[6] Área de figura 'cono de nieve'\n[7] Pago por producción de leche\n[8] Distancia entre dos puntos\n[9] Sueldo semanal\n[10] Pedido de Tela");
            System.out.println("[11] Pago del agua\n[12] Área de triángulo\n[13] Pesos a dólares\n[14] Entrevista de trabajo(edad)\n[15] Cobro de estacionamiento");
            System.out.println("[16] Cobro de trabajos de pintura\n[17] Calcular la hipotenusa\n[18] Costo de boleto \n[19] Trayecto en bicicleta\n[20] Costo de llamada");
            System.out.println("[21] Pago de agua por metro cuadrado\n[22] Pago de electricidad\n[23] Oferta -20%\n[24] Ahorro anual\n[25] Cheque para viaje de trabajo");


            System.out.println("Ingresa el número de problema que quieres resolver:");
            int op = Integer.parseInt(br.readLine());

            switch(op){
                case 1:
                    ProblemaUno obj;
                    obj =new ProblemaUno();
                    break;
                case 2:
                    ProblemaDos obj2;
                    obj2 = new ProblemaDos();
                    break;
                case 3:
                    ProblemaTres obj3;
                    obj3 = new ProblemaTres();
            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}

