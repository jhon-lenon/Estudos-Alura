package Praticando_Eranca;

public class PraticandoEranca {
	public static void main(String[] args) {
		
		Professor professor = new Professor("Douglas", "222.222.222-22", 3000);
		professor.imprime();
		System.out.println();
		
		Aluno aluno = new Aluno("Denis", "333.333.333-33", 11111);
		aluno.imprime();
		System.out.println();
		
		Pessoa pessoa = new Pessoa("Érica", "444.444.444-44");
		pessoa.imprime();
		
	}

}
