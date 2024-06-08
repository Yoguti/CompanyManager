package empresa_model;

import java.io.Serializable;

public class Empresa implements Serializable {
    private Endereco endereco;
    private AreaDeAtividade areaDeAtividade;
    private String nome;
    private CNPJ cnpj;
    private Setor diretoria;

    public Empresa(String nome, String cnpj, AreaDeAtividade areaDeAtividade) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio ou nulo");
        }
        this.nome = nome;
        this.cnpj = new CNPJ(cnpj);
        this.areaDeAtividade = areaDeAtividade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public AreaDeAtividade getAreaDeAtividade() {
        return areaDeAtividade;
    }

    public void setAreaDeAtividade(AreaDeAtividade areaDeAtividade) {
        this.areaDeAtividade = areaDeAtividade;
    }

    public CNPJ getCnpj() {
        return cnpj;
    }

    public void setCnpj(CNPJ cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void addSetor(String descricao) {
        if (this.diretoria == null) {
            this.diretoria = new Setor("Diretoria");
        }
        this.diretoria.getSubsetor().add(new Setor(descricao));
    }

    public void removeSetor(Setor setor) {
        if (this.diretoria != null) {
            this.diretoria.getSubsetor().remove(setor);
        }
    }
    
       public Setor getSetor() {
        return diretoria;
    }

    public void setSetor(Setor diretoria) {
        this.diretoria = diretoria;
    }
}
