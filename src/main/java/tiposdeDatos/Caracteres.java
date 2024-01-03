package tiposdeDatos;

public class Caracteres {
    private char caracter = '\u0040';
    /* Caracteres especiales */
    private char espacio = '\u0020';
    private char tabular = '\t';
    private char retroceso = '\b';
    private char enter = '\n';
    private char retornoCarro = '\r';

    private String saltoLinea = System.lineSeparator();

    public void mostrarDatos(){
        System.out.println("Caracter =" + saltoLinea + caracter);
    }
}
