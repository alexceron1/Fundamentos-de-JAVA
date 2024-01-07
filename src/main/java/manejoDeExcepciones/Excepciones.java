package manejoDeExcepciones;

public class Excepciones {
    public static void main(String[] args){
        /**
         * Sabemos que al dividir entre cero nos dara una excepcion
         * ya que no es algo comun, por lo cual en caso de que el usuario 
         * ingrese cero se evitara que se rompa la aplicacion 
         * para lo cual se usa la excepcion, si el usuario digita un dato incorrecto se ara la excepcion
         * y se ejecutara el otro bloque de codigo
         */
        try{
            int division = 5/0;
        }catch(Exception e){
            System.out.println("No se puede dividir entre cero");
        }
    }
}
