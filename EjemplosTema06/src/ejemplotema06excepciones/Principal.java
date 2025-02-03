package ejemplotema06excepciones;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int num=0;
		int den=0;
		double res=0.0;
		
		try {
		System.out.println("Diga usted el numerador");
		num=Integer.parseInt(sc.nextLine());
		System.out.println("Diga usted el denominador");
		Integer.parseInt(sc.nextLine());
		
		res=num/den;
		
		System.out.printf("La división es: %.2f",res);
	
		}catch (ArithmeticException e) {
			System.err.println("No se puede dividir por 0");
		}
		
		catch(NumberFormatException e) {
			
			System.out.println("Deben de ser numeros");
		}
		
		
		sc.close();
		
	}

}
