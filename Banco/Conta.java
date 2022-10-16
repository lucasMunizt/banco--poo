public class Conta {
    protected double saldo;
    protected final int numero; // qunado usa o final ela não pode ser herdada por outra classe 
    protected final int agencia;
    protected final Cliente cliente;

    Conta(double saldo,int numero,int agencia,Cliente cliente){
        this.saldo = saldo;
        this.numero = numero;
        this.agencia = agencia;
        this.cliente = cliente;
    }

     double getsaldo() {
        return saldo;
    }

     int getnumero() {
        return numero;
    }

     int getagencia() {
        return agencia;
    }

    boolean sacar(double valor){
        saldo-=valor;
        System.out.println("seu novo saldo e : " + saldo);
        return true;
    }
    
    boolean depositar(double valor){
        saldo+=valor;
        System.out.println("seu deposito e : " + saldo);
        return true;
    }
    
    void exibir(){
        cliente.listar();
        System.out.println("Saldo: " + saldo + " Numero: " + numero + " Agencia: " + agencia);
    }
}
