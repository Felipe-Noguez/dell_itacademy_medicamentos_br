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

    @Column(name = "cnpj")
    private String cnpj;

    @Column(name = "laboratorio")
    private String laboratorio;

    @Column(name = "codigo_ggrem")
    private String codigoGgrem;

    @Column(name = "registro")
    private String registro;

    @Column(name = "ean_1", length = 26)
    private String ean1;

    @Column(name = "ean_2")
    private String ean2;

    @Column(name = "ean_3")
    private String ean3;

    @Column(name = "produto", length = 100)
    private String produto;

    @Column(name = "apresentacao", length = 300)
    private String apresentacao;

    @Column(name = "classeterapeutica")
    private String classeTerapeutica;

    @Column(name = "status_produto")
    private String statusProduto;

    @Column(name = "regime_preco")
    private String regimePreco;

    @Column(name = "pf_sem_imposto", length = 13)
    private Double precoFabricaSemImposto;   

    @Column(name = "pf_0")
    private String precoFabrica0;

    @Column(name = "pf_12")
    private String precoFabrica12;

    @Column(name = "pf_17")
    private String precoFabrica17;

    @Column(name = "pf_17_alc")
    private String precoFabrica17Alc;

    @Column(name = "pf_17_5")
    private String precoFabrica175;

    @Column(name = "pf_17_5_alc")
    private String precoFabrica175Alc;

    @Column(name = "pf_18")
    private String precoFabrica18;

    @Column(name = "pf_18_alc")
    private String precoFabrica18Alc;

    @Column(name = "pf_20")
    private String precoFabrica20;

    @Column(name = "pmc_0", length = 13)
    private Double pmc0;

    @Column(name = "pmc_12")
    private Double pmc12;

    @Column(name = "pmc_17")
    private Double pmc17;

    @Column(name = "pmc_17_alc")
    private Double pmc17Alc;

    @Column(name = "pmc_17_5")
    private Double pmc175;

    @Column(name = "pmc_17_5_alc")
    private Double pmc175Alc;

    @Column(name = "pmc_18")
    private Double pmc18;

    @Column(name = "pmc_18_alc")
    private Double pmc18Alc;

    @Column(name = "pmc_20", length = 13)
    private Double pmc20;

    @Column(name = "restricao_hospitalar")
    private String restricaoHospitalar;

    @Column(name = "cap")
    private String cap;

    @Column(name = "confaz_87")
    private String confaz87;

    @Column(name = "icms_0")
    private String icms0;

    @Column(name = "analise_recursal")
    private String analiseRecursal;

    @Column(name = "lista_concessao_credito_pis_cofins", length = 6)
    private String concessaoCreditoPisCofins;

    @Column(name = "comercializacao_2020", length = 6)
    private String comercializacao2020;

    @Column(name = "tarja")
    private String tarja;

    public Medicamento() {
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getCodigoGgrem() {
        return codigoGgrem;
    }

    public void setCodigoGgrem(String codigoGgrem) {
        this.codigoGgrem = codigoGgrem;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getEan1() {
        return ean1;
    }

    public void setEan1(String ean1) {
        this.ean1 = ean1;
    }

    public String getEan2() {
        return ean2;
    }

    public void setEan2(String ean2) {
        this.ean2 = ean2;
    }

    public String getEan3() {
        return ean3;
    }

    public void setEan3(String ean3) {
        this.ean3 = ean3;
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

    public String getClasseTerapeutica() {
        return classeTerapeutica;
    }

    public void setClasseTerapeutica(String classeTerapeutica) {
        this.classeTerapeutica = classeTerapeutica;
    }

    public String getStatusProduto() {
        return statusProduto;
    }

    public void setStatusProduto(String statusProduto) {
        this.statusProduto = statusProduto;
    }

    public String getRegimePreco() {
        return regimePreco;
    }

    public void setRegimePreco(String regimePreco) {
        this.regimePreco = regimePreco;
    }

    public Double getPrecoFabricaSemImposto() {
        return precoFabricaSemImposto;
    }

    public void setPrecoFabricaSemImposto(Double precoFabricaSemImposto) {
        this.precoFabricaSemImposto = precoFabricaSemImposto;
    }

    public String getPrecoFabrica0() {
        return precoFabrica0;
    }

    public void setPrecoFabrica0(String precoFabrica0) {
        this.precoFabrica0 = precoFabrica0;
    }

    public String getPrecoFabrica12() {
        return precoFabrica12;
    }

    public void setPrecoFabrica12(String precoFabrica12) {
        this.precoFabrica12 = precoFabrica12;
    }

    public String getPrecoFabrica17() {
        return precoFabrica17;
    }

    public void setPrecoFabrica17(String precoFabrica17) {
        this.precoFabrica17 = precoFabrica17;
    }

    public String getPrecoFabrica17Alc() {
        return precoFabrica17Alc;
    }

    public void setPrecoFabrica17Alc(String precoFabrica17Alc) {
        this.precoFabrica17Alc = precoFabrica17Alc;
    }

    public String getPrecoFabrica175() {
        return precoFabrica175;
    }

    public void setPrecoFabrica175(String precoFabrica175) {
        this.precoFabrica175 = precoFabrica175;
    }

    public String getPrecoFabrica175Alc() {
        return precoFabrica175Alc;
    }

    public void setPrecoFabrica175Alc(String precoFabrica175Alc) {
        this.precoFabrica175Alc = precoFabrica175Alc;
    }

    public String getPrecoFabrica18() {
        return precoFabrica18;
    }

    public void setPrecoFabrica18(String precoFabrica18) {
        this.precoFabrica18 = precoFabrica18;
    }

    public String getPrecoFabrica18Alc() {
        return precoFabrica18Alc;
    }

    public void setPrecoFabrica18Alc(String precoFabrica18Alc) {
        this.precoFabrica18Alc = precoFabrica18Alc;
    }

    public String getPrecoFabrica20() {
        return precoFabrica20;
    }

    public void setPrecoFabrica20(String precoFabrica20) {
        this.precoFabrica20 = precoFabrica20;
    }

    public Double getPmc0() {
        return pmc0;
    }

    public void setPmc0(Double pmc0) {
        this.pmc0 = pmc0;
    }

    public Double getPmc12() {
        return pmc12;
    }

    public void setPmc12(Double pmc12) {
        this.pmc12 = pmc12;
    }

    public Double getPmc17() {
        return pmc17;
    }

    public void setPmc17(Double pmc17) {
        this.pmc17 = pmc17;
    }

    public Double getPmc17Alc() {
        return pmc17Alc;
    }

    public void setPmc17Alc(Double pmc17Alc) {
        this.pmc17Alc = pmc17Alc;
    }

    public Double getPmc175() {
        return pmc175;
    }

    public void setPmc175(Double pmc175) {
        this.pmc175 = pmc175;
    }

    public Double getPmc175Alc() {
        return pmc175Alc;
    }

    public void setPmc175Alc(Double pmc175Alc) {
        this.pmc175Alc = pmc175Alc;
    }

    public Double getPmc18() {
        return pmc18;
    }

    public void setPmc18(Double pmc18) {
        this.pmc18 = pmc18;
    }

    public Double getPmc18Alc() {
        return pmc18Alc;
    }

    public void setPmc18Alc(Double pmc18Alc) {
        this.pmc18Alc = pmc18Alc;
    }

    public Double getPmc20() {
        return pmc20;
    }

    public void setPmc20(Double pmc20) {
        this.pmc20 = pmc20;
    }

    public String getRestricaoHospitalar() {
        return restricaoHospitalar;
    }

    public void setRestricaoHospitalar(String restricaoHospitalar) {
        this.restricaoHospitalar = restricaoHospitalar;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getConfaz87() {
        return confaz87;
    }

    public void setConfaz87(String confaz87) {
        this.confaz87 = confaz87;
    }

    public String getIcms0() {
        return icms0;
    }

    public void setIcms0(String icms0) {
        this.icms0 = icms0;
    }

    public String getAnaliseRecursal() {
        return analiseRecursal;
    }

    public void setAnaliseRecursal(String analiseRecursal) {
        this.analiseRecursal = analiseRecursal;
    }

    public String getConcessaoCreditoPisCofins() {
        return concessaoCreditoPisCofins;
    }

    public void setConcessaoCreditoPisCofins(String concessaoCreditoPisCofins) {
        this.concessaoCreditoPisCofins = concessaoCreditoPisCofins;
    }

    public String getComercializacao2020() {
        return comercializacao2020;
    }

    public void setComercializacao2020(String comercializacao2020) {
        this.comercializacao2020 = comercializacao2020;
    }

    public String getTarja() {
        return tarja;
    }

    public void setTarja(String tarja) {
        this.tarja = tarja;
    }

}
