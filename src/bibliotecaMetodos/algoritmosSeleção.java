package bibliotecaMetodos;
import java.util.Scanner;

public class algoritmosSeleção {

	public static void main(String[] args) {
		
	}

	public static double Maiorenum() { //esse método retornar o maior numero em 3 entradas
		Scanner entry = new Scanner(System.in);
		double[] numeros = new double[3];
		double max = 0;
		for (int i = 0; i < numeros.length; i++){
		System.out.println("escreva alguns números:");
		numeros[i] = entry.nextDouble();
		max = numeros[0];
		if(numeros[1]>= max) {
		max = numeros[i];}}
		return max;}

	public static double Menorenum() { //esse método retornar o menor número em 3 entradas 
		Scanner entry = new Scanner(System.in);
		double[] numeros = new double[3];
		double min = 0;
		for (int i = 0; i < numeros.length; i++){
		System.out.println("escreva alguns números:");
		numeros[i] = entry.nextDouble();
		min = numeros[0];
		if(numeros[1]<= min) {
		min = numeros[i];}}
		return min;}

			

	
}
