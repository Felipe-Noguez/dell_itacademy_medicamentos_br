package com.itacademy.medicamentosbr.bean;

public class MedicamentoCodigoDeBarrasEan1Bean {
    
    private String codigoDeBarrasEan1;
    private Double maior;
    private Double menor;
    private Double diferenca;
    private int quantidade;
    
    public MedicamentoCodigoDeBarrasEan1Bean(String codigoDeBarrasEan1, Double maior, Double menor,
            Double diferenca, int quantidade) {
        this.codigoDeBarrasEan1 = codigoDeBarrasEan1;
        this.maior = maior;
        this.menor = menor;
        this.diferenca = diferenca;
        this.quantidade = quantidade;
    }

    public String getCodigoDeBarrasEan1() {
        return codigoDeBarrasEan1;
    }

    public void setCodigoDeBarrasEan1(String codigoDeBarrasEan1) {
        this.codigoDeBarrasEan1 = codigoDeBarrasEan1;
    }

    public Double getMaior() {
        return maior;
    }

    public void setMaior(Double maior) {
        this.maior = maior;
    }

    public Double getMenor() {
        return menor;
    }

    public void setMenor(Double menor) {
        this.menor = menor;
    }

    public Double getDiferenca() {
        return diferenca;
    }

    public void setDiferenca(Double diferenca) {
        this.diferenca = diferenca;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }    

}
