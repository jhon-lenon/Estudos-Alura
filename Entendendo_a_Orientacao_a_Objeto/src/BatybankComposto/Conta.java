package BatybankComposto;

public class Conta {
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor){
		if (this.saldo>= valor) {
			this.saldo -= valor;
			return true;
		} else {
			System.out.println("Não tem saudo suficiente!");
			return false;
		}
		
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			System.out.println("Transferencia com sucesso!");
			return true;
		} else {
			System.out.println("Faltou dinheiro!");
			return false;	
		}
		
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}
			

