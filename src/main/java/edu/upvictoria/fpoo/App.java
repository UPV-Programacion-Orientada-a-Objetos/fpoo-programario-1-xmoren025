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
                    edu.upvictoria.fpoo.Problema1.ProblemaUno obj;
                    obj =new edu.upvictoria.fpoo.Problema1.ProblemaUno();
                    break;
                case 2:
                    edu.upvictoria.fpoo.Problema2.ProblemaDos obj2;
                    obj2 = new edu.upvictoria.fpoo.Problema2.ProblemaDos();
                    break;
                case 3:
                    edu.upvictoria.fpoo.Problema3.ProblemaTres obj3;
                    obj3 = new edu.upvictoria.fpoo.Problema3.ProblemaTres();
                    break;
                case 4:
                    edu.upvictoria.fpoo.Problema4.ProblemaCuatro obj4;
                    obj4= new edu.upvictoria.fpoo.Problema4.ProblemaCuatro();
                    break;
                case 5:
                    edu.upvictoria.fpoo.Problema5.ProblemaCinco obj5;
                    obj5= new edu.upvictoria.fpoo.Problema5.ProblemaCinco();
                    break;
                case 6:
                    edu.upvictoria.fpoo.Problema6.ProblemaSeis obj6;
                    obj6= new edu.upvictoria.fpoo.Problema6.ProblemaSeis();
                    break;
                case 7:
                    edu.upvictoria.fpoo.Problema7.ProblemaSiete obj7;
                    obj7=new edu.upvictoria.fpoo.Problema7.ProblemaSiete();
                    break;
                case 8:
                    edu.upvictoria.fpoo.Problema8.ProblemaOcho obj8;
                    obj8=new edu.upvictoria.fpoo.Problema8.ProblemaOcho();
                    break;
                case 9:
                    edu.upvictoria.fpoo.Problema9.ProblemaNueve obj9;
                    obj9=new edu.upvictoria.fpoo.Problema9.ProblemaNueve();
                    break;
                case 10:
                    edu.upvictoria.fpoo.Problema10.ProblemaDiez obj10;
                    obj10=new edu.upvictoria.fpoo.Problema10.ProblemaDiez();
                    break;
                case 11:
                    edu.upvictoria.fpoo.Problema11.ProblemaOnce obj11;
                    obj11=new edu.upvictoria.fpoo.Problema11.ProblemaOnce();
                    break;
                case 12:
                    edu.upvictoria.fpoo.Problema12.ProblemaDoce obj12;
                    obj12=new edu.upvictoria.fpoo.Problema12.ProblemaDoce();
                    break;
                case 13:
                    edu.upvictoria.fpoo.Problema13.ProblemaTrece obj13;
                    obj13=new edu.upvictoria.fpoo.Problema13.ProblemaTrece();
                    break;
                case 14:
                    edu.upvictoria.fpoo.Problema14.ProblemaCatorce obj14;
                    obj14=new edu.upvictoria.fpoo.Problema14.ProblemaCatorce();
                    break;
                case 15:
                    edu.upvictoria.fpoo.Problema15.ProblemaQuince obj15;
                    obj15=new edu.upvictoria.fpoo.Problema15.ProblemaQuince();
                    break;
//                case 16:
//                    edu.upvictoria.fpoo.Problema16.ProblemaDSeis obj16;
//                    obj16=new edu.upvictoria.fpoo.Problema16.ProblemaDSeis();
//                    break;
//                case 17:
//                    edu.upvictoria.fpoo.Problema17.ProblemaDSiete obj17;
//                    obj17=new edu.upvictoria.fpoo.Problema17.ProblemaDSiete();
//                    break;
//                case 18:
//                    edu.upvictoria.fpoo.Problema18.ProblemaDOcho obj18;
//                    obj18=new edu.upvictoria.fpoo.Problema18.ProblemaDOcho();
//                    break;
//                case 19:
//                    edu.upvictoria.fpoo.Problema19.ProblemaDNueve obj19;
//                    obj19=new edu.upvictoria.fpoo.Problema19.ProblemaDNueve();
//                    break;
//                case 20:
//                    edu.upvictoria.fpoo.Problema20.ProblemaVeinte obj20;
//                    obj20=new edu.upvictoria.fpoo.Problema20.ProblemaVeinte();
//                    break;
//                case 21:
//                    edu.upvictoria.fpoo.Problema21.ProblemaVUno obj21;
//                    obj21=new edu.upvictoria.fpoo.Problema21.ProblemaVUno();
//                    break;
//                case 22:
//                    edu.upvictoria.fpoo.Problema22.ProblemaVDos obj22;
//                    obj22=new edu.upvictoria.fpoo.Problema22.ProblemaVDos();
//                    break;
//                case 23:
//                    edu.upvictoria.fpoo.Problema23.ProblemaVTres obj23;
//                    obj23=new edu.upvictoria.fpoo.Problema23.ProblemaVTres();
//                    break;
//                case 24:
//                    edu.upvictoria.fpoo.Problema24.ProblemaVCuatro obj24;
//                    obj24=new edu.upvictoria.fpoo.Problema24.ProblemaVCuatro();
//                    break;
//                case 25:
//                    edu.upvictoria.fpoo.Problema25.ProblemaVCinco obj25;
//                    obj25=new edu.upvictoria.fpoo.Problema25.ProblemaVCinco();
//                    break;
                default:
                    break;
            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}

