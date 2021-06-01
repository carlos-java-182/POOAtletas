package deporte;

import java.util.Scanner;

public class Principal {

	public static int mostrarIndice(Atleta corredor[]) {

		float tiempo;
		int indice = 0;

		tiempo = corredor[0].getTiempo();

		for (int i = 1; i < corredor.length; i++) {

			if (corredor[i].getTiempo() < tiempo) {
				tiempo = corredor[i].getTiempo();
				indice = i;
			}
		}

		return indice;

	}

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String nAtleta;
		String nombre;
		float tiempo;
		int cantAtletas;

		System.out.println("Ingresa la cantidad de atletas");
		cantAtletas = entrada.nextInt();

		Atleta corredor[] = new Atleta[cantAtletas];

		for (int i = 0; i < corredor.length; i++) {
			entrada.nextLine();
			System.out.print("\nIngresa el número del atleta: ");
			nAtleta = entrada.nextLine();
			System.out.print("\nIngresa el nombre: ");
			nombre = entrada.nextLine();
			System.out.println("\n Ingresa el tiempo de la carrera: ");
			tiempo = entrada.nextFloat();
			
			corredor[i] = new Atleta(nAtleta, nombre, tiempo);

		}

		int indiceMRapido = mostrarIndice(corredor);

		System.out.print("El atleta ganador es: ");
		System.out.print(corredor[indiceMRapido].mostrarDatos());

	}

}
