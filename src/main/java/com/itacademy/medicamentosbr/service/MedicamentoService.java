package com.itacademy.medicamentosbr.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.itacademy.medicamentosbr.bean.MedicamentoCodigoDeBarrasEan1Bean;
import com.itacademy.medicamentosbr.bean.MedicamentoVendaAnoBean;
import com.itacademy.medicamentosbr.model.Medicamento;
import com.itacademy.medicamentosbr.repository.MedicamentoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicamentoService {

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
                    medicamento.getProduto(), medicamento.getApresentacao(), medicamento.getPfSemImposto());
            medicamentosVendaAnoBean.add(medicamentoVendaAnoBean);
        }

        return medicamentosVendaAnoBean;

    }

    public MedicamentoCodigoDeBarrasEan1Bean buscarMedicamentosPorCodigoDeBarrasEan1(String ean1) {
        List<Medicamento> medicamentos = medicamentoRepository.findByEan1(ean1);

        if (medicamentos.isEmpty()) {
            return null;
        }

        Double maiorPmc = medicamentos.stream().mapToDouble(Medicamento::getPmc0).max().getAsDouble();
        Double menorPmc = medicamentos.stream().mapToDouble(Medicamento::getPmc0).min().getAsDouble();
        Double diferenca = maiorPmc - menorPmc;

        return new MedicamentoCodigoDeBarrasEan1Bean(ean1, maiorPmc, menorPmc, diferenca, medicamentos.size());
    }

}
