package es.upm.grise.profundizacion.td3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductDeliveryTest {

	DatabaseConnection databaseConnection;

	@BeforeEach
	public void setUp() {
		databaseConnection = mock(DatabaseConnection.class);
	}

	@Test
	public void testDatabaseException() {
		// Configurar el mock para que lance una excepción al conectarse
		try {
			when(databaseConnection.connect()).thenThrow(new Exception("Database connection failed"));

			// Crear la instancia de ProductDelivery con el mock
			assertThrows(DatabaseProblemException.class, () -> {
				new ProductDelivery(databaseConnection);
			});
		} catch (Exception e) {
			fail("Unexpected exception: " + e.getMessage());
		}
	}
}
