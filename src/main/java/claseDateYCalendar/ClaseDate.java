package claseDateYCalendar;

import java.text.SimpleDateFormat;
import java.util.Date;
public class ClaseDate {
    public static void main(String[] args){
        Date fecha = new Date();
        System.out.println("Fecha: " + fecha);
        
        SimpleDateFormat df = new SimpleDateFormat("EEEE dd 'de' MMMM, yyyy");
        String date = df.format(fecha);
        System.out.println("\n\nFecha: " + date);
        
        SimpleDateFormat df2 = new SimpleDateFormat("d/M/yyyy");
        String date2 = df2.format(fecha);
        System.out.println("\nFecha: " + date2);
        
        SimpleDateFormat df3 = new SimpleDateFormat("kk':'mm");
        System.out.println("Hora:\t" + df3.format(fecha));
        /**
         * Metodo getTime()
         * Milisegundos desde enero 1970
        */
        // Determinar los milisegundos que tarda en sumarse todos los numeros del bucle:
        Date fecha2 = new Date();
        SimpleDateFormat df4 = new SimpleDateFormat("d/M/yyyy");
        String fecha2Str = df4.format(fecha2);
        long suma = 0;
        for(int i = 1; i <= 100000000; i++){
            suma += i;
        }
        Date fecha3 = new Date();
        long tiempoFinal = fecha3.getTime() - fecha2.getTime();
        System.out.println("Suma de los numeros comprendidos en el rango especificado en el bucle = " + suma);
        System.out.println("Milisegundos que tarda la ejecucion del bucle: " + tiempoFinal);
        System.out.println("Date: " + fecha2Str);
    }
        
}
