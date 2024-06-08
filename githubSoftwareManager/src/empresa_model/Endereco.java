/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa_model;

/**
 *
 * @author cancian
 */

import java.io.Serializable;

public class Endereco implements Serializable{
   
    private String enderecoRua;
    private String cidade;
    private String estado;
    private String cep;

    public Endereco(String streetAddress, String cidade, String state, String cep) {
      
        this.enderecoRua = streetAddress;
        this.cidade = cidade;
        this.estado = state;
        this.cep = cep;
    }
        @Override
    public String toString() {
        return "Rua: " + enderecoRua + ", Cidade: " + cidade + ", Estado: " + estado + ", CEP: " + cep;
    }

    public String getEnderecoRua() { return enderecoRua; }
    public void setEnderecoRua(String enderecoRua) { this.enderecoRua = enderecoRua; }

    public String getCidade() { return cidade; }
    public void setCidade(String cidade) { this.cidade = cidade; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getCEP() { return cep; }
    public void setCEP(String cep) { this.cep = cep; }
}
