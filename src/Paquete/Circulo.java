package Paquete;

public class Circulo extends Figura 
{	//Variable nativa de la clase, atributo
	float radio;
	
	//Declaraci�n de un constructor.
	public Circulo() 
	{
		radio = 7;
	}
	
	public Circulo(float radio)
	{
		this.radio=radio;
	}
	
	//M�todo que retorna el �rea de un c�rculo
	public float area()
	{
		float area = (float) ((Math.PI)*(Math.pow(radio, 2))); 
		return area;
	}
	
	// M�todo que retorna el per�metro de un c�rculo
	public float perimetro()
	{
		float peri= (float) (2*(Math.PI)*radio);
		return peri;
	}
	
	//M�todo que imprime en consola las caracter�sticas del c�rculo
	public void imprimir()
	{	
		System.out.println("\nSoy un c�rculo, tengo un �rea de: "+area()+" y mi per�metro es: "+perimetro()+"\n");
	}
}

