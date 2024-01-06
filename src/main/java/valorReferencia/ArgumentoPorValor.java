package valorReferencia;

public class ArgumentoPorValor {
    public static void main(String[] args){
        int num = 100;
        StringBuilder texto = new StringBuilder("hola");
        System.out.println("Valor inicial de num, en el metodo main: " + num);
        test(num);
        System.out.println("Valor final de num (se mantiene igual), en el metodo main: " + num);
    }

    public static void test(int i){
        System.out.println("Valor inicial de i, en el metodo test: " + i);
        i = 150;
        System.out.println("Valor final de i, en el metodo test: " + i);
    }
    
}
