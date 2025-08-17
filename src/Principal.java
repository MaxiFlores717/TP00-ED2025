import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);

		int p = 0;
		while (p != 7) {
			System.out.println("**********************************");
			System.out.println("----  Menú  ----");
			System.out.println("----------------------------------");
			System.out.println("1.Conversor de unidades ");
			System.out.println("2.Resta");
			System.out.println("3.División ");
			System.out.println("4.Multiplicación ");
			System.out.println("5.Potencia ");
			System.out.println("6.Raiz ");
			System.out.println("7.Salir ");
			System.out.println("Ingrese una opcion: ");
			p = leer.nextInt();
			switch (p) {
			case 1:
				System.out.println("1.Conversor de longitud ");
				System.out.println("2.Connversor de temperatura ");
				System.out.println("Ingrese una opcion: ");
				p = leer.nextInt();
				switch (p) {
				case 1: {
					System.out.println();
				}
				case 2: {

				}
				default:
					System.out.println("A seleccionado una opción incorrecta");
				}
				break;
			case 2:
				System.out.println("El resultado de la resta es: " + unacalculadora.Resta());
				break;
			case 3:
				System.out.println("El resultado de la division es: " + unacalculadora.Division());
				break;
			case 4:
				System.out.println("El resultado de la multiplicacion es: " + unacalculadora.Multiplicacion());
				break;
			case 5:
				System.out.println("El resultado de la potencia es: " + unacalculadora.Potencia());
				break;
			case 6:
				System.out.println("El resultado de la raiz es: " + unacalculadora.Raiz());
				break;
			case 7:
				System.out.println("A salido del programa");
				System.exit(0);
				break;
			default:
				System.out.println("A seleccionado una opción incorrecta");
			}
		}
	}

}
