package com.itacademy.medicamentosbr.controller;

import java.util.List;

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

    @GetMapping(value = "/listar-medicamentos-comercializados-2020/{nome}")
    public ResponseEntity<List<MedicamentoVendaAnoBean>> consultarMedicamentoVendaAnoBean (@PathVariable("nome") String nome) {
        List<MedicamentoVendaAnoBean> medicamentosVendaAnoBean = medicamentoService.buscarMedicamentosComercializadosEm2020PorNome(nome);
        return medicamentosVendaAnoBean.isEmpty() ? ResponseEntity.notFound().build() : ResponseEntity.ok(medicamentosVendaAnoBean);
    }

}
