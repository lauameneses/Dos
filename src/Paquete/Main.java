package Paquete;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) {
		boolean continuar = true;
		
		while(continuar== true) 
		{
		Scanner lector = new Scanner(System.in);
		System.out.println("Por favor ingrese el número que corresponde a la figura de su elección:\n1. Circulo \n2. Triángulo \n3. Cuadrado: \n4. Salir");
		int figura = lector.nextInt();

		
			if(figura==1) 
			{			
			try 
			{   System.out.println("Ingrese por favor el radio del círculo: ");
				float radio = lector.nextFloat();
				Circulo c; //Declaración del objeto c de tipo círculo
				c = new Circulo(radio);
				ImpresoraFiguras im;
				im = new ImpresoraFiguras();
				im.imprimir(c);    //Llamado al método imprimir de la clase Circulo
		
			}
			catch(InputMismatchException e) 
			{
				System.out.println("¡Ups! ha ingresado un caracter inválido");
			}
			
				
			} 
			else if(figura==2) 
			{
			try
			{
				System.out.println("Ingrese por favor el lado 1 del triángulo:");
				float lado1 = lector.nextFloat();
				
				System.out.println("Ingrese por favor el lado 2 del triángulo:");
				float lado2 = lector.nextFloat();
				
				System.out.println("Ingrese por favor el lado 3 del triángulo:");
				float lado3 = lector.nextFloat();
				
				if((lado1<(lado2+lado3))&&(lado2<(lado1+lado3))&&(lado3<(lado1+lado2)))
				{	
					Triangulo t;
					t = new Triangulo(lado1, lado2, lado3);
					ImpresoraFiguras im = new ImpresoraFiguras();
					im.imprimir(t);   //Llamado al método imprimir de la clase Triángulo
				}
				else 
				{
					System.out.println("\nLas longitudes que ha ingresado no corresponden a las de un triángulo.\nRecuerde que  la longitud de cada lado tiene que ser menor que la suma de los otros dos lados.\n");
				}
			}
			catch(InputMismatchException e) 
			{
				System.out.println("¡Ups! ha ingresado un caracter inválido");
			}
			}
			else if(figura==3) 
			{	
			try 
			{
				System.out.println("Ingrese por favor el ancho del cuadrado: ");
				float ancho= lector.nextFloat();
				
				Cuadrado cu;
				cu = new Cuadrado(ancho);
				ImpresoraFiguras im = new ImpresoraFiguras();
				im.imprimir(cu);   //Llamado al método imprimir de la clase Cuadrado
			}
			catch(InputMismatchException e) 
			{
				System.out.println("¡Ups! ha ingresado un caracter inválido");
			}
			
			}
			else if(figura==4)
				{
					continuar = false;
					
				}
		
			else if((figura>4)||(figura<1)) {
				System.out.println("\n¡Ups! opción inválida.\n");
		}
	}

	}
}
