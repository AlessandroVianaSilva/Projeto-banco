import java.time.LocalDate;

public class Cliente {
  String nome;
  String CPF;
  String endereco;
  LocalDate dataNascimento;

  public Cliente(String n,String e,String cpf){
    this.nome=n;
    this.endereco=e;
    this.CPF=cpf;
  }

 public String getnome(){
   return this.nome;
 }
public void setnome(String nome){
  this.nome=nome;
   System.out.println("Troca concluída! O novo nome do cliente é: "+ this.nome);
  }
     
  
public String getendereco(){
  return this.endereco;
}
public void setendereco(String endereco){
  this.endereco=endereco;
   System.out.println("Troca concluída! O novo endereço do cliente é: "+ this.endereco);
  }
  
  
  public String getcpf(){
   return this.CPF;
}

}