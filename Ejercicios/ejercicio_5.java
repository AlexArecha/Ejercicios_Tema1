package Ejercicios;

import java.util.Scanner;

public class ejercicio_5 {
        public static void main(String[] args) {
        System.out.println("Introduce un numero: ");
        Scanner leer = new Scanner(System.in);
        int numero;
        numero = leer.nextInt();
        tablasMultiplicar(numero);
        imprimirTablas(tablasMultiplicar(numero),numero);
    }
    public static int [][] tablasMultiplicar (int numero){
        int tablas [][] = new int[9][9];
            for (int i = 0; i <= numero; i++) {
                for (int j = 0; j <= 9; j++) {
                    tablas[i][j] = i * j;
                }
            }
        return tablas;
    }

    public static void imprimirTablas (int [][] tablas, int numero){
        for(int i = 0; i<= numero; i++) {
            for (int j = 0;j< tablas.length ;j++ ) {
                System.out.println("" + i + "*" + j + "=" + tablas[i][j]);
            }
            System.out.println("");
        }
    }
}
