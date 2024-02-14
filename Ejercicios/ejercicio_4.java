package Ejercicios;
import java.util.Scanner;

//(10 minutos) Escribe un programa que calcule el mínimo y el máximo de
//una lista de números enteros positivos introducidos por el usuario. La lista
//finalizará cuando se introduzca un número negativo. 
public class ejercicio_4 {
    public static void main(String[] args) {
        System.out.println("Introduce una lista de numeros: ");;
        int numero = 1;
        int numeros [] = new int[100];
        Scanner leer = new Scanner(System.in);
        for(int i = 0;numero >= 0; i++){
                numero = leer.nextInt();
                if (numero >= 0){
                    numeros [i] = numero;   
                }
            System.out.println(lista(numeros));
        }

    }
    public static int [] lista (int [] lista){
        for(int i = 1; i<lista.length ; i++){
            if(lista[i]>lista[i-1]){
                lista[i]=lista[i-1];
                lista[i-1]=lista[i];
                i=-1;
            }
        }
        return lista;
    }
}
