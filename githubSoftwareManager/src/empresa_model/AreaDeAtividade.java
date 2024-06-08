/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa_model;

import java.io.Serializable;

/**
 *
 * @author cancian
 */
public enum AreaDeAtividade implements Serializable {
    FINANCEIRA("Financeira"),
    SERVICOS("Serviços"),
    INDUSTRIA("Indústria"),
    COMERCIO("Comércio"),
    SAUDE("Saúde"),
    VAREJO("Varejo");
    AreaDeAtividade(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return nome;
    }
    private final String nome;
}
