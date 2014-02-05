/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero mayor a cero, imprima el valor actual desde cero hasta antes de llegar dado valor.

*/

public class whileValue {   

   public static void main(String[] args) {
   		int valorActual =0;
   		int x=0;
   		int numero = Integer.parseInt(args[0].toString());
   		while ( x < numero){
		System.out.println("el valor actual es: "+x);
		x++;
   		}   
   }

}