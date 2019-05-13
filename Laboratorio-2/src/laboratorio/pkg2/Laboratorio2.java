/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg2;

import java.util.Scanner;

/**
 *
 * @author Diana Serrano
 */
public class Laboratorio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Laboratorio 2 primer bimestre

        Scanner entrada = new Scanner (System.in); //creacion de Escaner
        boolean bigban = true; // se crea una bandera para utilizar 
                               // en el ciclo while
        String salidaDatos = "";// creacion de variable cadena salidaDatos 
        int report = 1; // creacion de variable entera report, la cual servira
                        // para dar el numero de reporte 
        
        while( bigban = true){
            //Creacion e inicializacon de variables
            double sum = 0;
            double sum1 = 0;
            double sum2 = 0;
            double tsum;
            // primer encabezado
            System.out.println("REPORTE GASTOS DEL PADRE DE FAMILIA"); 
            System.out.println("\t"); 
            // creacion de encabezado para presentar reporte 
            salidaDatos = String.format("%s%s\n\nReporte 00%d\n\n",salidaDatos,""
                    + "'REPORTE GASTOS DEL PADRE DE FAMILIA'",report);
            // Ingreso de datos por parte del usuario      
            System.out.println("ingrese los nombres y apellidos del padre "
                    + "de familia"); 
            String nombre = entrada.nextLine();
            System.out.println("Ingrese el sueldo semanal del padre de familia");
            double SueldoSemanal = entrada.nextDouble();
            System.out.println("Numero de hijos del padre de familia");
            int NumHijos = entrada.nextInt();

            // Creacion del ciclo for para ingrese de gastos de los hijos
            for (int i = 1; i <= NumHijos; i++) {
                System.out.printf("Ingrese el gasto semanal para pasajes "
                        + "de su hijo%d\n",i);
                double Gpasaje = entrada.nextDouble();
                System.out.printf("Ingrese el gasto semanal del bar de "
                        + "su hijo%d\n",i);
                double Gbar = entrada.nextDouble();
                System.out.printf("Ingrese el gasto semanal de salidas de"
                       + " su hijo%d\n",i);
                double Gsalida = entrada.nextDouble();
                
                sum = Gpasaje + sum1;
                sum1 = Gbar + sum1;
                sum2 = Gsalida + sum2;
                //Presentacion de datos de gastos de los hijos 
                salidaDatos = String.format("%s Hijo %d \t %.2f \t\t%.2f \t "
                        + "%.2f\n",salidaDatos,i,Gpasaje,Gbar,Gsalida);
                    
            }
            salidaDatos = String.format("%sTotales \t %.2f \t\t%.2f \t %.2f"
                    + "\n",salidaDatos,sum,sum1,sum2);
            tsum = sum + sum1 + sum2;
            if (tsum<=SueldoSemanal){ //Creacion del condicional IF para ver si 
                 //es sueldo semanal le alacanza al padre para todos los datos
                salidaDatos = String.format("%sEl padre de familia %s le "
                        + "falta el dinero semanal, para sus gastos\n\nFin "
                        + "reporte 00%d\n",salidaDatos,nombre,report);
                System.out.printf("%s",salidaDatos);
                System.out.println("\n");
            }else{ 
                salidaDatos = String.format("%sEl padre de familia  %s le "
                        + "falta el dinero semanal, para sus gastos\n\nFin "
                        + "reporte 00%d\n",salidaDatos,nombre,report);
                System.out.printf("%s",salidaDatos);
                System.out.println("\n");
            }
            // Se pregunta al usuario si quiero crear un nuevo reporte
            System.out.println("Desea crear un nuevo reporte?\n1 SI \n2 NO");
                int nuevo = entrada.nextInt();
            // Uso del condicional IF 
            if (nuevo == 1 ){
                    bigban = true;
            }else{
                    bigban = false;
                    
                }   
            
                report = report + 1; //report aumente en 1 
                entrada.nextLine(); //limpiar todo 
            }
        }
    }
    

