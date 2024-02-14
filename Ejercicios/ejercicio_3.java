package Ejercicios;
//Calcular la suma de todos los múltiplos de 5 comprendidos entre 1 y 100. Calcular además cuantos hay 
//(ver operaciones sobre arrays) y visualizar cada uno de ellos. Utilizar una función que reciba el número 
//de múltiplos de 5 y devuelva un array conteniedo todos los múltiplos de 5 desde el valor del parámetro 
//begin hasta el valor del parámetro end. Realizar otra función que dado un array como parámetro, lo recorra
// de inicio a fin y devuelva la suma de todos sus valores.
public class ejercicio_3 {

    public static void main(String[] args) {
        int contador = 0;
        for(int i = 0; i<100;){
            if(i%5==0){
                contador++;
            }
        }
        allMultiplos(contador);        
        System.out.println("Suma de los multiplos: " + suma(allMultiplos(contador)) );
    }

    public static int[] allMultiplos (int end){
        int begin = 1;
        int [] multiplos = new int[end];
        for(int i = 0;begin<end;begin++,i++){
            int multiplo = 5;
            multiplo = multiplo * begin;
            multiplos[i] = multiplo;
            
        }
        return multiplos;
    }

    public static int suma (int [] arrayMult){
        int suma = 0;
        for (int i = 0; i<arrayMult.length;i++){
            suma = suma + arrayMult[i];
            System.out.println("Multiplo " +(i+1)+ ": " +arrayMult[i]);
        }
        return suma;
    }

    public static void imprimir(int [] arrayMult){
        for(int i = 0; i<arrayMult.length; i++){
            System.out.println("Multiplo " +(i+1)+ ": " +arrayMult[i]);
        }
    }

}
