import java.util.Scanner;
public class ParImpar {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);

		int numero;
		
		System.out.println("Introduce un numero para saber si es par o impar");
		numero = Scan.nextInt();
		
		if(numero%2 != 0) {
			System.out.print("Tu numero es impar");
		}else {
			System.out.println("Tu numero es par");
		}
		
	}

}
