package metodos;

public class Recursividad {
    // Ejemplo de recursividad
    private int suma(int x){
        if(x > 0){
            return x + suma(x - 1);
        }else{
            return 0;
        }
    }
    // Ejemplo 2 de recursividad
    /**
     * 
     */

    public void mostrarDatos(){
        System.out.println(suma(10));
    }
}
