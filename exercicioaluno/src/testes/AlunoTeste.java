package testes;

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
		
		Disciplina disciplina01 = new Disciplina();
		disciplina01.setDisciplina("Java Web");
		disciplina01.setNota(8);
		
		aluno1.getDisciplinas().add(disciplina01);
		
		Disciplina disciplina02 = new Disciplina();
		disciplina02.setDisciplina("Java Nuvem");
		disciplina02.setNota(7);
		
		aluno1.getDisciplinas().add(disciplina02);
		
		Disciplina disciplina03 = new Disciplina();
		disciplina03.setDisciplina("Projeto de Bloco");
		disciplina03.setNota(8.2);
		
		aluno1.getDisciplinas().add(disciplina03);
		
		Disciplina disciplina04 = new Disciplina();
		disciplina04.setDisciplina("Banco de Dados");
		disciplina04.setNota(6.9);
		
		aluno1.getDisciplinas().add(disciplina04);
		
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
