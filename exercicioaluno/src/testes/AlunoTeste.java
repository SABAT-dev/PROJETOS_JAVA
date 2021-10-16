package testes;

import java.util.Iterator;

import javax.swing.JOptionPane;

import classes.Aluno;
import classes.Disciplina;

public class AlunoTeste {
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual é o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Idade?");
		String data = JOptionPane.showInputDialog("Data de nascimento?");
		String cpf = JOptionPane.showInputDialog("CPF?");
		String mae = JOptionPane.showInputDialog("Nome da mãe?");
		String pai = JOptionPane.showInputDialog("Nome da pai?");
		String instituicao = JOptionPane.showInputDialog("Nome da instituição de ensino?");
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(data);
		aluno1.setCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setNomeInstituicao(instituicao);
		
		for (int posicao = 1; posicao <= 4; posicao++) {
			
			Disciplina disciplina = new Disciplina();
			
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + posicao + "?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + posicao + "?");
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			aluno1.getDisciplinas().add(disciplina);
		}
		
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
