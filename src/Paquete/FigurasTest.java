package Paquete;

import static org.junit.Assert.*;

import org.junit.Test;

public class FigurasTest {

	@Test
	public void testCirculo() {
		Circulo c = new Circulo(5);
		float resultado1 = c.area();
		float resultado2 = c.perimetro();
		float esperado1 = (float) 78.53982;
		float esperado2 = (float) 31.415926;
		assertEquals(esperado1, resultado1, 0);
		assertEquals(esperado2, resultado2, 0);
	}
	@Test
	public void testTriangulo() {
		Triangulo t = new Triangulo(4, 5, 7);
		float resultado1 = t.area();
		float resultado2 = t.perimetro();
		float esperado1 = (float) 9.797959;
		float esperado2 = (float) 16.0;
		assertEquals(esperado1, resultado1, 0);
		assertEquals(esperado2, resultado2, 0);
		
	}
	@Test
	public void testCuadrado() {
		Cuadrado cu = new Cuadrado(7);
		float resultado1 = cu.area();
		float resultado2 = cu.perimetro();
		float esperado1 = (float) 49.0 ;
		float esperado2 = (float) 28.0;
		assertEquals(esperado1, resultado1, 0);
		assertEquals(esperado2, resultado2, 0);
	}
	
}


