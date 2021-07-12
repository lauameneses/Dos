package Paquete;

public class Cuadrado extends Figura 
{
	//Variable nativa de la clase, atributo
	float ancho;
	
	//Declaración de un constructor.
	public Cuadrado() 
	{
		ancho = 5;
	}
	
	public Cuadrado(float ancho)
	{
		this.ancho=ancho;
	}
	
	//Método que retorna el área de un cuadrado
	public float area()
	{
		float area = (float) (Math.pow(ancho, 2)); 
		return area;
	}
	
	// Método que retorna el perímetro de un cuadrado
	public float perimetro()
	{
		float peri= (float) 4*ancho;
		return peri;
	}
	
	//Método que imprime en consola las características del círculo
	public void imprimir()
	{	
		System.out.println("\nSoy un cuadrado, tengo un área de: "+area()+" y mi perímetro es: "+perimetro()+"\n");
	}

}
