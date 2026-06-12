package com.exemplo.demo.dto;

public class ResumoConsultasDTO {

    private int totalConsultas;
    private int consultasCachorros;
    private int consultasGatos;
    private double idadeMediaPets;

    public ResumoConsultasDTO(int totalConsultas, int consultasCachorros,
                              int consultasGatos, double idadeMediaPets) {
        this.totalConsultas = totalConsultas;
        this.consultasCachorros = consultasCachorros;
        this.consultasGatos = consultasGatos;
        this.idadeMediaPets = idadeMediaPets;
    }

    public int getTotalConsultas() { return totalConsultas; }
    public int getConsultasCachorros() { return consultasCachorros; }
    public int getConsultasGatos() { return consultasGatos; }
    public double getIdadeMediaPets() { return idadeMediaPets; }
}
