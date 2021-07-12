package Paquete;

public class Circulo extends Figura 
{	//Variable nativa de la clase, atributo
	float radio;
	
	//Declaración de un constructor.
	public Circulo() 
	{
		radio = 7;
	}
	
	public Circulo(float radio)
	{
		this.radio=radio;
	}
	
	//Método que retorna el área de un círculo
	public float area()
	{
		float area = (float) ((Math.PI)*(Math.pow(radio, 2))); 
		return area;
	}
	
	// Método que retorna el perímetro de un círculo
	public float perimetro()
	{
		float peri= (float) (2*(Math.PI)*radio);
		return peri;
	}
	
	//Método que imprime en consola las características del círculo
	public void imprimir()
	{	
		System.out.println("\nSoy un círculo, tengo un área de: "+area()+" y mi perímetro es: "+perimetro()+"\n");
	}
}

