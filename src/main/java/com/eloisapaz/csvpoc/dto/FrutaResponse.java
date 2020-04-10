package com.eloisapaz.csvpoc.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class FrutaResponse {

    private String nome;

    private int quantidade;

    private String calorias;

    private String carboidratos;

    private String proteinas;

    private String gordurasTotais;

    private String gordurasSaturadas;

    private String fibraAlimentar;

    private String sodio;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getCalorias() {
        return calorias;
    }

    public void setCalorias(String calorias) {
        this.calorias = calorias;
    }

    public String getCarboidratos() {
        return carboidratos;
    }

    public void setCarboidratos(String carboidratos) {
        this.carboidratos = carboidratos;
    }

    public String getProteinas() {
        return proteinas;
    }

    public void setProteinas(String proteinas) {
        this.proteinas = proteinas;
    }

    public String getGordurasTotais() {
        return gordurasTotais;
    }

    public void setGordurasTotais(String gordurasTotais) {
        this.gordurasTotais = gordurasTotais;
    }

    public String getGordurasSaturadas() {
        return gordurasSaturadas;
    }

    public void setGordurasSaturadas(String gordurasSaturadas) {
        this.gordurasSaturadas = gordurasSaturadas;
    }

    public String getFibraAlimentar() {
        return fibraAlimentar;
    }

    public void setFibraAlimentar(String fibraAlimentar) {
        this.fibraAlimentar = fibraAlimentar;
    }

    public String getSodio() {
        return sodio;
    }

    public void setSodio(String sodio) {
        this.sodio = sodio;
    }
}
