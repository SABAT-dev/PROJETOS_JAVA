package testes;

import classes.Aluno;

public class AlunoTeste {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Simon Assagra");
		aluno1.setIdade(19);
		aluno1.setDataNascimento("01/10/2002");
		aluno1.setCpf("999.999.999-99");
		aluno1.setNomeMae("Márcia");
		aluno1.setNomePai("Higor");
		aluno1.setNomeInstituicao("Instituto Infnet");
		aluno1.setNota1(7);
		aluno1.setNota2(6.5);
		aluno1.setNota3(6);
		aluno1.setNota4(7.9);
		
		System.out.println("Nome do aluno: " + aluno1.getNome());
		System.out.println("Idade: " + aluno1.getIdade());
		System.out.println("Data de Nascimento: " + aluno1.getDataNascimento());
		System.out.println("CPF: " + aluno1.getCpf());
		System.out.println("Nome da mãe: " + aluno1.getNomeMae());
		System.out.println("Nome do pai: " + aluno1.getNomePai());
		System.out.println("Nome da Instituição: " + aluno1.getNomeInstituicao());
		System.out.printf("Média final: %.1f\n", aluno1.getMediaFinal());
		System.out.println("Classificação final: " + (aluno1.getClassificacaoFinal() ? "Aprovado" : "Reprovado"));
	}
}
