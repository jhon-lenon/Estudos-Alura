package Batybank;

public class CriaConta {
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println("Primeira Conta Saldo: R$ " + primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println("Primeira Conta Saldo: R$ " + primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("Primeira Conta Saldo: R$ " + primeiraConta.saldo);
		System.out.println("Segunda Conta Saldo: R$ " + segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		segundaConta.agencia = 146;
		System.out.println("Agora a segunda conta está na agencia: " + segundaConta.agencia);
		
		if (primeiraConta == segundaConta) {
			System.out.println("Mesma conta!");
		} else {
			System.out.println("Contas diferentes!");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
	}
}
