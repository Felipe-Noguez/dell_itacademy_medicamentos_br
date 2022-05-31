package com.itacademy.medicamentosbr.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import com.itacademy.medicamentosbr.bean.ConcessaoTributariaBean;
import com.itacademy.medicamentosbr.bean.MedicamentoCodigoDeBarrasEan1Bean;
import com.itacademy.medicamentosbr.bean.MedicamentoVendaAnoBean;
import com.itacademy.medicamentosbr.model.Medicamento;
import com.itacademy.medicamentosbr.repository.MedicamentoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicamentoService {
    private static final String NEGATIVA = "Negativa";
    private static final String POSITIVA = "Positiva";
    private static final String NEUTRA = "Neutra";

    @Autowired
    MedicamentoRepository medicamentoRepository;

    public List<MedicamentoVendaAnoBean> buscarMedicamentosComercializadosEm2020PorNome(String nome) {
        List<Medicamento> medicamentos = medicamentoRepository.findByNomeContains(nome).stream()
                .filter(medicamento -> medicamento.getComercializacao2020().equalsIgnoreCase("Sim"))
                .toList();

        if (medicamentos.isEmpty()) {
            return Collections.emptyList();
        }

        List<MedicamentoVendaAnoBean> medicamentosVendaAnoBean = new ArrayList<>();

        for (Medicamento medicamento : medicamentos) {
            MedicamentoVendaAnoBean medicamentoVendaAnoBean = new MedicamentoVendaAnoBean(medicamento.getNome(),
                    medicamento.getProduto(), medicamento.getApresentacao(), medicamento.getPrecoFabricaSemImposto());
            medicamentosVendaAnoBean.add(medicamentoVendaAnoBean);
        }

        return medicamentosVendaAnoBean;

    }

    //Evitar o retorno NullPointerException
    public Optional<MedicamentoCodigoDeBarrasEan1Bean> buscarMedicamentosPorCodigoDeBarrasEan1(String ean1) {
        List<Medicamento> medicamentos = medicamentoRepository.findByEan1(ean1);

        if (medicamentos.isEmpty()) {
            return Optional.empty();
        }

        Double maiorPmc = medicamentos.stream().mapToDouble(Medicamento::getPmc0).max().getAsDouble();
        Double menorPmc = medicamentos.stream().mapToDouble(Medicamento::getPmc0).min().getAsDouble();
        Double diferenca = maiorPmc - menorPmc;

        return Optional.of(new MedicamentoCodigoDeBarrasEan1Bean(ean1, maiorPmc, menorPmc, diferenca, medicamentos.size()));
    }

    public List<ConcessaoTributariaBean> listarComparativoConcessaoDeCreditoTributario() {
        List<String> concessoesCreditoPisCofins = medicamentoRepository.findByComercializacao2020("Sim").stream()
                .map(Medicamento::getConcessaoCreditoPisCofins).toList();

        if(concessoesCreditoPisCofins.isEmpty()) {
            return Collections.emptyList();
        }

        Long negativaCount = concessoesCreditoPisCofins.stream()
                .filter(concessao -> concessao.equalsIgnoreCase(NEGATIVA)).count();
        Long positivaCount = concessoesCreditoPisCofins.stream()
                .filter(concessao -> concessao.equalsIgnoreCase(POSITIVA)).count();
        Long neutraCount = concessoesCreditoPisCofins.stream()
                .filter(concessao -> concessao.equalsIgnoreCase(NEUTRA)).count();
        int total = concessoesCreditoPisCofins.size();

        Double percentualNegativa = calcularPercentualConcessaoCredito(negativaCount, total);
        Double percentualPositiva = calcularPercentualConcessaoCredito(positivaCount, total);
        Double percentualNeutra = calcularPercentualConcessaoCredito(neutraCount, total);
        
        String graficoNegativa = gerarGraficoConcessaoCredito(percentualNegativa.intValue());
        String graficoPositiva = gerarGraficoConcessaoCredito(percentualPositiva.intValue());
        String graficoNeutra = gerarGraficoConcessaoCredito(percentualNeutra.intValue());

        List<ConcessaoTributariaBean> concessoesTributarias = new ArrayList<>();
        concessoesTributarias
                .add(new ConcessaoTributariaBean(NEGATIVA, formatarPercentual(percentualNegativa), graficoNegativa));
        concessoesTributarias
                .add(new ConcessaoTributariaBean(POSITIVA, formatarPercentual(percentualPositiva), graficoPositiva));
        concessoesTributarias
                .add(new ConcessaoTributariaBean(NEUTRA, formatarPercentual(percentualNeutra), graficoNeutra));

        return concessoesTributarias;
    }

    private static String gerarGraficoConcessaoCredito(int tamanho) {
        return "*".repeat(tamanho);
    }

    private static double calcularPercentualConcessaoCredito(Long quantidade, int total) {
        return (double) (quantidade * 100) / total;
    }

    private static String formatarPercentual(double percent) {
        return String.format("%.2f%s", percent, "%");
    }

}
