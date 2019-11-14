
package Code;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Professor extends Pessoa {
    
    private String codigoProfessor;
    private String disciplina;
    private String disciplina1;
    private String disciplina2;
    private String disciplina3;        
    private String numeroAluno;
    private String falta;
    private String falta1;
    private String falta2;
    private String falta3;

    
    public String getCodigoProfessor() {
        return codigoProfessor;
    }

    public void setCodigoProfessor(String codigoProfessor) {
        this.codigoProfessor = codigoProfessor;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getFalta() {
        return falta;
    }

    public void setFalta(String falta) {
        this.falta = falta;
    }

    public String getNumeroAluno() {
        return numeroAluno;
    }

    public void setNumeroAluno(String numeroAluno) {
        this.numeroAluno = numeroAluno;
    }

    public String getDisciplina1() {
        return disciplina1;
    }

    public void setDisciplina1(String disciplina1) {
        this.disciplina1 = disciplina1;
    }

    public String getDisciplina2() {
        return disciplina2;
    }

    public void setDisciplina2(String disciplina2) {
        this.disciplina2 = disciplina2;
    }

    public String getDisciplina3() {
        return disciplina3;
    }

    public void setDisciplina3(String disciplina3) {
        this.disciplina3 = disciplina3;
    }

    public String getFalta1() {
        return falta1;
    }

    public void setFalta1(String falta1) {
        this.falta1 = falta1;
    }

    public String getFalta2() {
        return falta2;
    }

    public void setFalta2(String falta2) {
        this.falta2 = falta2;
    }

    public String getFalta3() {
        return falta3;
    }

    public void setFalta3(String falta3) {
        this.falta3 = falta3;
    }
    
    
    
     public String CadastrarProfessor(){
        try {
            try (FileWriter fw = new FileWriter("Professores_Cadastrados.txt", true); PrintWriter pw = new PrintWriter(fw)) {
                
                pw.println("Codigo Professor: "+ this.codigoProfessor+ "  Nome: "+ this.getNome() );
                pw.println();
                pw.println("Disciplina: "+ this.disciplina+"    Ano Curso:  "+ this.getAnoCurso()+"    Sexo: " + this.getSexo()  );
                pw.println();
                pw.println("Data Nascimento: "+ this.getDataNascimento()+ "    Cpf : "+ this.getCpf()+ "    Rg : "+ this.getRg() );
                pw.println();
                pw.println("Endereco: " + this.getEndereco());    
                pw.println();
                pw.println("Telefone: "+ this.getTelefone()+"E_mail: "+ this.getEmail());
               
                pw.println();
                pw.flush();
            }
            
            
            System.out.println(this.getNome());
           

        } catch (IOException ex) {
            Logger.getLogger(Professor.class.getName()).log(Level.SEVERE, null, ex);
        }
    return "Professor cadastrado com sucesso";
   
}
     
   public String NotasAluno(){
        try {
            try (FileWriter fw = new FileWriter("Notas_Alunos.txt", true); PrintWriter pw = new PrintWriter(fw)) {
                
                pw.println("Numero do Aluno: "+ this.numeroAluno + " Nome: "+ this.getNome() +" Ano Curso"+ this.getAnoCurso());
                pw.println(" Disciplina:  "+   this.disciplina  +" 1 Bim: "+ this.getNota()  +" Falta 1 Bim: "+this.falta);
                pw.println(" Disciplina:  "+   this.disciplina1 +" 1 Bim: "+ this.getNota2() +" Falta 1 Bim: "+this.falta1);
                pw.println(" Disciplina:  "+   this.disciplina2 +" 1 Bim: "+ this.getNota3() +" Falta 1 Bim: "+this.falta2);
                pw.println(" Disciplina:  "+   this.disciplina3 +" 1 Bim: "+ this.getNota3() +" Falta 1 Bim: "+this.falta3);
                 
                pw.println();
                pw.flush();
            }
            
            
            System.out.println(this.getNome());
           

        } catch (IOException ex) {
            Logger.getLogger(Aluno.class.getName()).log(Level.SEVERE, null, ex);
        }
    return "Notas cadastrdas  com sucesso";
   
}  
     

    public void getnome(String text) {
        throw new UnsupportedOperationException("Not supported yet.");
        
    }

    
       
    
}
