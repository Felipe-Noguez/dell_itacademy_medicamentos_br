package com.itacademy.medicamentosbr.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
            MedicamentoVendaAnoBean medicamentoVendaAnoBean = new MedicamentoVendaAnoBean(medicamento.getNome(), medicamento.getProduto(), medicamento.getApresentacao(), medicamento.getPfSemImposto());            
            medicamentosVendaAnoBean.add(medicamentoVendaAnoBean);
        }

        return medicamentosVendaAnoBean;

    }

}
