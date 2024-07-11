import Conta.conta;

public abstract class Conta implements iConta {
	
	
	public class conta {

		public Object getNome() {
			// TODO Auto-generated method stub
			return null;
		}

	}


	private static  final int Agencia_Padrao = 1;
	private static int SEQUENCIAL = 1;
	

	
	protected int agencia;
	
	protected int numero;
	
	protected  double saldo;
	
	private conta cliente;
	
	
	public Conta( ) {
		this.agencia = Conta.Agencia_Padrao
		this.numero = SEQUENCIAL ++;
		this.cliente = cliente; 
	} 
	
	
	public void sacar( double valor) {
		saldo -= valor;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void  transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
		
	} 
	
	 protected void InformacoesComuns() {
		 
		    System.out.println(String.format("Titular %d", this.cliente.getNome());
			System.out.println(String.format("Agencia %d, this.agencia");
			System.out.println(String.format("Numero %d, this.numero");
			System.out.println(String.format("Saldo %.2f, this.saldo");
		}


	@Override
	public String toString() {
		return "Conta [agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + "]";
	}
	
	
	

}
