class Main{
public static void main(String[] args) {
    Cliente cliente = new Cliente("lucas", 21, "823648240");
    Conta santander = new Conta(1200.99, 0123, 67453720, cliente);
    Contacorrente santander1 = new Contacorrente(300, 20, 8345683,cliente);
    Contapoupanca brasil = new Contapoupanca(200, 60, 8732640, cliente);
   santander.exibir();
   santander.sacar(1000);
   santander.depositar(20);
   System.out.println("\n Conta corrente");
   santander1.mostrar();
   santander1.sacar1(1200);
   santander1.depositar1(20);
  
   System.out.println("\n Conta Poupança ");
   brasil.mostrar();
   brasil.sacar2(120);
   brasil.depositar2(20);
   brasil.reder();
}

}