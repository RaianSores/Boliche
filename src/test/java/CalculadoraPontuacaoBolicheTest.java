import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraPontuacaoBolicheTest {

    @Test
    public void deve_retornar_zero_quando_errar_todas_as_jogadas() {
        //arrange
        var jogadas = new int[]{0, 0,
                0, 0,
                0, 0,
                0, 0,
                0, 0,
                0, 0,
                0, 0,
                0, 0,
                0, 0, 0};

        //action
        var resultado = new CalculadoraPontuacaoBoliche().pontuacaoDoJogo(jogadas);

        //assert
        assertEquals(0, resultado);
    }

    @Test
    public void deve_retornar_resultato_de_um_jodo_sem_spare_e_sem_strike() {
        //arrange
        var jogadas = new int[]{1, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        //action
        var resultado = new CalculadoraPontuacaoBoliche().pontuacaoDoJogo(jogadas);

        //assert
        assertEquals(7, resultado);
    }

    @Test
    public void deve_retornar_resultato_de_um_jodo_com_spare_e_sem_strike() {
        //arrange
        var jogadas = new int[]{0, 0,
                0, 0,
                0, 0,
                0, 0,
                0, 0,
                0, 0,
                0, 0,
                2, 8,
                2, 3,
                0,0};

        //action
        var resultado = new CalculadoraPontuacaoBoliche().pontuacaoDoJogo(jogadas);

        //assert
        assertEquals(17, resultado);
    }

    @Test
    public void deve_retornar_resultato_de_um_jodo_com_strike_e_sem_spare() {
        //arrange
        var jogadas = new int[]{0, 0,
                0, 0,
                0, 0,
                0, 0,
                0, 0,
                0, 0,
                0, 0,
                10, 2,
                3, 0, 0};

        //action
        var resultado = new CalculadoraPontuacaoBoliche().pontuacaoDoJogo(jogadas);

        //assert
        assertEquals(20, resultado);
    }


}