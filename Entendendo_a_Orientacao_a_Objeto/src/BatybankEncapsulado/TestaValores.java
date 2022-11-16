package BatybankEncapsulado;

public class TestaValores {
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 24226);		
		System.out.println("Agência: " + conta.getAgencia());
		System.out.println("Nência: "+ conta.getNumero());
		System.out.println();
		
		Conta conta2 = new Conta(1337, 24286);
		System.out.println("Agência: " + conta2.getAgencia());
		System.out.println("Nência: "+ conta2.getNumero());
		System.out.println();

		
		Conta conta3 = new Conta(1337, 24526);
		System.out.println("Agência: " + conta3.getAgencia());
		System.out.println("Nência: "+ conta3.getNumero());
		
		System.out.println();
		
		System.out.println("O total de contas é: " + Conta.getTotal());
	}

}
