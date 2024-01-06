package manipulaciondeCadenas;

/**
 * Se implementa el uso de algunos metodos de la clase String
 */
public class ClaseString {
    private String nombre = "Oscar";
    private void longitudNombre(){
        // USO DEL METODO length(): devuelve la longitud de la cadena de texto
        System.out.println("La cadena de caracteres '"+this.nombre+"' tiene "+this.nombre.length()+" letras.");
    }
    private void agregarTexto(){
        // USO DEL METODO concat(): concatenar texto o caracteres a una cadena
        this.nombre=nombre.concat(" Alexander Ceron Hernandez");
        System.out.println("Se concateno mas caracteres: "+this.nombre);
    }
    private void mostrarCaracter(){
        // USO DEL METODO charAt: devuelve el caracter almacenado en el indice dado como parametro, tipo char
        System.out.println("El ultimo caracter de la cadena de texto '"+this.nombre+"' es: "+this.nombre.charAt(this.nombre.length()-1));
    }
    private void extraerTexto(){
        // USO DEL METODO substring(): devuelve el texto a partir del indice indicado por parametro
        System.out.println("Extraer solo a partir del segundo nombre: "+this.nombre.substring(6));
        // tambien acepta dos parametros para extraer texto especifico
        System.out.println("Extraer solo el segundo nombre: "+this.nombre.substring(6, 15));
    }
    private void compararCadenas(){
        String nombre = "ALEXANDER";
        String nombre2 = this.nombre.substring(6, 15);
        /* USO DEL METODO equals(): comparar dos cadenas de caracteres, devuelve un valor booleano
        Toma en cuenta Mayusculas y Minusculas */
        System.out.println("Las cadenas: '"+nombre+"' y '"+nombre2+"' son iguales: "+nombre.equals(nombre2));
        /* USO DEL METODO equalsIgnoreCase(): comparar dos cadenas de caracteres, devuelve un valor booleano
        NO Toma en cuenta Mayusculas y Minusculas */
        System.out.println("Las cadenas: '"+nombre+"' y '"+nombre2+"' son iguales: "+nombre.equalsIgnoreCase(nombre2));
    }
    private void verificarCadena(){
        //USANDO METODO startswith: verificar si la cadena comienza con la subcadena especificada, devuelve boolean
        System.out.println("Cadena: "+this.nombre);
        System.out.println("La cadena inicia con 'Oscar': "+this.nombre.startsWith("Oscar"));
        //USANDO METODO endswith: verificar si la cadena finaliza con la subcadena especificada, devuelve boolean
        System.out.println("La cadena finaliza con 'Hernandez': "+this.nombre.endsWith("Hernandez"));
    }
    private void verificarPosicion(){
        //USANDO METODO indexOf(): devuelve la posicion de la cadena especificada
        System.out.println("Posicion de Alexander: "+this.nombre.indexOf("Alexander"));
        System.out.println("posicion de 'O': "+this.nombre.indexOf("O"));
    }
    private void reemplazar(){
        //USANDO METODO replace(): reemplaza cadena o caracter por uno especificado
        System.out.println("Reemplazar caracter 'a' por 'A': "+this.nombre.replace('a', 'A'));
        System.out.println("Reemplazar subcadena \"Alexander\" por \"ALEX\": "+this.nombre.replace("Alexander", "ALEX"));
    }
    private void eliminarEspacios(){
        // USANDO METODO trim(): Elimina espacios al inicio y final de la cadena
        String nombre = " Oscar Alexander ";
        System.out.println("Originar: \""+nombre+"\"\neliminando espacios: \""+nombre.trim()+"\"");
    }
    private void mayusculaMinuscula(){
        // USANDO METODOS toUpperCase y toLowerCase
        System.out.println("Cadena convertida a minusculas: "+this.nombre.toLowerCase());
        System.out.println("Cadena convertida a mayusculas: "+this.nombre.toUpperCase());
    }
    
    public void mostrarDatos(){
        longitudNombre();
        agregarTexto();
        mostrarCaracter();
        extraerTexto();
        compararCadenas();
        verificarCadena();
        verificarPosicion();
        reemplazar();
        eliminarEspacios();
        mayusculaMinuscula();
    }
}