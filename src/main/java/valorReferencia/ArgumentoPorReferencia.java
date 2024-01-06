package valorReferencia;

public class ArgumentoPorReferencia {
    public static void main(String[] args){
        int[] edad = {10, 11, 12};
        System.out.println("Se inicia el arreglo con:");
        for(int i : edad){
            System.out.println(" -  " + i);
        }
        test(edad);
        System.out.println("\n\nSe finaliza el arreglo con:");
        for(int i : edad){
            System.out.println(" *  " + i);
        }
    }

    public static void test(int[] edadArr){
        for (int i = 0; i<edadArr.length; i++) {
            edadArr[i] = edadArr[i] + 10;
        }
    }
} 
