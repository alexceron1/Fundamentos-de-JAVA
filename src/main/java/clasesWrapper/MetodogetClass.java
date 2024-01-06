package clasesWrapper;

import java.lang.reflect.Method;

public class MetodogetClass {
    public static void main(String[] args){
        String texto = "Hola";
        Class strClass = texto.getClass();

        System.out.println("super clase: " + strClass.getSuperclass().getSimpleName());
        System.out.println("pakage: " + strClass.getPackage());
        System.out.println("strClass: " + strClass.getSimpleName());
        System.out.println("Metodos\n");
        for(Method i : strClass.getMethods()){
            System.out.println(" -  " + i.getName());
        }
        System.out.println("strClass: " + strClass.getSimpleName());
        System.out.println("package: " + strClass.getPackage().getName());
        System.out.println("\nMetodos: ");
        for(Method i : strClass.getMethods()){
            System.out.println("metodo: " + i.getName());
        } 
        Integer num = Integer.valueOf(23);
        Class entClass = num.getClass();
        System.out.println("Super Clase: " + entClass.getSuperclass());
    }
}
