package principal;

import javax.swing.JOptionPane;
import metodosClaseString.MetodosString;
public class Main {
    public static void main(String[] args){
        MetodosString ejemplo1 = new MetodosString();
        ejemplo1.longitudNombre();
        ejemplo1.agregarTexto();
        ejemplo1.mostrarCaracter();
        ejemplo1.extraerTexto();
        ejemplo1.compararCadenas();
        ejemplo1.verificarCadena();
        ejemplo1.verificarPosicion();
        ejemplo1.reemplazar();
        ejemplo1.eliminarEspacios();
        ejemplo1.mayusculaMinuscula();
    }
}