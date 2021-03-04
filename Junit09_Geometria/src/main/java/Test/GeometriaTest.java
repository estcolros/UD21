package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import JUnit.Junit09_Geometria.dto.Geometria;

class GeometriaTest {

	@Test
	public void testareacuadrado() {
		int resultado = Geometria.areacuadrado(4);
		int esperado = 16;
		assertEquals(resultado, esperado);

	}

	@Test
	public void areaCirculo() {
		double resultado = Geometria.areaCirculo(8);
		double esperado = 201.06;
		double delta = 0.5;
		assertEquals(resultado, esperado, delta);
	}

	@Test
	public void areaRectangulo() {
		int resultado = Geometria.arearectangulo(2, 4);
		int esperado = 8;
		assertEquals(resultado, esperado);
	}

	@Test
	public void areaTriangulo() {
		int resultado = Geometria.areatriangulo(4, 2);
		int esperado = 4;
		assertEquals(resultado, esperado);
	}

	@Test
	public void areaPentagono() {
		int resultado = Geometria.areapentagono(4, 2);
		int esperado = 4;
		assertEquals(resultado, esperado);
	}

	@Test
	public void areaRombo() {
		int resultado = Geometria.arearombo(5, 2);
		int esperado = 5;
		assertEquals(resultado, esperado);
	}

	@Test
	public void areaRomboide() {
		int resultado = Geometria.arearomboide(10, 2);
		int esperado = 20;
		assertEquals(resultado, esperado);
	}

	@Test
	public void areaTrapecio() {
		int resultado = Geometria.areatrapecio(10, 5, 2);
		int esperado = 14;
		assertEquals(resultado, esperado);
	}

	@Test
	public void figura() {
		String resultado = Geometria.figura(1);
		String esperado = "Cuadrado";
		assertEquals(esperado, resultado);
		resultado = Geometria.figura(2);
		esperado = "Circulo";
		assertEquals(esperado, resultado);
		resultado = Geometria.figura(3);
		esperado = "Triangulo";
		assertEquals(esperado, resultado);
		resultado = Geometria.figura(4);
		esperado = "Rectangulo";
		assertEquals(esperado, resultado);
		resultado = Geometria.figura(5);
		esperado = "Pentagono";
		assertEquals(esperado, resultado);
		resultado = Geometria.figura(6);
		esperado = "Rombo";
		assertEquals(esperado, resultado);
		resultado = Geometria.figura(7);
		esperado = "Romboide";
		assertEquals(esperado, resultado);
		resultado = Geometria.figura(8);
		esperado = "Trapecio";
		assertEquals(esperado, resultado);
		resultado = Geometria.figura(9);
		esperado = "Default";
		assertEquals(esperado, resultado);
	}

	@Test
	public void testGetId() {
		Geometria resultado = new Geometria();
		int esperado = 9;
		assertEquals(esperado, resultado.getId());
	}

	@Test
	public void testGetNom() {
		Geometria resultado = new Geometria();
		String esperado = "Default";
		assertEquals(esperado, resultado.getNom());
	}

	@Test
	public void testGetArea() {
		Geometria resultado = new Geometria();
		double esperado = 0.0;
		assertEquals(esperado, resultado.getArea());
	}

	@Test
	public void testSetId() {
		Geometria resultado = new Geometria();
		int esperado = 2;
		resultado.setId(esperado);
		assertEquals(esperado, resultado.getId());
	}

	@Test
	public void testSetNom() {
		Geometria resultado = new Geometria();
		String esperado = "Pentagono";
		resultado.setNom(esperado);
		assertEquals(esperado, resultado.getNom());
	}

	@Test
	public void testSetArea() {
		Geometria resultado = new Geometria();
		double esperado = 5.0;
		resultado.setArea(esperado);
		assertEquals(esperado, resultado.getArea());
	}

	@Test
	public void testToString() {
		Geometria resultado = new Geometria();
		String esperado = "Geometria [id=9, nom=Default, area=0.0]";
		assertEquals(esperado, resultado.toString());
	}

}
