 class Contacorrente extends Conta { // extends : herança pra herda atributos e metodos de outra classe.
   private double limite;
   private  boolean especial;
   private double montateDevedor = 0;
    
    Contacorrente(double saldo, int numero, int agencia, Cliente cliente) {
        super(saldo, numero, agencia, cliente);
    }
       
    boolean sacar1(double valorASacar){
            if( valorASacar <= saldo){   
                saldo -=valorASacar;
                System.out.println("seu novo saldo e: "+ saldo);
                return true;
            }else{
                if(especial){ // não está funcionando 
                    if(valorASacar > limite ){
                      //double val;
                        saldo = ( montateDevedor + saldo + valorASacar) * (-1); 
                       System.out.println("seu novo saldo e:sda" + saldo);
                       return true;
                    }else{
                        return false;
                    }
                }
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
