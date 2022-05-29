package com.itacademy.medicamentosbr.bean;

public class ConcessaoTributariaBean {
    private String classificacao;
    private String percentual;
    private String grafico;

    public ConcessaoTributariaBean(String classificacao, String percentual, String grafico) {
        this.classificacao = classificacao;
        this.percentual = percentual;
        this.grafico = grafico;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getPercentual() {
        return percentual;
    }

    public void setPercentual(String percentual) {
        this.percentual = percentual;
    }

    public String getGrafico() {
        return grafico;
    }

    public void setGrafico(String grafico) {
        this.grafico = grafico;
    }

}
