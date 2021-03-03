package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import JUnit.Junit09_Geometria.dto.Geometria;

class GeometriaTest {

	@Test
	public void testareacuadrado() {
		int resultado=Geometria.areacuadrado(4);
		int esperado=16;
		assertEquals(resultado,esperado);
		
		
	}
	
	@Test
	public void areaCirculo() {
		double resultado=Geometria.areaCirculo(8);
		double esperado= 201.06;
		double delta=0.5;
		assertEquals (resultado,esperado,delta);
	}
	
	@Test
	public void areaRectangulo() {
		int resultado=Geometria.arearectangulo(2,4);
		int esperado= 8;
		assertEquals (resultado,esperado);
	}
	

	@Test
	public void areaTriangulo() {
		int resultado=Geometria.areatriangulo(4,2);
		int esperado= 4;
		assertEquals(resultado, esperado);
}
	
	
	@Test
	public void areaPentagono() {
		int resultado=Geometria.areapentagono(4,2);
		int esperado= 4;
		assertEquals(resultado, esperado);
}
	
	
	@Test
	public void areaRombo() {
		int resultado=Geometria.arearombo(5,2);
		int esperado= 5;
		assertEquals(resultado, esperado);
}
	
	@Test
	public void areaRomboide() {
		int resultado=Geometria.arearomboide(10,2);
		int esperado= 20;
		assertEquals(resultado, esperado);
}
	

		@Test
		public void areaTrapecio() {
			int resultado=Geometria.areatrapecio(10,5,2);
			int esperado= 14;
			assertEquals(resultado, esperado);
	}
		
		
		@Test
		public void figura() {
			String resultado=Geometria.figura(5);
			String esperado= "Pentagono";
			assertEquals(resultado, esperado);
	}
	

		
}
