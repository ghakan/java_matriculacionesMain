import com.zubiri.matriculas.Matricula;
import com.zubiri.matriculas.Matriculas;

import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		int seleccion=-1;
		Scanner sc = new Scanner(System.in);

		do {
			try{
				//Visualiza por terminal (stdout) las opciones del menu
				System.out.println("Matricular-------------------------------1");
				System.out.println("Mostrar alumnos matriculados-------------2");
				System.out.println("Obtener Matricula------------------------3");
				System.out.println("Introducir profesor----------------------4");
				System.out.println("Mostrar Profesores-----------------------5");
				System.out.println("SALIR DEL PROGRAMA-----------------------0");
				   
				seleccion = sc.nextInt();
				switch (seleccion) {
					
					case 1: //Matricular alumno
						Matriculas.crearMatriculas(sc);
						//Matricula matricula = new Matricula(sc);
						break;
					
					case 2: 
						System.out.println("Listad de Alumnos matriculados: ");	
						//Matriculas.formatted(Matriculas.matriculas);
						break;	
						
					case 3: 
						Matriculas.obtainMatricula(sc);
						break;
					case 4: 
						Profesor profesor = new Profesor(sc);
						break;
					case 5: 
						Profesor.mostrarProfesores();
						break;
					case 0: //Salimos
						break;
					default:
						System.out.println("No ha insertado la opción correcta");
				}
			}catch(InputMismatchException e){
				System.out.println("No ha insertado la opción correcta");
				sc.nextLine();
			}
		} while (seleccion != 0);
		System.out.println("Gracias por usar mi programa. Que tenga un buen día!");
		sc.close();
	}
}