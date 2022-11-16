package Batybank_herdado_conta;

public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	/**---------------------CONSTRUTOR------------------------------*/
	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("O total de Conta é: " + total);		
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando uma conta " + this.agencia);
	}
	
	/**-----------------------DEPOSITA-------------------------------*/
	public abstract void deposita(double valor);
	
	/**-------------------------SACA---------------------------------*/
	public boolean saca(double valor){
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			System.out.println("Não tem saudo suficiente!");
			return false;
		}		
	}
	
	/**-----------------------TRANFERE-------------------------------*/
	public boolean transfere(double valor, Conta destino) {
		if (this.saca(valor)) {
			destino.deposita(valor);
			System.out.println("Transferencia com sucesso!");
			return true;
		} else {
			System.out.println("Faltou dinheiro!");
			return false;	
		}		
	}
	
	/**------------------------SALDO----------------------------------*/
	public double getSaldo() {
		return this.saldo;
	}
	
	/**-----------------------NUMERO----------------------------------*/
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Não podevalor menor ou igual a 0");
			return;
		}
		this.numero = numero;
	}
	
	/**----------------------AGENCIA-----------------------------------*/
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não pode valor meno ou igual a 0");
			return;
		}
		this.agencia = agencia;
	}
	
	/**----------------------TITULAR------------------------------------*/
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	/**------------------------TOTAL------------------------------------*/
	public static int getTotal() {
		return Conta.total;
	}
	
}
			

