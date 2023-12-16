package arrays;

import java.util.Scanner;

public class Arrays {
    static Scanner readConsole = new Scanner(System.in);
    
    // Declarar un array o vector
    private final String[] nombres = new String[5];
    // Tambien se puede declarar asi
    private final int[] num = {1, 2, 3, 4, 5};
    
    public void trabajarConArrays(){
        // Almacenar los nombres
        for(int i=0; i<this.nombres.length; i++){
            System.out.print("Ingrese el nombre #" + this.num[i] + ": ");
            this.nombres[i]=readConsole.nextLine();
        }
        // Imprimir los nombres almacenados en el arreglo
        System.out.println("Nombres almacenados en el arreglo: ");
        // for-each: iterar sobre los elementos de un arreglo
        for( String names: nombres){
            System.out.println(names);
        }
    }
}
