package clasesWrapper;

import java.lang.reflect.Method;

public class MetodogetClass {
    public static void main(String[] args){
        String texto = "Hola";
        Class strClass = texto.getClass();
        System.out.println("strClass: " + strClass.getSimpleName());
        System.out.println("package: " + strClass.getPackage().getName());
        System.out.println("\nMetodos: ");
        for(Method i : strClass.getMethods()){
            System.out.println("metodo: " + i.getName());
        }
    }
}
