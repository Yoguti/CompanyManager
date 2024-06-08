/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa_model;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class EmpresaDeserializer {
    
    public static Empresa deserializeEmpresa(File file) throws IOException, ClassNotFoundException {
        try (FileInputStream fileIn = new FileInputStream(file);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            
            Empresa empresa = (Empresa) in.readObject();
            
            // Ensure Endereco and CNPJ are valid
            if (empresa.getEndereco() == null || empresa.getCnpj() == null) {
                throw new IllegalArgumentException("Arquivo de empresa inválido: Endereço ou CNPJ ausente.");
            }
            
            return empresa;
        }
    }
}
