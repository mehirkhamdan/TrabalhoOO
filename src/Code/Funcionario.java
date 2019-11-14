
package Code;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Funcionario extends Pessoa {
    
    private String codigoFuncionario;
    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
         
    public String getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(String codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }
    
  public String CadastrarFuncionario(){
        try {
            try (FileWriter fw = new FileWriter("Funcionario_Cadastrados.txt", true); PrintWriter pw = new PrintWriter(fw)) {
                
                pw.println("Nome: "+ this.getNome()+"     Codigo Funcionario: "+ this.codigoFuncionario );
                pw.println();
                pw.println("Cargo: "+ this.cargo + "      Sexo: " + this.getSexo() );
                pw.println();
                pw.println("Data Nascimento: "+ this.getDataNascimento()+"    Cpf : "+ this.getCpf()+"    Rg : "+ this.getRg() );
                pw.println();
                pw.println("Endereco: " + this.getEndereco());
                pw.println();
                pw.println("Telefone: "+ this.getTelefone()+ "E_mail: "+ this.getEmail() );
                          
                
                pw.println();
                pw.flush();
            }
            
            
            System.out.println(this.getNome());
           

        } catch (IOException ex) {
            Logger.getLogger(Funcionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    return "Funcionario cadastrado com sucesso";
   
}

    public void getnome(String text) {
        throw new UnsupportedOperationException("Not supported yet.");
        
    }      
    
}
