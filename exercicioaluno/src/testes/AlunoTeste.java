package testes;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import classes.Aluno;
import classes.Disciplina;

public class AlunoTeste {
	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
			
		for (int numeroAlunos = 1; numeroAlunos <= 2; numeroAlunos++) {
			
			String nome = JOptionPane.showInputDialog("Qual é o nome do aluno " + numeroAlunos + "?");
			/*String idade = JOptionPane.showInputDialog("Idade?");
			String data = JOptionPane.showInputDialog("Data de nascimento?");
			String cpf = JOptionPane.showInputDialog("CPF?");
			String mae = JOptionPane.showInputDialog("Nome da mãe?");
			String pai = JOptionPane.showInputDialog("Nome da pai?");
			String instituicao = JOptionPane.showInputDialog("Nome da instituição de ensino?");*/
				
			Aluno aluno1 = new Aluno();
				
			aluno1.setNome(nome);
			/*aluno1.setIdade(Integer.valueOf(idade));
			aluno1.setDataNascimento(data);
			aluno1.setCpf(cpf);
			aluno1.setNomeMae(mae);
			aluno1.setNomePai(pai);
			aluno1.setNomeInstituicao(instituicao);*/
						
			for (int posicaoDisciplinas = 1; posicaoDisciplinas <= 4; posicaoDisciplinas++) {
					
				Disciplina disciplina = new Disciplina();
					
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + posicaoDisciplinas + "?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + posicaoDisciplinas + "?");
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));
				aluno1.getDisciplinas().add(disciplina);
			}
				
			int decisao = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
				
			if(decisao == 0) {
					
				int continuarRemovendo = 0;
				int posicao = 1;
				while (continuarRemovendo == 0) {
					String removerDisciplina = JOptionPane.showInputDialog("Qual disciplina quer remover 1,2,3 ou 4?");
					aluno1.getDisciplinas().remove(Integer.valueOf(removerDisciplina).intValue() - posicao);
					posicao++;
					continuarRemovendo = JOptionPane.showConfirmDialog(null, "Deseja continuar removendo?");
				}
			}
				
			alunos.add(aluno1);
		}
			
		for (Aluno aluno : alunos) {
			if(aluno.getNome().equalsIgnoreCase("simon")) {
				alunos.remove(aluno);
				break;
			} else {
				System.out.println("Nome do aluno: " + aluno.getNome());
				System.out.println("Idade: " + aluno.getIdade());
				System.out.println("Data de Nascimento: " + aluno.getDataNascimento());
				System.out.println("CPF: " + aluno.getCpf());
				System.out.println("Nome da mãe: " + aluno.getNomeMae());
				System.out.println("Nome do pai: " + aluno.getNomePai());
				System.out.println("Nome da Instituição: " + aluno.getNomeInstituicao());
				System.out.printf("Média final: %.1f\n", aluno.getMediaFinal());
				System.out.println("Classificação final: " + (aluno.getClassificacaoFinal()));	
				System.out.println(".............................................................");
			}
		}
		
		for (Aluno aluno : alunos) {
			System.out.println("Alunos que restaram na lista: " + aluno.getNome());
			System.out.println("Lista de matérias desse(s) aluno(s):");
			for (Disciplina disciplina : aluno.getDisciplinas()) {
				System.out.println(disciplina.getDisciplina());
			}
		}
	}
}
