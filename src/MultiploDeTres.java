import java.util.Scanner;

public class MultiploDeTres {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("introduce un numero y te dire si es multiplo de 3");
		int numero = Scan.nextInt();
		
		if(numero%3 == 0) {
			System.out.println("el numero es multiplo de tres");
		}else {
			System.out.println("el numero no es multiplo de tres");
		}
		
	}
}
