package valorReferencia;

class Persona {
    private String nombre;

    public void modificarNombre(String nombre){
        this.nombre = nombre;
    }
    public String leerNombre(){
        return nombre;
    }
}
public class ArgumentoPorReferencia2 {
    public static void main(String[] args){
        Persona persona = new Persona();
        persona.modificarNombre("Oscar");
        System.out.println("Antes del metodo test");
        System.out.println("Nombre antes del metodo test: " + persona.leerNombre());
        test(persona);
        System.out.println("\n\nDespues del metodo test (Se aplican los cambios)");
        System.out.println("Nombre despues del metodo test: " + persona.leerNombre());
    }
    public static void test(Persona persona){
        System.out.println("\nInicia el metodo test");
        persona.modificarNombre("Alexander");
        System.out.println("Finaliza el metodo test");
    }
}