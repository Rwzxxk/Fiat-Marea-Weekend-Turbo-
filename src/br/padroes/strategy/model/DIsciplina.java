package br.padroes.strategy.model;

import br.padroes.strategy.strategy.MediaStrategy;

/**
 * Classe que representa uma disciplina e usa Strategy para calcular média
 */
public class DIsciplina {
    private String nome;
    private double p1;
    private double p2;
    private double media;
    private String situacao;
    private MediaStrategy estrategia;

    /**
     * Construtor que recebe a estratégia de cálculo
     */
    public DIsciplina(MediaStrategy estrategia) {
        this.estrategia = estrategia;
    }

    /**
     * Calcula a média e a situação usando a estratégia injetada
     */
    public void calcularMedia() {
        // Calcula a média com base na estratégia
        this.media = estrategia.calcularMedia(p1, p2);

        // Verifica a situação com base na média
        this.situacao = estrategia.verificarSituacao(media);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public double getMedia() {
        return media;
    }

    public String getSituacao() {
        return situacao;
    }

    public MediaStrategy getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(MediaStrategy estrategia) {
        this.estrategia = estrategia;
    }
}
