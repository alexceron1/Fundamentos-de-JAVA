package tiposdeDatos;

public class Primitivos {
    /* ENTEROS */
    private byte entero1 = 127;
    private short entero2 = 32767;
    private int entero3 = 12000000;
    private long entero4 = 2489000000L;
    /* DECIMALES */
    private float decimal1 = 12.2f;
    private double decimal2 = 12000.34;

    private void tipoByte(){
        System.out.println("Tipo de dato byte --------\nentero1 = " + entero1);
        System.out.println("Tamaño de byte: " + Byte.BYTES);
        System.out.println("Cantidad de bites: " + Byte.SIZE);
        System.out.println("Capacidad maxima: " + Byte.MAX_VALUE);
        System.out.println("Capacidad minima: " + Byte.MIN_VALUE);
    }
    private void tipoShort(){
        System.out.println("\nTipo de dato short --------\nentero2 = " + entero2);
        System.out.println("Tamaño de byte: " + Short.BYTES);
        System.out.println("Cantidad de bites: " + Short.SIZE);
        System.out.println("Capacidad maxima: " + Short.MAX_VALUE);
        System.out.println("Capacidad minima: " + Short.MIN_VALUE);
    }
    private void tipoInteger(){
        System.out.println("\nTipo de dato int --------\nentero3 = " + entero3);
        System.out.println("Tamaño de byte: " + Integer.BYTES);
        System.out.println("Cantidad de bites: " + Integer.SIZE);
        System.out.println("Capacidad maxima: " + Integer.MAX_VALUE);
        System.out.println("Capacidad minima: " + Integer.MIN_VALUE);
    }
    private void tipoLong(){
        System.out.println("\nTipo de dato long --------\nentero4 = " + entero4);
        System.out.println("Tamaño de byte: " + Long.BYTES);
        System.out.println("Cantidad de bites: " + Long.SIZE);
        System.out.println("Capacidad maxima: " + Long.MAX_VALUE);
        System.out.println("Capacidad minima: " + Long.MIN_VALUE);
    }

    private void tipoFloat(){
        System.out.println("\nTipo de dato float --------\ndecimal1 = " + decimal1);
        System.out.println("Tamaño de byte: " + Float.BYTES);
        System.out.println("Cantidad de bites: " + Float.SIZE);
        System.out.println("Capacidad maxima: " + Float.MAX_VALUE);
        System.out.println("Capacidad minima: " + Float.MIN_VALUE);
    } 
    private void tipoDouble(){
        System.out.println("\nTipo de dato double --------\ndecimal2 = " + decimal2);
        System.out.println("Tamaño de byte: " + Double.BYTES);
        System.out.println("Cantidad de bites: " + Double.SIZE);
        System.out.println("Capacidad maxima: " + Double.MAX_VALUE);
        System.out.println("Capacidad minima: " + Double.MIN_VALUE);
    }

    public void mostrarDatos(){
        /* tipoByte();
        tipoShort();
        tipoInteger();
        tipoLong(); */
        tipoFloat();
        tipoDouble();
    }
}
