package Paquete;

public class Triangulo extends Figura
{
	//Variable nativa de la clase, atributo
		float lado1;
		float lado2;
		float lado3;
		
		//Declaración de un constructor.
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
		
		//Método que retorna el área de un triángulo mediante la fórmula de Herón
		public float area()
		{
			float s = (float) (lado1+lado2+lado3)/2; 
			float area = (float) Math.sqrt((s)*(s-lado1)*(s-lado2)*(s-lado3));
			return area;
		}
		
		// Método que retorna el perímetro de un triángulo
		public float perimetro()
		{
			float peri= lado1+lado2+lado3;
			return peri;
		}
		
		//Método que imprime en consola las características del círculo
		public void imprimir()
		{	
			System.out.println("\nSoy un triángulo, tengo un área de: "+area()+" y mi perímetro es: "+perimetro()+"\n");
		}
}
