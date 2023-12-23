package tiposdeDatos;

import javax.swing.JOptionPane;
public class ConvertirDatos {
    private StringBuilder cadena = new StringBuilder("503.3");
    private StringBuffer cadena2 = new StringBuffer("504");
    private StringBuffer boleano = new StringBuffer("true");
    private double decimal = 89.3;
    private void conversiondeDatos(){
        //TIPOS DE DATOS PRIMITIVOS
        int numEntero = (int) decimal; // casteo a entero
        long numEnteroLargo = (long) decimal;
        double numDecimal = (double) numEntero;
        
        // PARSEO
        double numDecimal2 = Double.parseDouble(cadena.toString());
        int numEntero2 = Integer.parseInt(cadena2.toString());
        boolean bol = Boolean.parseBoolean(cadena2.toString());// Devuelve false
        
        // CONVERTIR A CADENA
        String cadena3 = String.valueOf(decimal);
    }
    public void mostrarDatos(){
        conversiondeDatos();
    }
}
