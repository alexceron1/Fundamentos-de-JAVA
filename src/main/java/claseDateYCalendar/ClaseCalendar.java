package claseDateYCalendar;

import java.util.Calendar;
import java.util.Date;
public class ClaseCalendar {
    public static void main(String[] args){
        Calendar calendario = Calendar.getInstance();
        calendario.set(2004,Calendar.SEPTEMBER, 19);
        
        Date fecha = calendario.getTime();
        System.out.println("fecha = " + fecha);
    }
}
