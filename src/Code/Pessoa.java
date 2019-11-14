
package Code;


public abstract class Pessoa {
    
    private String nome;
    private String email;
    private String endereco;
    private String telefone;
    private String cpf;
    private String rg;
    private String responsavel;
    private String cpfResponsavel;
    private String sexo;
    private String dataNascimento;
    private String anoCurso;
    private String nota;
    private String nota1;
    private String nota2;
    private String nota3;

    public Pessoa() {
    }

    public Pessoa(String nome, String email, String endereco, String telefone, String cpf, String rg, String sexo, String anoCurso, String nota) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
        this.anoCurso = anoCurso;
        this.nota = nota;
    }

    public Pessoa(String nome, String email, String endereco, String telefone, String cpf, String rg, String responsavel, String cpfResponsavel, String sexo, String dataNascimento, String anoCurso) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.rg = rg;
        this.responsavel = responsavel;
        this.cpfResponsavel = cpfResponsavel;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.anoCurso = anoCurso;
    }       
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getCpfResponsavel() {
        return cpfResponsavel;
    }

    public void setCpfResponsavel(String cpfResponsavel) {
        this.cpfResponsavel = cpfResponsavel;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getAnoCurso() {
        return anoCurso;
    }

    public void setAnoCurso(String anoCurso) {
        this.anoCurso = anoCurso;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getNota1() {
        return nota1;
    }

    public void setNota1(String nota1) {
        this.nota1 = nota1;
    }

    public String getNota2() {
        return nota2;
    }

    public void setNota2(String nota2) {
        this.nota2 = nota2;
    }

    public String getNota3() {
        return nota3;
    }

    public void setNota3(String nota3) {
        this.nota3 = nota3;
    }
    
    
}
