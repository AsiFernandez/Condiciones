import java.util.Scanner;

public class CualEsMayor {

	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);
		
		
		/*
		 * Cual es mayor con dos numeros
		 */
//		int numero1 = 0;
//		int numero2 = 0;
//		
//		System.out.println("introduce el primer numero");
//		numero1 = Scan.nextInt();
//		System.out.println("Introduce el segundo numero");
//		numero2 = Scan.nextInt();
//		
//		if(numero1 > numero2 ) {
//			System.out.println("el primer numero es mayor");
//		}else if(numero1 < numero2 ) {
//			System.out.println("el segundo numero es mayor");
//		}else {
//			System.out.println("los numeros son iguales");
//		}
		
		
		
		/*
		 * Cual es mayor con 3 numeros
		 */

		int numero1 = 0;
		int numero2 = 0;
		int numero3 = 0;
		
		System.out.println("introduce el primer numero");
		numero1 = Scan.nextInt();
		System.out.println("Introduce el segundo numero");
		numero2 = Scan.nextInt();
		System.out.println("Introduce el tercer numero");
		numero3 = Scan.nextInt();
		
		if(numero1 > numero2 && numero1 > numero3 ) {
			System.out.println("El primer numero es mayor");
		}
		else if( numero2 > numero3 ) {
			System.out.println("El segundo numero es mayor");
		}
		else {
			System.out.println("El tercer numero es mayor");
		}

	}

}
