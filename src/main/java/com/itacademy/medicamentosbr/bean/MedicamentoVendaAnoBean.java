package com.itacademy.medicamentosbr.bean;

/*
Classe para filtrar os atributos:
Por nome e vendidos em 2020.
*/

public class MedicamentoVendaAnoBean {

    private String nome;
    private String produto;
    private String apresentacao;
    private Double pfSemImposto;    

    public MedicamentoVendaAnoBean(String nome, String produto, String apresentacao, Double pfSemImposto) {
        this.nome = nome;
        this.produto = produto;
        this.apresentacao = apresentacao;
        this.pfSemImposto = pfSemImposto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getApresentacao() {
        return apresentacao;
    }

    public void setApresentacao(String apresentacao) {
        this.apresentacao = apresentacao;
    }

    public Double getPfSemImposto() {
        return pfSemImposto;
    }

    public void setPfSemImposto(Double pfSemImposto) {
        this.pfSemImposto = pfSemImposto;
    }    
    
}
