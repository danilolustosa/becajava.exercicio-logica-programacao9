
public class Main {

	public static void main(String[] args) {

		
		int totalEleitores = 200;
		int validos = 10;
		int brancos = 40;
		int nulos = 100;
		
		
		Eleicao eleicao = new Eleicao();
		eleicao.TotalEleitores = 200;
		eleicao.Validos = 10;
		eleicao.Brancos = 40;
		eleicao.Nulos = 150;
		
		
		double percentValidos = eleicao.PercentValidos();
		System.out.println("Percentual de votos válidos: " + percentValidos);
		
		double percentBrancos = eleicao.PercentBrancos();
		System.out.println("Percentual de votos brancos: " + percentBrancos);
		
		double percentNulos = eleicao.PercentNulos();
		System.out.println("Percentual de votos nulos: " + percentNulos);
		

	}

}
