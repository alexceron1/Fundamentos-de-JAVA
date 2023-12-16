package arrays;

public class Matrices {
    // Declarar Matriz
    private int[][] secuenciaNumeros = new int[3][5];
    // Tambien se puede declarar asi:
    private String[][] nombres = 
    {
        {"Matias", "Ruben", "Anastacio", "Ramiro", "Elsa"},
        {"Diego", "Dario", "Angulo", "Camelo", "Belinda"},
        {"Santi", "Alfonso", "Venito", "Carmona", "Rosalia"}
    };
    // Es lo mismo
    private int[][] numerosPrimos = {{2, 3, 5, 7, 11}, {2, 3, 5, 7, 11}, {2, 3, 5, 7, 11}};
    
    private int num=1;
    public void trabajarConMatrices(){
        // Llenar con datos la matriz
        for(int i=0; i<this.secuenciaNumeros.length; i++){
            for(int j=0; j<this.secuenciaNumeros[i].length; j++){
                this.secuenciaNumeros[i][j] = this.num;
                num++;
            }
        }
        // Recorrer he imprimir matriz
        for (int[] secuenciaNumero : this.secuenciaNumeros) {
            for (int numero : secuenciaNumero) {
                System.out.print(" " + numero + "   ");
            }
            System.out.println();
        }
    }
}
