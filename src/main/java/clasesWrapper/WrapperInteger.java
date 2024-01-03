package clasesWrapper;

public class WrapperInteger {
    public static void main(String[] args){
        Integer objEntero = Integer.valueOf("176");
        int primEntero = objEntero.intValue();
        long primEntero2 = objEntero; // objEntero.longValue()
        System.out.println("objEntero: " + objEntero);
        
        System.out.println("Como primitivo: " + primEntero);
        System.out.println("Como primitivo long: " + primEntero2);

        Long primEnteroLong = Long.valueOf(12000);
        int primEnteroLong2 = primEnteroLong.intValue();
        System.out.println("primEnteroLong2: " + primEnteroLong2);
    }
}
