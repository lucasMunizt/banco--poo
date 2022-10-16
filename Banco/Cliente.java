public class Cliente{
    private String nome;
    private int idade;
    private String cpf;

    Cliente(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf= cpf;
    }

    String getnome() {
        return nome;
    }
    
    String getcpf() {
        return cpf;
    }
    
    int getiade() {
        return idade;
    }
   
    void listar(){
        System.out.println("Cliente: " + nome + " idade: " + idade + " Cpf: " + cpf);
    }

}
