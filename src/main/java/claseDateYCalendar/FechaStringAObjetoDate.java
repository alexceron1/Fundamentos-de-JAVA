package claseDateYCalendar;

import java.text.ParseException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
public class FechaStringAObjetoDate {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        System.out.println("Ingresa la fecha en el formato: \"1970-01-25\":");
        String fechaStr = sc.nextLine();
        try{
            Date fecha = sdFormat.parse(fechaStr);
            System.out.println("fecha = " + sdFormat.format(fecha));
            /**
             * Comparar fechas: despues, igual, antes
             */
            Date fecha2 = new Date();
            if(fecha.after(fecha2)){
                System.out.println("La fecha ingresada es despues de la fecha actual");
            }else if(fecha.before(fecha2)){
                System.out.println("La fecha ingresada es antes de la fecha actual");
            }else if(fecha.equals(fecha2)){
                System.out.println("La fecha ingresada es igual a la fecha actual");
            }
            /**
             * Otra forma de comparar fechas
             */
            System.out.println();
            if(fecha.compareTo(fecha2)>0){
                System.out.println("La fecha ingresada es despues de la fecha actual");
            }else if(fecha.compareTo(fecha2)<0){
                System.out.println("La fecha ingresada es antes de la fecha actual");
            }else if(fecha.compareTo(fecha2)==0){
                System.out.println("La fecha ingresada es igual a la fecha actual");
            }
            /**     */
            
        }catch(ParseException e){
            System.out.println("La fecha no esta en el formato requerido");
            e.printStackTrace();
        }
        
    }
}
