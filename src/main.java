
public class main {

	public static void main(String[] args) {
		Cliente  fernanda new Cliente();
		fernanda.setNome("fernanda");
		
		
		Conta cc = new ContaConrrente(fernanda);
		cc.depositar(100);
		
		ContaPoupanca poupanca = new contaPoupanca(fernanda);
		cc.transferir(100, poupanca);
		
		
        cc.imprirExtrato();
        poupanca.imprimirExtrato();
		
		System.out.println();
		


	}

}
