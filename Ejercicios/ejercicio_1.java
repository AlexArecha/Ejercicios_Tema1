package Ejercicios;
//1. (5 minutos) Escribir un programa que defina variables que representen elnúmero de días de un 
//año, el número de horas que tiene un día, el número de minutos que tiene una hora y el número de 
//segundos que tiene un minuto.Emplear las variables que ocupen el mínimo espacio de memoria posible
//A continuación, calcular el número de segundos que tiene un año y almacenar el valor del cálculo en
// otra variable. Realizar preferiblemente mediante unafunción que reciba como parámetros el número
// de años, meses y días y devuelva el número de segundos de los días, meses y años introducidos

public class ejercicio_1{
    
    public static void main (String[] args){
     byte year = 2;
    byte meses = 5;
    short dias= 120;
    int numSegYear=numSegundos(year,meses,dias);
    System.out.println(numSegYear);
}  
  public static int numSegundos(byte numYear, byte numMeses, short numDias ){
    byte numSeg = 60;
    byte numMin = 60;
    byte numHoras = 24;
    short numDaysYear= 365;
    byte numDaysMes= 30;
    int resultado = ((numYear * numDaysYear) + (numMeses * numDaysMes) + numDias) * numHoras * numMin * numSeg;
    return resultado; 
    }   
}
