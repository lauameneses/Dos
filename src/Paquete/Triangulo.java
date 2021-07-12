package Paquete;

public class Triangulo extends Figura
{
	//Variable nativa de la clase, atributo
		float lado1;
		float lado2;
		float lado3;
		
		//Declaraci�n de un constructor.
		public Triangulo() 
		{
			lado1 = 4;
			lado2 = 5;
			lado3 = 6;
		}
		
		public Triangulo(float lado1, float lado2, float lado3)
		{
			this.lado1=lado1;
			this.lado2=lado2;
			this.lado3=lado3;
		}
		
		//M�todo que retorna el �rea de un tri�ngulo mediante la f�rmula de Her�n
		public float area()
		{
			float s = (float) (lado1+lado2+lado3)/2; 
			float area = (float) Math.sqrt((s)*(s-lado1)*(s-lado2)*(s-lado3));
			return area;
		}
		
		// M�todo que retorna el per�metro de un tri�ngulo
		public float perimetro()
		{
			float peri= lado1+lado2+lado3;
			return peri;
		}
		
		//M�todo que imprime en consola las caracter�sticas del c�rculo
		public void imprimir()
		{	
			System.out.println("\nSoy un tri�ngulo, tengo un �rea de: "+area()+" y mi per�metro es: "+perimetro()+"\n");
		}
}
