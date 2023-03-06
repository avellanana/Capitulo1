package EjeAssert;

import org.junit.jupiter.api.Test;

import proyectoPrueba.ExcepcionBlanco;
import proyectoPrueba.ExcepcionNumero;
import proyectoPrueba.ExcepcionSalida;
import proyectoPrueba.ExcepcionVocal;

public class TestUnit {

	LeerPorTeclado leer1 = new LeerPorTeclado();
			
	@Test
	void testSingleSuccessTest() {
		
		try{
			leer1.devolverValor();
		} catch (ExcepcionVocal e) {
			System.out.println(e.getMessage());
		} catch (ExcepcionBlanco e) {
			System.out.println(e.getMessage());
		} catch (ExcepcionNumero e) {
			System.out.println(e.getMessage());
		} catch (ExcepcionSalida e) {
			System.out.println(e.getMessage());
	}
}
}
