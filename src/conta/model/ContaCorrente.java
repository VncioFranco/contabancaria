package conta.model;

// ContaCorrente herda de Conta
public class ContaCorrente extends Conta {
	
	private float limite;

	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo);
		
		this.limite = limite;
	}
	//metodos de acesso

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	//metodos especificos
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Limite de Crédito: " + this.limite);
	}
	@Override
	public boolean sacar(float valor) {
		if(this.getSaldo()+ this.getLimite() < valor) {
			return false;
		}
		this.setSaldo(this.getSaldo() - valor);
		return true;
	}

}
