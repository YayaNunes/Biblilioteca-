package bibliotecaMetodos;
import java.util.Scanner;

public class algoritmosSele��o {

	public static void main(String[] args) {
		
	}

	public static double Maiorenum() { //esse m�todo retornar o maior numero em 3 entradas
		Scanner entry = new Scanner(System.in);
		double[] numeros = new double[3];
		double max = 0;
		for (int i = 0; i < numeros.length; i++){
		System.out.println("escreva alguns n�meros:");
		numeros[i] = entry.nextDouble();
		max = numeros[0];
		if(numeros[1]>= max) {
		max = numeros[i];}}
		return max;}

	public static double Menorenum() { //esse m�todo retornar o menor n�mero em 3 entradas 
		Scanner entry = new Scanner(System.in);
		double[] numeros = new double[3];
		double min = 0;
		for (int i = 0; i < numeros.length; i++){
		System.out.println("escreva alguns n�meros:");
		numeros[i] = entry.nextDouble();
		min = numeros[0];
		if(numeros[1]<= min) {
		min = numeros[i];}}
		return min;}

			

	
}
