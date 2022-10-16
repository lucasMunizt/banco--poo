public class Contapoupanca extends Conta {
  static final private double juros = 0.137;  

 Contapoupanca(double saldo, int numero, int agencia, Cliente cliente){
    super(saldo, numero, agencia, cliente);
}

 void mostrar(){
   System.out.println("conta Corrente: " + " saldo: " + saldo + " numero: " + numero + " agencia: " + agencia);
 }
    boolean sacar2(double valor){
        saldo-=valor;
        System.out.println("seu novo saldo e : " + saldo);
        return true;
    }

    boolean depositar2(double valor){ // colocar valor
        saldo+=valor;
        System.out.println("seu deposito e : " + saldo);
        return true;
    }

  boolean reder(){
        saldo = saldo * juros;
        System.out.printf("seu redimento e : %.2f",saldo);
        return true;
    }


}