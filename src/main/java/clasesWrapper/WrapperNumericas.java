package clasesWrapper;

public class WrapperNumericas {
    public static void main(String[] args){
        Integer primObjeto = Integer.valueOf(1000);
        Integer primObjeto2 = primObjeto;

        System.out.println("primObjeto: " + primObjeto);
        System.out.println("primObjeto2: " + primObjeto2);
        System.out.println("Ambos objetos son iguales: " + (primObjeto == primObjeto2));
        System.out.println("Ambos objetos son iguales: " + primObjeto.equals(primObjeto2));
        
        primObjeto2 = 1000;
        System.out.println("primObjeto: " + primObjeto);
        System.out.println("primObjeto2: " + primObjeto2);
        System.out.println("Ambos objetos son iguales: " + (primObjeto == primObjeto2));
        System.out.println("Ambos objetos son iguales: " + primObjeto.equals(primObjeto2));
        /**
         * Cuando el valor almacenado es menor que 127 
         * la comparacion con el operador == da como resultado true
         * pero si es mayor devuelve false a la comparacion, solo con el operador ya mencionado*
         */
    }
}