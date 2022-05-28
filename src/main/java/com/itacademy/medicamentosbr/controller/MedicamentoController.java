package com.itacademy.medicamentosbr.controller;

import com.itacademy.medicamentosbr.bean.MedicamentoVendaAnoBean;
import com.itacademy.medicamentosbr.service.MedicamentoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MedicamentoController {
    
    @Autowired
    MedicamentoService medicamentoService;

    @GetMapping(value = "/listar-medicamentos-comercializados-2020/{nome}{comercializacao2020}")
    public ResponseEntity<MedicamentoVendaAnoBean> consultarMedicamentoVendaAnoBean (@PathVariable("nome") String nome, @PathVariable ("comercializacao2020") String comercializacao2020) {
        MedicamentoVendaAnoBean medicamentoVendaAnoBean = medicamentoService.consultarMedicamentoVendaAnoBean(nome, comercializacao2020);
        return medicamentoVendaAnoBean == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(medicamentoVendaAnoBean);
    }

}
