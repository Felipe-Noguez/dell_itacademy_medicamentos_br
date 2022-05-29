package com.itacademy.medicamentosbr.repository;

import java.util.List;

import com.itacademy.medicamentosbr.model.Medicamento;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Integer> {

    List<Medicamento> findByNomeContains(String nome);

    List<Medicamento> findByEan1(String ean1);

}
