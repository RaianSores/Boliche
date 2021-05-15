public class CalculadoraPontuacaoBoliche {

    public static final int DEZ = 10;

    public int pontuacaoDoJogo(int[] jogadas) {
        var resultado = 0;
        for (int indice = 0; indice < jogadas.length -1; indice++) {

            if(ehPar(indice) && ehSpare(jogadas[indice], jogadas[indice +1])) {
                int proximaJogada = indice + 2;
                resultado = resultado + jogadas[indice] + jogadas[proximaJogada];

            } else if (ehStrike(jogadas[indice])) {
                int proximaJogada = indice + 2;
                resultado = resultado + jogadas[indice] + jogadas[proximaJogada] + jogadas[indice+1];

            } else {
                resultado = resultado + jogadas[indice];
            }
        }
        return resultado;
    }

    private boolean ehPar(int indice) {
        return indice % 2 == 0;
    }

    private boolean ehSpare(int valorJogada1, int valorJogada2) {
        return valorJogada1 + valorJogada2 == DEZ;
    }

    private boolean ehStrike(int valorStrike) {
        return valorStrike == DEZ;
    }
}
