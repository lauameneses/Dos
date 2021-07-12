package Paquete;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) {
		boolean continuar = true;
		
		while(continuar== true) 
		{
		Scanner lector = new Scanner(System.in);
		System.out.println("Por favor ingrese el n�mero que corresponde a la figura de su elecci�n:\n1. Circulo \n2. Tri�ngulo \n3. Cuadrado: \n4. Salir");
		int figura = lector.nextInt();

		
			if(figura==1) 
			{			
			try 
			{   System.out.println("Ingrese por favor el radio del c�rculo: ");
				float radio = lector.nextFloat();
				Circulo c; //Declaraci�n del objeto c de tipo c�rculo
				c = new Circulo(radio);
				ImpresoraFiguras im;
				im = new ImpresoraFiguras();
				im.imprimir(c);    //Llamado al m�todo imprimir de la clase Circulo
		
			}
			catch(InputMismatchException e) 
			{
				System.out.println("�Ups! ha ingresado un caracter inv�lido");
			}
			
				
			} 
			else if(figura==2) 
			{
			try
			{
				System.out.println("Ingrese por favor el lado 1 del tri�ngulo:");
				float lado1 = lector.nextFloat();
				
				System.out.println("Ingrese por favor el lado 2 del tri�ngulo:");
				float lado2 = lector.nextFloat();
				
				System.out.println("Ingrese por favor el lado 3 del tri�ngulo:");
				float lado3 = lector.nextFloat();
				
				if((lado1<(lado2+lado3))&&(lado2<(lado1+lado3))&&(lado3<(lado1+lado2)))
				{	
					Triangulo t;
					t = new Triangulo(lado1, lado2, lado3);
					ImpresoraFiguras im = new ImpresoraFiguras();
					im.imprimir(t);   //Llamado al m�todo imprimir de la clase Tri�ngulo
				}
				else 
				{
					System.out.println("\nLas longitudes que ha ingresado no corresponden a las de un tri�ngulo.\nRecuerde que  la longitud de cada lado tiene que ser menor que la suma de los otros dos lados.\n");
				}
			}
			catch(InputMismatchException e) 
			{
				System.out.println("�Ups! ha ingresado un caracter inv�lido");
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
				im.imprimir(cu);   //Llamado al m�todo imprimir de la clase Cuadrado
			}
			catch(InputMismatchException e) 
			{
				System.out.println("�Ups! ha ingresado un caracter inv�lido");
			}
			
			}
			else if(figura==4)
				{
					continuar = false;
					
				}
		
			else if((figura>4)||(figura<1)) {
				System.out.println("\n�Ups! opci�n inv�lida.\n");
		}
	}

	}
}
