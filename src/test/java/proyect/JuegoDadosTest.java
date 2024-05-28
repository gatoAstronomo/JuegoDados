package proyect;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class JuegoDadosTest {

    private static JuegoDados juegoDados;

    @BeforeEach
    void setUp() {
        juegoDados = new JuegoDados();
    }

    @AfterEach
    void tearDown() {
        juegoDados = null;
    }

    @Test
    void lanzarDados() {
        juegoDados.lanzarDados();
        for(int i = 0; i < 100; i++)
            assertTrue(juegoDados.getResultado() >= 2 && juegoDados.getResultado() <= 12);
    }


}