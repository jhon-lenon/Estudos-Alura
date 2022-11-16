package Praticando_Eranca;

public class Aluno extends Pessoa{
	
	private int ra;
	
	public Aluno (String nome, String cpf, int ra) {
		super(nome, cpf);
		this.ra = ra;
	}
	
	public void imprime() {
		super.imprime();
		System.out.println("RA: " + ra);
	}

}
