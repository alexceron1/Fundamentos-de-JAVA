package clasesWrapper;

public class WrapperBoolean {
    public static void main(String[] args){
        Integer num1, num2;
        num1 = 15;
        num2 = 10;

        boolean primBool = num1 > num2;
        Boolean objBool = Boolean.valueOf(primBool);
        Boolean objBool2 = Boolean.valueOf("true");

        System.out.println("primBool: " + primBool);
        System.out.println("objBool: " + objBool);
        System.out.println("\nSon iguales: " + (objBool == primBool));
        System.out.println("Son iguales: " + (objBool.equals(primBool)));
        System.out.println("Son iguales: " + (objBool == objBool2));
    }
}
