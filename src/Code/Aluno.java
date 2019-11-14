
package Code;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Aluno extends Pessoa{
    
    private String codigoAluno;
    private String serie;
    private Boolean matriculado = Boolean.TRUE;

    
    
    
    

    public String getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(String codigoAluno) {
        this.codigoAluno = codigoAluno;
    }
    
     public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
   
    public Boolean getMatriculado() {
        return matriculado;
    }

    public void setMatriculado(Boolean matriculado) {
        this.matriculado = matriculado;
    }

    
   public String CadastrarAluno(){
       
            try {
		            
		            String content = ";";
                            
		            // Cria arquivo
		            File file = new File("Alunos_matriculados.txt");

		            // Se o arquivo nao existir, ele gera
		            if (!file.exists()) {
		                file.createNewFile();
		            }

		            
                            try (FileWriter fw = new FileWriter(file.getAbsoluteFile(),true); PrintWriter pw = new PrintWriter(fw)) {
		         
		            BufferedWriter bw = new BufferedWriter(fw);	            
                 
              
                
                pw.println("Codigo do Aluno: "+ this.codigoAluno +"  Nome: "+ this.getNome()+"   Ano Curso: "+ this.getAnoCurso()
                +"  Data Nascimento: "+ this.getDataNascimento()+"  Cpf Aluno: "+ this.getCpf()+"  Rg do Aluno: "+ this.getRg()+"  Sexo: " + this.getSexo()
                +"  Curso: "+ this.serie+ "  Endereco: " + this.getEndereco()+"  Responsavel: "+ this.getResponsavel()+"  Cpf Responsavel: " + this.getCpfResponsavel()
                +"  Telefone: "+ this.getTelefone()+ "  E_mail: "+ this.getEmail());
                pw.flush();
                bw.write(content);
                bw.newLine();
		bw.close();
            }
            
            
            System.out.println(this.getNome());
           

        } catch (IOException ex) {
            Logger.getLogger(Aluno.class.getName()).log(Level.SEVERE, null, ex);
        }
    return "Aluno Matriculado com sucesso";
   
}   

    public void getnome(String text) {
        throw new UnsupportedOperationException("Not supported yet.");
        
    }

} 
    

