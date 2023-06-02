import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorTest {

    @Test
    void deveCalcularExpressaoComFormula() {
        Jogador jogador = new Jogador();
        jogador.setPontuacao1(70);
        jogador.setPontuacao2(100);

        assertEquals(170, jogador.calcularPontuacao());
    }

}