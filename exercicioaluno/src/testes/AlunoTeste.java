package testes;

import javax.swing.JOptionPane;

import classes.Aluno;

public class AlunoTeste {
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual é o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Idade?");
		String data = JOptionPane.showInputDialog("Data de nascimento?");
		String cpf = JOptionPane.showInputDialog("CPF?");
		String mae = JOptionPane.showInputDialog("Nome da mãe?");
		String pai = JOptionPane.showInputDialog("Nome da pai?");
		String instituicao = JOptionPane.showInputDialog("Nome da instituição de ensino?");
		String disciplina1 = JOptionPane.showInputDialog("Nome da disciplina 1?");
		String nota1 = JOptionPane.showInputDialog("A nota 1?");
		String disciplina2 = JOptionPane.showInputDialog("Nome da disciplina 2?");
		String nota2 = JOptionPane.showInputDialog("A nota 2?");
		String disciplina3 = JOptionPane.showInputDialog("Nome da disciplina 3?");
		String nota3 = JOptionPane.showInputDialog("A nota 3?");
		String disciplina4 = JOptionPane.showInputDialog("Nome da disciplina 4?");
		String nota4 = JOptionPane.showInputDialog("A nota 4?");
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(data);
		aluno1.setCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setNomeInstituicao(instituicao);
		aluno1.getDisciplina().setDisciplina1(disciplina1);
		aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));
		aluno1.getDisciplina().setDisciplina2(disciplina2);
		aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));
		aluno1.getDisciplina().setDisciplina3(disciplina3);
		aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));
		aluno1.getDisciplina().setDisciplina4(disciplina4);
		aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));
		
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
