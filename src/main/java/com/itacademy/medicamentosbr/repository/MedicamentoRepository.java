package com.itacademy.medicamentosbr.repository;

import java.util.List;

import com.itacademy.medicamentosbr.model.Medicamento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MedicamentoRepository extends JpaRepository <Medicamento, Integer> {

    //Tazer lista de medicamentos comercializado no ano de 2020.
    Medicamento findAllByNomeAndComercializacao2020(String nome, String comercializacao2020);
    //List<Medicamento> findAllNome(String nome);


    //@Query("SELECT MAX() itacademymedicamentos.ta_preco_medicamento AS substancia FROM Medicamento")
    //List<Medicamento> findAllMedicamentos();
    
}
