package TrabalhandoFluxoComLacos;

public class Calculadora {
	
	public static void main(String[] args) {
		for (int coluna = 0; coluna <= 10; coluna++) {
			System.out.println("Tabuada de " + coluna);
			
			for (int linha = 0; linha <= 10; linha++) {
				System.out.println(coluna + " X " + linha + " = " + (coluna*linha));
			}
			System.out.println("");
		}
	}

}
