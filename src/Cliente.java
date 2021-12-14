import java.util.Date;

public class Cliente {
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private Endereco endereco;
    private String email;

    public Cliente(String nome, String cpf, Date dataNascimento, String email, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.email = email;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public Date getDataNascimento() {
        return this.dataNascimento;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }
}