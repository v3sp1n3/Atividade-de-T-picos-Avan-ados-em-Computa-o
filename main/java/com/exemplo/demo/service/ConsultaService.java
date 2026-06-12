package com.exemplo.demo.service;

import com.exemplo.demo.dto.ResumoConsultasDTO;
import com.exemplo.demo.repository.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ConsultaService {

    @Autowired
    private ConsultaRepository consultaRepository;

    public ResumoConsultasDTO gerarResumo() {
        List<Consulta> consultas = consultaRepository.findAll();

        int totalConsultas = 0;
        int totalCachorros = 0;
        int totalGatos = 0;
        int somaIdades = 0;

        for (Consulta consulta : consultas) {
            totalConsultas++;

            String especie = consulta.getPet().getEspecie();

            if (especie.equalsIgnoreCase("Cachorro")) {
                totalCachorros++;
            } else if (especie.equalsIgnoreCase("Gato")) {
                totalGatos++;
            }

            somaIdades += consulta.getPet().getIdade();
        }

        double idadeMedia = totalConsultas > 0 ? (double) somaIdades / totalConsultas : 0.0;

        return new ResumoConsultasDTO(
            totalConsultas,
            totalCachorros,
            totalGatos,
            idadeMedia
        );
    }
}
