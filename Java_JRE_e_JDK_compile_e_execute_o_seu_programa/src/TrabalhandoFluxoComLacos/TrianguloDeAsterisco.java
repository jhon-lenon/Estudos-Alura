package TrabalhandoFluxoComLacos;

public class TrianguloDeAsterisco {
	
	public static void main(String[] args) {
		
		for (int coluna = 0; coluna <= 10; coluna++) {
			for (int linha = 0; linha <= coluna; linha++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
