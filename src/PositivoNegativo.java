import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		
		
		Scanner Scan = new Scanner(System.in);
		
		
//		/*
//		 * If 
//		 */
//		
//		System.out.println("Dame un numero");
//		int numero  = Scan.nextInt();
//		
//		if(numero > 0 ){
//			System.out.println("Que bueno soy el numero es positivo");
//		}
//		
//		
//		/*
//		 * Un solo numero y dice si es o no es positivo
//		 * 
//		 * If 
//		 * 
//		 * else
//		 */
//					
//		System.out.println("Dame un numero");
//		int numero2  = Scan.nextInt();
//		
//		if(numero2 > 0 ){
//			System.out.println("Que bueno soy el numero es positivo");
//		}else {
//			System.out.println("el numero no es positivo");
//		}
//				
//		
//		
//		
//		/*
//		 * Un solo numero y dice si es positivo negativo o 0
//		 * If 
//		 * 
//		 * else if 
//		 * 
//		 * else
//		 */
//		
//		
//		System.out.println("Dame un numero");
//		int numero3  = Scan.nextInt();
//		
//		if(numero3 > 0 ){
//			System.out.println("el numero es positivo");
//		}else if(numero3 < 0) {
//			System.out.println("el numero no es positivo");
//		}else {
//			System.out.println("el numero introducido es 0 ");
//		}
//		
//		
//		/*
//		 * If {
//		 * 
//		 * }else{ 
//		 * 		if{}
//		 * 		else{}
//		 * }
//		 */
//		
//		
//		
//		System.out.println("Dame un numero");
//		int numero4  = Scan.nextInt();
//		
//		if(numero4 > 0 ){
//			System.out.println("el numero es positivo");
//		}else {
//			if(numero4 < 0) {
//				System.out.println("el numero no es positivo");
//			}else {
//			System.out.println("el numero introducido es 0 ");
//			}
//		}	
//		
//		
//		/*
//		 * Dos numeros y dice si los dos son o no son postivos		 * 
//		 */
//		
//		System.out.println("Dame un numero");
//		int numero5  = Scan.nextInt();ç
//		System.out.println("Dame otro numero");
//		int numero6  = Scan.nextInt();
//		
//		if((numero5 > 0) && (numero6 > 0)){
//			System.out.println("Los dos numeros son positivos");
//		}else {
//			System.out.println("los dos numeros no son positivos");
//			}
			
		
		/*
		 * dos numeros y dice si los dons son positivos o solo uno es positivo
		 * 
		 */
		
		System.out.println("Dame un numero");
		int numero7  = Scan.nextInt();
		System.out.println("Dame otro numero");
		int numero8 = Scan.nextInt();
		
		if(numero7 >= 0 && numero8 >= 0){
			System.out.println("Los dos numeros son positivos");
		}else if (numero7 >= 0 && numero8 >= 0) {
			System.out.println("El primer numero es positivo");
		}else  {
			System.out.println("El segundo numero es positivo");
		}
			
		
		

	}

}
