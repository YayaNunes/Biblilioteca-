package bibliotecaMetodos;
import java.util.Scanner;
public class inversão {

	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		Integer a = entry.nextInt();
		String b = a.toString();
		String c = "";
		for (int i=b.length(); i > 0; i--) {
		c += b.substring(i - 1, i);
		}
		System.out.println("numero invertido:" + c);}

}
