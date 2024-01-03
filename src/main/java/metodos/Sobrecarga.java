package metodos;

public class Sobrecarga {
    // Ejemplo de sobrecarga
    private int suma(int x, int y){
        return x + y;
    }
    private double suma(double x, double y){
        return x + y;
    }
    // Ejermplo 2 de Sobrecarga
    private int entero(double x){
        return (int) x;
    }
    private int entero(String x){
        return Integer.parseInt(x);
    }
}
