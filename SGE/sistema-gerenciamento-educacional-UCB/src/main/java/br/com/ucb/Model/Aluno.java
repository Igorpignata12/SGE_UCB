package br.com.ucb.Model;

// Gustavo

public class Aluno {
    private Integer id;
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String anoEscolar;
    private String email;

    public Aluno(Integer id, String nome, String cpf, String dataNascimento, String anoEscolar, String email) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.anoEscolar = anoEscolar;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getAnoEscolar() {
        return anoEscolar;
    }

    public void setAnoEscolar(String anoEscolar) {
        this.anoEscolar = anoEscolar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    void listar(){
        System.out.println("\nID: " + this.id);
        System.out.println("\nNome: " + this.nome);
        System.out.println("\nCPF: " + this.cpf);
        System.out.println("\nData de Nascimento: " + this.dataNascimento);
        System.out.println("\nAno Escolar: " + this.anoEscolar);
        System.out.println("\nE-mail: " + this.email);
    }
}
