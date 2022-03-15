package exercicioaluno.testes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import exercicioaluno.classes.Aluno;
import exercicioaluno.classes.Disciplina;
import exercicioaluno.classes.Secretario;
import exercicioaluno.constantes.AlunoConstante;
import exercicioaluno.interfaces.PermitirAcesso;

public class AlunoTeste {
	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		
		String login = JOptionPane.showInputDialog("Digite o seu login");
		String senha = JOptionPane.showInputDialog("Digite a sua senha");
		
		PermitirAcesso permitirAcesso = new Secretario(login, senha);
		
		if(permitirAcesso.autenticar()) {
						
			for (int numeroAlunos = 1; numeroAlunos <= 4; numeroAlunos++) {
				
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
							
				for (int posicaoDisciplinas = 1; posicaoDisciplinas <= 1; posicaoDisciplinas++) {
						
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
			
			maps.put(AlunoConstante.APROVADO, new ArrayList<Aluno>());
			maps.put(AlunoConstante.RECUPERACAO, new ArrayList<Aluno>());
			maps.put(AlunoConstante.REPROVADO, new ArrayList<Aluno>());
			
			for (Aluno aluno : alunos) {
				if(aluno.getClassificacaoFinal().equalsIgnoreCase(AlunoConstante.APROVADO)) {
					maps.get(AlunoConstante.APROVADO).add(aluno);
				} else if (aluno.getClassificacaoFinal().equalsIgnoreCase(AlunoConstante.RECUPERACAO)) {
					maps.get(AlunoConstante.RECUPERACAO).add(aluno);
				} else {
					maps.get(AlunoConstante.REPROVADO).add(aluno);
				}
			}
			
			System.out.println("------------LISTA DOS APROVADOS------------");
			for (Aluno aluno : maps.get(AlunoConstante.APROVADO)) {
				System.out.println("Aluno: " + aluno.getNome() + " | Média: " + aluno.getMediaFinal() + "\n");
			}
			
			System.out.println("------------LISTA DOS DE RECUPERAÇÃO------------");
			for (Aluno aluno : maps.get(AlunoConstante.RECUPERACAO)) {
				System.out.println("Aluno: " + aluno.getNome() + " | Média: " + aluno.getMediaFinal() + "\n");
			}
			
			System.out.println("------------LISTA DOS REPROVADOS------------");
			for (Aluno aluno : maps.get(AlunoConstante.REPROVADO)) {
				System.out.println("Aluno: " + aluno.getNome() + " | Média: " + aluno.getMediaFinal() + "\n");
			}
	
		} else {
			JOptionPane.showConfirmDialog(null, "Acesso não permitido");
		}
		
	}
}
