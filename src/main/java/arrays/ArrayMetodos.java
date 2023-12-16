package arrays;

import java.util.Arrays;
import java.util.List;
public class ArrayMetodos {
    private String[] nombres = {"Armando", "Santi", "Diego", "Alonso", "Sebas"};
    private int[] numeros = {25, 15, 5, 10, 20};
    private int[] rellenar = new int[5];
    public void longitudArreglo(){
        // METODO leng: devuelve la longitud (numero de elementos) del arreglo.
        System.out.println("El arreglo tiene " + this.nombres.length + " elementos");
    }
    public void copiarArreglo(){
        // METODO copyOf(): copia el arreglo especificado con una nueva longitud
        String[] copia = Arrays.copyOf(this.nombres, 3);
        for(String nombresCopia : copia){
            System.out.println(" -  " + nombresCopia);
        }
    }
    public void representacionDeCadena(){
        // METODO toString(): devuelve una representacion de cadena del arreglo
        System.out.println("Representacion de cadena del arreglo:\n" + Arrays.toString(this.numeros));
    }
    public void ordenarAscendente(){
        // METODO sort(): ordena ascendentemente los datos del arreglo
        System.out.println("Numeros ordenados");
        Arrays.sort(this.numeros);
        for(int numerosOrdenados : this.numeros){
            System.out.print(numerosOrdenados + ", ");
        }
        
        System.out.println("\nNombres ordenados:");
        Arrays.sort(this.nombres);
        for(String nombresOrdenados : this.nombres){
            System.out.println(" -  " + nombresOrdenados);
        }
    }
    public void rellenarArreglo(){
        // METODO fill(): rrellenar array con un valor especifico
        Arrays.fill(this.rellenar, 10);
        System.out.println("Se rrelleno el arreglo con el valor '10':");
        System.out.println(Arrays.toString(this.rellenar));
    }
    public void busquedaBinaria(){
        // METODO binarySearch(): busca un elemento en el arreglo utilizando busqueda binaria
        System.out.println("Buscando elemento 'Armando', se encuentra en indice: " + Arrays.binarySearch(this.nombres, "Armando"));
    }
    public void comparar(){
        // METODO equals: compara dos arreglos para determinar si son iguales
        System.out.println("El arreglo de numeros y rrelleno son iguales: " + Arrays.equals(this.numeros, this.rellenar));
    }
    public void convertirALista(){
        // METODO asList(): convierte un arreglo en una lista
        System.out.println("Se convierte arreglo en una Lista:");
        List<String> lista = Arrays.asList(this.nombres);
        for(String listaImprimir: lista){
            System.out.println(" -  " + listaImprimir);
        }
    }
}
