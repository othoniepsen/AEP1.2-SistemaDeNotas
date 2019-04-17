package academico;

public class App {
	
	public static void main(String[] args) {
		
		Aluno ferdisvaldo = new Aluno(1110, "Ferdisvaldo");
		Aluno pedro = new Aluno(1111, "Pedro");
		Aluno joaquim = new Aluno(1112, "Joaquim");
		Aluno sandra = new Aluno(1113, "Sandra");
		Aluno pietra = new Aluno(1114, "Pietra");
		Aluno teobaldo = new Aluno(1115, "Teobaldo");
		Aluno jose = new Aluno(1116, "José");
		Aluno marciana = new Aluno(1117, "Marciana");
		Aluno joana = new Aluno(1118, "Joana");
		Aluno joannete = new Aluno(1119, "Joannete");
		
		Disciplina matematica = new Disciplina("Matemática");
		Disciplina fisica = new Disciplina("Física");
		Disciplina geografia = new Disciplina("Geografia");
		Disciplina historia = new Disciplina("História");
		
		RepositorioDeAvaliacoes repositorio = new RepositorioDeAvaliacoes();
		
		// NOTAS DE MATEMÁTICA
		repositorio.adicionarAvaliacao(new Avaliacao(ferdisvaldo, matematica, 70));
		repositorio.adicionarAvaliacao(new Avaliacao(ferdisvaldo, matematica, 60));
		repositorio.adicionarAvaliacao(new Avaliacao(ferdisvaldo, matematica, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(ferdisvaldo, matematica, 60));
		
		repositorio.adicionarAvaliacao(new Avaliacao(pedro, matematica, 70));
		repositorio.adicionarAvaliacao(new Avaliacao(pedro, matematica, 40));
		repositorio.adicionarAvaliacao(new Avaliacao(pedro, matematica, 70));
		repositorio.adicionarAvaliacao(new Avaliacao(pedro, matematica, 80));
		
		repositorio.adicionarAvaliacao(new Avaliacao(joaquim, matematica, 70));
		repositorio.adicionarAvaliacao(new Avaliacao(joaquim, matematica, 70));
		repositorio.adicionarAvaliacao(new Avaliacao(joaquim, matematica, 70));
		repositorio.adicionarAvaliacao(new Avaliacao(joaquim, matematica, 50));
		
		repositorio.adicionarAvaliacao(new Avaliacao(sandra, matematica, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(sandra, matematica, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(sandra, matematica, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(sandra, matematica, 80));
		
		repositorio.adicionarAvaliacao(new Avaliacao(pietra, matematica, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(pietra, matematica, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(pietra, matematica, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(pietra, matematica, 80));
		
		repositorio.adicionarAvaliacao(new Avaliacao(teobaldo, matematica, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(teobaldo, matematica, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(teobaldo, matematica, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(teobaldo, matematica, 80));
		
		repositorio.adicionarAvaliacao(new Avaliacao(jose, matematica, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(jose, matematica, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(jose, matematica, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(jose, matematica, 80));
		
		repositorio.adicionarAvaliacao(new Avaliacao(marciana, matematica, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(marciana, matematica, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(marciana, matematica, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(marciana, matematica, 80));
		
		repositorio.adicionarAvaliacao(new Avaliacao(joana, matematica, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(joana, matematica, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(joana, matematica, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(joana, matematica, 80));
		
		repositorio.adicionarAvaliacao(new Avaliacao(joannete, matematica, 20));
		repositorio.adicionarAvaliacao(new Avaliacao(joannete, matematica, 50));
		repositorio.adicionarAvaliacao(new Avaliacao(joannete, matematica, 40));
		repositorio.adicionarAvaliacao(new Avaliacao(joannete, matematica, 30));
		
		
		// NOTAS DE FÍSICA
		repositorio.adicionarAvaliacao(new Avaliacao(ferdisvaldo, fisica, 70));
		repositorio.adicionarAvaliacao(new Avaliacao(ferdisvaldo, fisica, 60));
		repositorio.adicionarAvaliacao(new Avaliacao(ferdisvaldo, fisica, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(ferdisvaldo, fisica, 60));
		
		repositorio.adicionarAvaliacao(new Avaliacao(pedro, fisica, 70));
		repositorio.adicionarAvaliacao(new Avaliacao(pedro, fisica, 40));
		repositorio.adicionarAvaliacao(new Avaliacao(pedro, fisica, 70));
		repositorio.adicionarAvaliacao(new Avaliacao(pedro, fisica, 80));
		
		repositorio.adicionarAvaliacao(new Avaliacao(joaquim, fisica, 70));
		repositorio.adicionarAvaliacao(new Avaliacao(joaquim, fisica, 70));
		repositorio.adicionarAvaliacao(new Avaliacao(joaquim, fisica, 70));
		repositorio.adicionarAvaliacao(new Avaliacao(joaquim, fisica, 50));
		
		repositorio.adicionarAvaliacao(new Avaliacao(sandra, fisica, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(sandra, fisica, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(sandra, fisica, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(sandra, fisica, 80));
		
		repositorio.adicionarAvaliacao(new Avaliacao(pietra, fisica, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(pietra, fisica, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(pietra, fisica, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(pietra, fisica, 80));
		
		repositorio.adicionarAvaliacao(new Avaliacao(teobaldo, fisica, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(teobaldo, fisica, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(teobaldo, fisica, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(teobaldo, fisica, 80));
		
		repositorio.adicionarAvaliacao(new Avaliacao(jose, fisica, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(jose, fisica, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(jose, fisica, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(jose, fisica, 80));
		
		repositorio.adicionarAvaliacao(new Avaliacao(marciana, fisica, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(marciana, fisica, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(marciana, fisica, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(marciana, fisica, 80));
		
		repositorio.adicionarAvaliacao(new Avaliacao(joana, fisica, 20));
		repositorio.adicionarAvaliacao(new Avaliacao(joana, fisica, 20));
		repositorio.adicionarAvaliacao(new Avaliacao(joana, fisica, 20));
		repositorio.adicionarAvaliacao(new Avaliacao(joana, fisica, 20));
		
		repositorio.adicionarAvaliacao(new Avaliacao(joannete, fisica, 20));
		repositorio.adicionarAvaliacao(new Avaliacao(joannete, fisica, 50));
		repositorio.adicionarAvaliacao(new Avaliacao(joannete, fisica, 40));
		repositorio.adicionarAvaliacao(new Avaliacao(joannete, fisica, 30));
		
		
		//NOTAS DE GEOGRAFIA
		repositorio.adicionarAvaliacao(new Avaliacao(ferdisvaldo, geografia, 70));
		repositorio.adicionarAvaliacao(new Avaliacao(ferdisvaldo, geografia, 60));
		repositorio.adicionarAvaliacao(new Avaliacao(ferdisvaldo, geografia, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(ferdisvaldo, geografia, 60));
		
		repositorio.adicionarAvaliacao(new Avaliacao(pedro, geografia, 70));
		repositorio.adicionarAvaliacao(new Avaliacao(pedro, geografia, 40));
		repositorio.adicionarAvaliacao(new Avaliacao(pedro, geografia, 70));
		repositorio.adicionarAvaliacao(new Avaliacao(pedro, geografia, 80));
		
		repositorio.adicionarAvaliacao(new Avaliacao(joaquim, geografia, 10));
		repositorio.adicionarAvaliacao(new Avaliacao(joaquim, geografia, 10));
		repositorio.adicionarAvaliacao(new Avaliacao(joaquim, geografia, 10));
		repositorio.adicionarAvaliacao(new Avaliacao(joaquim, geografia, 10));
		
		repositorio.adicionarAvaliacao(new Avaliacao(sandra, geografia, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(sandra, geografia, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(sandra, geografia, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(sandra, geografia, 80));
		
		repositorio.adicionarAvaliacao(new Avaliacao(pietra, geografia, 20));
		repositorio.adicionarAvaliacao(new Avaliacao(pietra, geografia, 0));
		repositorio.adicionarAvaliacao(new Avaliacao(pietra, geografia, 0));
		repositorio.adicionarAvaliacao(new Avaliacao(pietra, geografia, 10));
		
		repositorio.adicionarAvaliacao(new Avaliacao(teobaldo, geografia, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(teobaldo, geografia, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(teobaldo, geografia, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(teobaldo, geografia, 80));
		
		repositorio.adicionarAvaliacao(new Avaliacao(jose, geografia, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(jose, geografia, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(jose, geografia, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(jose, geografia, 80));
		
		repositorio.adicionarAvaliacao(new Avaliacao(marciana, geografia, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(marciana, geografia, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(marciana, geografia, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(marciana, geografia, 80));
		
		repositorio.adicionarAvaliacao(new Avaliacao(joana, geografia, 20));
		repositorio.adicionarAvaliacao(new Avaliacao(joana, geografia, 20));
		repositorio.adicionarAvaliacao(new Avaliacao(joana, geografia, 20));
		repositorio.adicionarAvaliacao(new Avaliacao(joana, geografia, 20));
		
		repositorio.adicionarAvaliacao(new Avaliacao(joannete, geografia, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(joannete, geografia, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(joannete, geografia, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(joannete, geografia, 30));
		
		
		//NOTAS DE HISTÓRIA
		repositorio.adicionarAvaliacao(new Avaliacao(ferdisvaldo, historia, 30));
		repositorio.adicionarAvaliacao(new Avaliacao(ferdisvaldo, historia, 60));
		repositorio.adicionarAvaliacao(new Avaliacao(ferdisvaldo, historia, 20));
		repositorio.adicionarAvaliacao(new Avaliacao(ferdisvaldo, historia, 40));
		
		repositorio.adicionarAvaliacao(new Avaliacao(pedro, historia, 70));
		repositorio.adicionarAvaliacao(new Avaliacao(pedro, historia, 40));
		repositorio.adicionarAvaliacao(new Avaliacao(pedro, historia, 70));
		repositorio.adicionarAvaliacao(new Avaliacao(pedro, historia, 80));
		
		repositorio.adicionarAvaliacao(new Avaliacao(joaquim, historia, 10));
		repositorio.adicionarAvaliacao(new Avaliacao(joaquim, historia, 10));
		repositorio.adicionarAvaliacao(new Avaliacao(joaquim, historia, 10));
		repositorio.adicionarAvaliacao(new Avaliacao(joaquim, historia, 10));
		
		repositorio.adicionarAvaliacao(new Avaliacao(sandra, historia, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(sandra, historia, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(sandra, historia, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(sandra, historia, 80));
		
		repositorio.adicionarAvaliacao(new Avaliacao(pietra, historia, 20));
		repositorio.adicionarAvaliacao(new Avaliacao(pietra, historia, 0));
		repositorio.adicionarAvaliacao(new Avaliacao(pietra, historia, 0));
		repositorio.adicionarAvaliacao(new Avaliacao(pietra, historia, 10));
		
		repositorio.adicionarAvaliacao(new Avaliacao(teobaldo, historia, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(teobaldo, historia, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(teobaldo, historia, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(teobaldo, historia, 80));
		
		repositorio.adicionarAvaliacao(new Avaliacao(jose, historia, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(jose, historia, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(jose, historia, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(jose, historia, 80));
		
		repositorio.adicionarAvaliacao(new Avaliacao(marciana, historia, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(marciana, historia, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(marciana, historia, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(marciana, historia, 80));
		
		repositorio.adicionarAvaliacao(new Avaliacao(joana, historia, 20));
		repositorio.adicionarAvaliacao(new Avaliacao(joana, historia, 20));
		repositorio.adicionarAvaliacao(new Avaliacao(joana, historia, 20));
		repositorio.adicionarAvaliacao(new Avaliacao(joana, historia, 20));
		
		repositorio.adicionarAvaliacao(new Avaliacao(joannete, historia, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(joannete, historia, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(joannete, historia, 80));
		repositorio.adicionarAvaliacao(new Avaliacao(joannete, historia, 30));
		

		
		System.out.println("--------------------------------------");
		Aluno[] aprovadosMatematica = repositorio.obterAprovados(matematica);
		System.out.println("Aprovados em Matemática:\n");
		for (Aluno aluno : aprovadosMatematica) {
			if (aluno != null) {
				System.out.println(aluno.getNome());
			}
		}
		System.out.println("--------------------------------------");
		
		Aluno[] aprovadosFisica = repositorio.obterAprovados(fisica);
		System.out.println("Aprovados em Física:\n");
		for (Aluno aluno : aprovadosFisica) {
			if (aluno != null) {
				System.out.println(aluno.getNome());
			}
		}
		System.out.println("--------------------------------------");

		Aluno[] aprovadosGeografia = repositorio.obterAprovados(geografia);
		System.out.println("Aprovados em Geografia:\n");
		for (Aluno aluno : aprovadosGeografia) {
			if (aluno != null) {
				System.out.println(aluno.getNome());
			}
		}
		System.out.println("--------------------------------------");

		Aluno[] aprovadosHistoria = repositorio.obterAprovados(historia);
		System.out.println("Aprovados em História:\n");
		for (Aluno aluno : aprovadosHistoria) {
			if (aluno != null) {
				System.out.println(aluno.getNome());
			}
		}
		

	}

}
