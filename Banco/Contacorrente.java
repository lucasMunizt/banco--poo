 class Contacorrente extends Conta { 
   private double limite;
    double montateDevedor = 0;
    
    Contacorrente(double saldo, int numero, int agencia, Cliente cliente) {
        super(saldo, numero, agencia, cliente);
    }
       
    boolean sacar1(double valorASacar){
            if if(valorASacar >= limite) {   
                    montanteDevedor += (saldo * (-1));
                    saldo -=valorASacar;
                System.out.println("seu novo saldo e: "+ saldo);
                return true;
            }else{
                 System.out.println("Não e possivel sacar!");
                    } 
            return false;
        }
            
        void depositar1(double ValorADepositar){
                saldo +=ValorADepositar;
                System.out.println("seu novo saldo e: " + saldo);
            }

       void mostrar(){
            System.out.println("conta Corrente: " + " saldo: " + saldo + " numero: " + numero + " agencia: " + agencia);
        }
   
}
