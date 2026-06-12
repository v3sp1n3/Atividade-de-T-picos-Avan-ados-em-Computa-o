package com.exemplo.demo.controller;

import com.exemplo.demo.dto.ResumoConsultasDTO;
import com.exemplo.demo.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {

    @Autowired
    private ConsultaService consultaService;

    @GetMapping("/resumo")
    public ResponseEntity<ResumoConsultasDTO> resumo() {
        return ResponseEntity.ok(consultaService.gerarResumo());
    }
}
