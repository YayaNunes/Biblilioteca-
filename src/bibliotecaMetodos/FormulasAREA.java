package bibliotecaMetodos;
import java.util.Scanner;
public class FormulasAREA {

	public static void main(String[] args) {
		
	
	}

	public static double quadradoArea() {
		Scanner entry = new Scanner(System.in);
		double lado;
		do{
		System.out.println("Digite o valor do lado do quadrado");
		lado = entry.nextInt();
		}while(lado <= 0);
		double QArea = lado * lado;
		return QArea;}

	public static double Ret�nguloArea() {
	Scanner entry = new Scanner(System.in);
	double base;
	double altura;
	do {
	System.out.println("Digite o valor da base do ret�ngulo:");
	base = entry.nextInt();
	System.out.println("Digite o valor da altura do ret�ngulo:");
	altura = entry.nextInt();
	}while(base <= 0 || altura <= 0);
	double ARetangulo = base * altura;
	return ARetangulo;

	
	
}
	
	public static double Tri�nguloArea() {
		Scanner entry = new Scanner(System.in);
		double altura;
		double base;
		do{
			System.out.println("Digite o valor da base do tri�ngulo:");
			base = entry.nextInt();
			System.out.println("Digite o valor da altura do tri�ngulo:");
			altura = entry.nextInt();
			}while(base <= 0 || altura <= 0);
			double ATriangulo = base * altura /2 ;
			return ATriangulo;}

	public static double circuloArea() {
		Scanner entry = new Scanner(System.in);
		double raio;
		do {
		System.out.println("Digite o valor do raio do circulo:");
		raio = entry.nextInt();
		}while(raio <= 0);
		double ACiruclo= 3.14 * Math.pow(raio, 2);
		return ACiruclo;}

	public static double circurferenciaArea(){
		Scanner entry = new Scanner(System.in);
		double raio;
		do {
		System.out.println("Digite o valor do raio da circunfer�ncia:");
		raio = entry.nextInt();
		}while(raio <= 0);
		double ACircurferencia = 3.14 * 2 * raio;
		return ACircurferencia;}

	public static double volumeCone() {
		Scanner entry = new Scanner(System.in);
		double altura;
		do {
		System.out.println("Digite a altura do cone:");
		altura = entry.nextInt();
		}while(altura <= 0);
		double cone = altura * circuloArea() ;
		return cone;}

	public static double volumePir�mide() {
		Scanner entry = new Scanner(System.in);
		double altura;
		do {
		System.out.println("Digite a altura do cone:");
		altura = entry.nextInt();
		}while(altura <= 0);
		double VPir�mide = altura * quadradoArea() ;
		return VPir�mide;}

	public static double volumePretangular () {

		Scanner entry = new Scanner(System.in);
		double altura;
		do {
		System.out.println("Digite a altura do prisma de base retangular :");
		altura = entry.nextInt();
		}while(altura <= 0);
		double VPRetangular = altura * Ret�nguloArea(); ;
		return VPRetangular;}
	public static double volumePtriangular () {

		Scanner entry = new Scanner(System.in);
		double altura;
		do {
		System.out.println("Digite a altura do prisma de base triangular :");
		altura = entry.nextInt();
		}while(altura <= 0);
		double VPTriangular = altura * Tri�nguloArea(); ;
		return VPTriangular;}

	



}
	
	
