package paquete;

import static org.junit.Assert.*;

import org.junit.Test;

import paquete.CalculaArea;

public class CalculaAreaTest {

	@Test
	public void testAreaCuadrado() {
		CalculaArea miArea = new CalculaArea();
		Integer valorEsperado = 16;
		
		Integer valorObtenido = miArea.Cuadrado();
		
		assertEquals(valorEsperado,valorObtenido);
		
		System.out.print("\nEl Area del Cuadrado es: " + valorObtenido);
	}
	
	@Test
	public void testAreaTriangulo() {
		CalculaArea miArea = new CalculaArea();
		Integer valorEsperado = 4;
		
		Integer valorObtenido = miArea.Triangulo();
		
		assertEquals(valorEsperado,valorObtenido);
		
		System.out.print("El Area del Triangulo es: " + valorObtenido);
	}
	
	@Test
	public void testAreaCirculo() {
		CalculaArea miArea = new CalculaArea();
		Double valorEsperado = 3.14;
		
		Double valorObtenido = miArea.Circulo();
		
		assertEquals(valorEsperado, valorObtenido, 0.00d);
		
		System.out.print("\nEl Area del Circulo es: " + valorObtenido);
	}
	

} // fin
