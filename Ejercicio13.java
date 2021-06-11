
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String args[])  {

		Scanner scanner = new Scanner(System.in);

		double num1;
		double num2;
		int opc;
		double resultado;
		do {
			System.out.println("Elija una opcion:");
			System.out.println("1. Suma");
			System.out.println("2. Division");
			System.out.println("3. Salir");
			opc = scanner.nextInt();
			if (opc<3 && opc>0) {
				System.out.println("Ingrese el primer numero:");
				num1 = scanner.nextInt();
				System.out.println("Ingrese el segundo numero:");
				num2 = scanner.nextInt();
				if (opc==1) {
					resultado = num1+num2;
					System.out.println("El resultado de la suma es: "+resultado);
				}
				if (opc==2) {
					if (num2==0) {
						System.out.println("No se puede dividir entre 0");
					} else {
						resultado = num1/num2;
						System.out.println("El resultado de la division es: "+resultado);
					}
				}
			}
		} while (opc!=3);
	}


}

