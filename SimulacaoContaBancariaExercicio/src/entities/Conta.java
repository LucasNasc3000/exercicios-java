package entities;

public class Conta {

    public String nomeTitular;
    private int numeroConta;
	private double valorConta;
	
	public Conta(String nomeTitular, int numeroConta) {
		super();
		this.nomeTitular = nomeTitular;
		this.numeroConta = numeroConta;
	}
	

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getValorConta() {
		return valorConta;
	}
	
	public double Deposito(double valorConta) {
		return this.valorConta += valorConta;
	}
	
	public double Saque(double valorConta) {
		return this.valorConta -= valorConta + 5;
	}
}
