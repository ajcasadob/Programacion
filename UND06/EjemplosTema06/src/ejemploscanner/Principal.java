package ejemploscanner;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		String nombre;
		double notaMedia;
		int edad;
		
		System.out.println("Digame su nombre");
		nombre=sc.nextLine();
		
		System.out.println("Digame su edad");
		edad=Integer.parseInt(sc.nextLine());
		
		System.out.println("Cual es su nota media");
		notaMedia=Double.parseDouble(sc.nextLine());
		
		System.out.printf("Su nombre es %s y su edad es de %d años y su nota media es de %.2f",nombre,edad,notaMedia);
		
		
		try {
			
			
			
		} catch (Exception e) {
		
		}
		
		
		sc.close();
		
	}

}
