/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa_model;

/**
 *
 * @author klaus
 */
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmpresaSerialization {

    public void serializeEmpresaToFile(Empresa empresa, String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            
            writer.write("Nome da Empresa: " + empresa.getNome() + "\n");
            writer.write("CNPJ: " + empresa.getCnpj() + "\n");
            writer.write("Área de Atividade: " + empresa.getAreaDeAtividade() + "\n");

            writer.write("Estado: " + empresa.getEndereco().getEstado() + "\n");
            writer.write("Cidade: " + empresa.getEndereco().getCidade() + "\n");
            writer.write("Endereço: " + empresa.getEndereco().getEnderecoRua() + "\n");
            writer.write("CEP: " + empresa.getEndereco().getCEP() + "\n");

        
            writer.write("Setores:\n");
            writeSetores(writer, empresa.getSetor(), 0);

        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
    
    private void writeSetores(FileWriter writer, Setor setor, int indentationLevel) throws IOException {
        for (int i = 0; i < indentationLevel; i++) {
            writer.write("  "); 
        }
        writer.write("* " + setor.getDescricao() + "\n");
        for (Setor subsetor : setor.getSubsetor()) {
            writeSetores(writer, subsetor, indentationLevel + 1);
        }
    }

    public void serializeEmpresaObjectToFile(Empresa empresa, String filePath) { 
        try (FileOutputStream fileOut = new FileOutputStream(filePath);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(empresa);
            System.out.println("Os dados serializados foram salvos em " + filePath);
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}

