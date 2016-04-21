package paquete;

public class CalculaArea {
	
	public Integer Cuadrado() {
		Integer area = 0;
		Integer lado = 4; // se asigna valor

		area = lado*lado;	
		return area;
	}
	
	public Integer Triangulo() {
		Integer area2 = 0;
		Integer base = 2; // se asigna valor
		Integer altura = 4; // se asigna valor
		
		area2 = (base*altura)/2;
		return area2;
	}
	
	public Double Circulo() {
		Double area3 = 0d;
		Double pi = 3.14; // para mas precision se puede utilizar 'Math.PI'
		
		Double radio = 1d;
		
		area3 = pi * radio * radio;
		return area3;
	}
		
} //fin
