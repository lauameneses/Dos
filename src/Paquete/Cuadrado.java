package Paquete;

public class Cuadrado extends Figura 
{
	//Variable nativa de la clase, atributo
	float ancho;
	
	//Declaraci�n de un constructor.
	public Cuadrado() 
	{
		ancho = 5;
	}
	
	public Cuadrado(float ancho)
	{
		this.ancho=ancho;
	}
	
	//M�todo que retorna el �rea de un cuadrado
	public float area()
	{
		float area = (float) (Math.pow(ancho, 2)); 
		return area;
	}
	
	// M�todo que retorna el per�metro de un cuadrado
	public float perimetro()
	{
		float peri= (float) 4*ancho;
		return peri;
	}
	
	//M�todo que imprime en consola las caracter�sticas del c�rculo
	public void imprimir()
	{	
		System.out.println("\nSoy un cuadrado, tengo un �rea de: "+area()+" y mi per�metro es: "+perimetro()+"\n");
	}

}
