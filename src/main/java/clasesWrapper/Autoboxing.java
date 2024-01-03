package clasesWrapper;

public class Autoboxing {
    public static void main(String[] args){
        /**
         * Autoboxing: Integer num = Integer.valueOf(1);
         * Autoboxing: Integer num = 1;
         */
        Integer[] numeros = {Integer.valueOf(1), 2, 3, 4, 5, 6, 7, 8, 9};

        Integer suma= 0;
        /**
         * unboxing: i.intValue();
         * unboxing: i;
         */
        for(Integer i : numeros){
            if(i.intValue() % 2 == 0){
                suma += i.intValue();
            }
        }
        System.out.println("Suma: " + suma.intValue());
        
        suma = 0;
        for(Integer i : numeros){
            if(i % 2 == 0){
                suma += i;
            }
        }
        System.out.println("Suma: " + suma);
        
    }
}
