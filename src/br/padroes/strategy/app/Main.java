package br.padroes.strategy.app;

import br.padroes.strategy.model.DIsciplina;
import br.padroes.strategy.strategy.Aritmetica;
import br.padroes.strategy.strategy.MediaStrategy;

public class Main {
    public static void main(String[] args) {
        // Testando com Média Aritmética
        MediaStrategy estrategia = new Aritmetica();
        DIsciplina d = new DIsciplina(estrategia);

        d.setNome("Padrões de Desenvolvimento");
        d.setP1(10);
        d.setP2(5);
        d.calcularMedia();

        System.out.printf("Disciplina: %s%nP1: %.2f  P2: %.2f  Média: %.2f  Situação: %s%n",
                d.getNome(), d.getP1(), d.getP2(), d.getMedia(), d.getSituacao());

        // Para testar com Média Geométrica, troque:
        // MediaStrategy estrategia = new Geometrica();

        // Implementando o teste com a estratégia geométrica abaixo:
        MediaStrategy estrategiaGeo = new MediaStrategy() {
            @Override
            public double calcularMedia(double p1, double p2) {
                return 0;
            }

            @Override
            public String verificarSituacao(double media) {
                return "";
            }
        };
        DIsciplina d2 = new DIsciplina(estrategiaGeo);

        d2.setNome("Algoritmos");
        d2.setP1(8);
        d2.setP2(6);
        d2.calcularMedia();

        System.out.printf("Disciplina: %s%nP1: %.2f  P2: %.2f  Média: %.2f  Situação: %s%n",
                d2.getNome(), d2.getP1(), d2.getP2(), d2.getMedia(), d2.getSituacao());
    }
}
