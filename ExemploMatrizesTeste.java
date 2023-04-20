package matriz;

public class ExemploMatrizesTeste {
	
	public static void main(String[] args) {
		
	
	
	ExemplosMatrizes em = new ExemplosMatrizes();
	int[] v = em.tamanhoMatriz();
	int[][] m = em.criarMatriz(v);
	em.imprimirMatriz(m);
	
	
	}
	
}
