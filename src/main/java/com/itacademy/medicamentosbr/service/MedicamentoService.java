package com.itacademy.medicamentosbr.service;

import com.itacademy.medicamentosbr.bean.MedicamentoVendaAnoBean;
import com.itacademy.medicamentosbr.model.Medicamento;
import com.itacademy.medicamentosbr.repository.MedicamentoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicamentoService {

    @Autowired
    MedicamentoRepository medicamentoRepository;

    public MedicamentoVendaAnoBean consultarMedicamentoVendaAnoBean(String nome, String comercializacao2020){
        Medicamento medicamento = medicamentoRepository.findAllByNomeAndComercializacao2020(nome, comercializacao2020);
        return medicamento == null
            ? null
            : new MedicamentoVendaAnoBean(medicamento.getNome(), medicamento.getProduto(), medicamento.getApresentacao(), medicamento.getPfSemImposto());
    }
    
}
