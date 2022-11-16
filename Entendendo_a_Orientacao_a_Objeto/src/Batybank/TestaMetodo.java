package Batybank;

public class TestaMetodo {
	public static void main(String[] args) {
		
		Conta contaDoJhon = new Conta();
		contaDoJhon.saldo = 100;
		contaDoJhon.deposita(50);
		System.out.println(contaDoJhon.saldo);
		
		boolean conseguiuRetirar = contaDoJhon.saca(20);
		System.out.println(contaDoJhon.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		contaDaMarcela.transfere(300, contaDoJhon);
		System.out.println(contaDoJhon.saldo);
		System.out.println(contaDaMarcela.saldo);
		
		contaDoJhon.titular = "Jhon Lenon";
		System.out.println(contaDoJhon.titular);
		
	}
}
