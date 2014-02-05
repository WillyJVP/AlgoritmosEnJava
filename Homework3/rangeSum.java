/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:
Dados 2 numeros (limite inferior y superior), recorra el rango e imprima los numeros dentro de este rango.

*/

public class rangeSum {   

   public static void main(String[] args) {
   		int limiteInf = Integer.parseInt(args[0].toString());
   		int limiteSup = Integer.parseInt(args[1].toString());
		for (int x=limiteInf+1; x<limiteSup;x++ ) {
			System.out.println (x);
		} 
   }

}