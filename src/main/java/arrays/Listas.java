package arrays;

import java.util.ArrayList;
import java.util.List;
public class Listas {
    private ArrayList<String> listaNombres = new ArrayList<>();
    private List<String> listaApellidos = new ArrayList<>();
    public void llenarListaNombres(){
        listaNombres.add("Pamela");
        System.out.println("Valores almacenados en la lista: "+listaNombres.get(0));
        listaNombres.set(0, "Jacinta");
        System.out.println("Se cambio el valor a: " + listaNombres.get(0));
        listaNombres.add("Ramiro");
        System.out.println("Tamaño de la lista: " + listaNombres.size());
        for(String nombre : listaNombres){
            System.out.println(" -  " + nombre);
        }
    }
}
