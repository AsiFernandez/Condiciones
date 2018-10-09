import java.util.Scanner;

public class Numero12 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("introduce el numero 12");
		int numero = Scan.nextInt();
		if(numero == 12 ) {
			System.out.println("Muy bien, sabes cual es el numero 12");
		}else {
			System.out.println("Macho aprendete los numeros");
		}
	}

}
