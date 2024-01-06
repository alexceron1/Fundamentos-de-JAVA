package manipulaciondeCadenas;

public class ClaseStringBuilder {
    //Se inicializa objeto de la clase StringBuilder con el constructor vacio
    //Tiene una capacidad inicial de 16 posiciones, pero esta cantidad varia a medida se agregan mas datos
    private StringBuilder cadena = new StringBuilder();
    
    private char[] Arreglo = {'A', 'B', 'C', 'D', 'E'};
    private void capacidad(){
        System.out.println("--\nCapacidad del objeto: " + cadena.capacity());
    }
    private void appendFunction(){
        // METODO append(): agregar valores a la secuencia cadena, se puede pasar diferentes parametros
        cadena.append("Hola, soy una cadena... ");
        //cadena.append(Arreglo);
        //cadena.append(Arreglo, 0, 2);
        System.out.println("--\n" + cadena.toString());
    }
    private void borrarDatos(){
        // Este METODO establece la longitud de la cadena en cero, borrando todos los datos almacenados
        cadena.setLength(0);
    }
    private void reverseFunction(){
        borrarDatos();
        cadena.append(Arreglo);
        cadena.reverse();// Este METODO sirve para revertir el orden de la cadena
        System.out.println("--\n"+cadena);
    }
    private void deleteCharacter(){
        //cadena.delete(0, 2);
        cadena.deleteCharAt(0); // Este METODO elimina el caracter almacenado en la posicion indicada
        System.out.println("--\n" + cadena);
    }
    private void obtenerCaracterEspecifico(){
        System.out.println("--\nCaracter almacenado en posicion 0: " + cadena.charAt(0));
    }
    public void mostrarDatos(){
        capacidad();
        appendFunction();
        reverseFunction();
        deleteCharacter();
        obtenerCaracterEspecifico();
    }
}