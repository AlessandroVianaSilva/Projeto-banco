import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
  private String nome;
  private String CPF;
  private List<Endereco> enderecos = new ArrayList<>();
  private LocalDate dataNascimento;

  public Cliente(String nome, String CPF, Endereco endereco, LocalDate dataNascimento) {
    this.nome = nome;
    this.CPF = CPF;
    this.enderecos.add(endereco);
    this.dataNascimento = dataNascimento;
  }
  @Override
  public boolean equals(Object obj) {
    return this.CPF.equals(((Cliente) obj).CPF);
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getCPF() {
    return CPF;
  }
  public List<Endereco> getEnderecos() {
    return enderecos;
  }
  public void addEndereco(Endereco endereco) {
    this.enderecos.add(endereco);
  }
  public void removeEndereco(Endereco endereco) {
    this.enderecos.remove(endereco);
  }
  public LocalDate getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(LocalDate dataNascimento) {
    this.dataNascimento = dataNascimento;
  }
}