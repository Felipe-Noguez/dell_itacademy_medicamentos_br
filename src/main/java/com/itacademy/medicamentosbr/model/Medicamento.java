package com.itacademy.medicamentosbr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ta_preco_medicamento")
public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "substancia", length = 190)
    private String nome;

    @Column(name = "produto", length = 100)
    private String produto;

    @Column(name = "apresentacao", length = 300)
    private String apresentacao;

    @Column(name = "pf_sem_imposto", length = 13)
    private Double pfSemImposto;

    @Column(name = "comercializacao_2020", length = 6)
    private String comercializacao2020;

    @Column(name = "ean_1", length = 26)
    private String ean1;

    @Column(name = "pmc_0", length = 13)
    private Double pmc0;

    @Column(name = "pmc_20", length = 13)
    private Double pmc20;

    @Column(name = "lista_concessao_credito_pis_cofins", length = 6)
    private String listaConcessaoCreditoPisCofins;

    public Medicamento() {

    }

    public Medicamento(Integer id, String nome, String produto, String apresentacao, Double pfSemImposto,
            String comercializacao2020, String ean1, Double pmc0, Double pmc20,
            String listaConcessaoCreditoPisCofins) {
        this.id = id;
        this.nome = nome;
        this.produto = produto;
        this.apresentacao = apresentacao;
        this.pfSemImposto = pfSemImposto;
        this.comercializacao2020 = comercializacao2020;
        this.ean1 = ean1;
        this.pmc0 = pmc0;
        this.pmc20 = pmc20;
        this.listaConcessaoCreditoPisCofins = listaConcessaoCreditoPisCofins;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getComercializacao2020() {
        return comercializacao2020;
    }

    public void setComercializacao2020(String comercializacao2020) {
        this.comercializacao2020 = comercializacao2020;
    }

    public String getEan1() {
        return ean1;
    }

    public void setEan1(String ean1) {
        this.ean1 = ean1;
    }

    public Double getPmc0() {
        return pmc0;
    }

    public void setPmc0(Double pmc0) {
        this.pmc0 = pmc0;
    }

    public Double getPmc20() {
        return pmc20;
    }

    public void setPmc20(Double pmc20) {
        this.pmc20 = pmc20;
    }

    public String getListaConcessaoCreditoPisCofins() {
        return listaConcessaoCreditoPisCofins;
    }

    public void setListaConcessaoCreditoPisCofins(String listaConcessaoCreditoPisCofins) {
        this.listaConcessaoCreditoPisCofins = listaConcessaoCreditoPisCofins;
    }

}
