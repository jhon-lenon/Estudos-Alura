package BatybankComposto;

public class TestaBanco {
	public static void main(String[] args) {
		
		Cliente jhon = new Cliente();
		jhon.nome = "Jhon Lenon";
		jhon.cpf = "222.222.222-22";
		jhon.profissao = "programador";
		
		Conta contaDoJhon = new Conta();
		contaDoJhon.deposita(100);
		contaDoJhon.titular = jhon;
		System.out.println(contaDoJhon.titular.nome);
		System.out.println(contaDoJhon.titular);
		System.out.println(jhon);
	}

}
