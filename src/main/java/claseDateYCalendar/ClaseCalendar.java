package claseDateYCalendar;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
public class ClaseCalendar {
    public static void main(String[] args){
        Calendar calendar = Calendar.getInstance();
        /**
         * Agregar una fecha
         */
        //calendar.set(2024, Calendar.JANUARY, 5, 23, 40, 59);
        calendar.set(Calendar.YEAR, 2024);
        calendar.set(Calendar.MONTH, 0);
        calendar.set(Calendar.DAY_OF_MONTH, 05);
        
        //calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.HOUR, 11);
        calendar.set(Calendar.AM_PM, Calendar.PM);
        calendar.set(Calendar.MINUTE, 40);
        calendar.set(Calendar.SECOND, 59);
        
        Date date = calendar.getTime();
        System.out.println("Fecha sin formato = " + date);
        
        SimpleDateFormat sdFormat = new SimpleDateFormat("EEEE d 'de' MMMM, yyyy  hh:mm:ss a");
        String dateWithFormat = sdFormat.format(date);
        System.out.println("Fecha con formato = " + dateWithFormat);
    }
}
