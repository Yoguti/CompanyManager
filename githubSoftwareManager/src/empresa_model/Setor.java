/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa_model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author cancian
 */
public class Setor implements Serializable{
        
	/**
	 * @return the subsetor
	 */
         public Setor(String descricao){
         this.descricao = descricao;
         }
         
        
    public void addSubsetor(Setor subsetor) {
        this.subsetor.add(subsetor);
    }

    public void removeSubsetor(Setor subsetor) {
        this.subsetor.remove(subsetor);
    } 
    
	public ArrayList<Setor> getSubsetor() {
		return subsetor;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the responsaveis
	 */
	public ArrayList<Funcionario> getResponsaveis() {
		return responsaveis;
	}
	private final ArrayList<Setor> subsetor = new ArrayList<>();
	private String descricao;
	private final ArrayList<Funcionario> responsaveis = new ArrayList<>();
}
