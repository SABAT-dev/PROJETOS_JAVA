package classes;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	private String nome;
	private int idade;
	private String dataNascimento;
	private String cpf;
	private String nomeMae;
	private String nomePai;
	private String nomeInstituicao;
	private double mediaFinal;
	private boolean classificacaoFinal;
	
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public Aluno() {

	}

	public Aluno(String nome) {
		this.nome = nome;
	}
	
	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeInstituicao() {
		return nomeInstituicao;
	}

	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}	
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public double getMediaFinal() {
		
		double somaMediaFinal = 0.0; 
		
		for (Disciplina disciplina : disciplinas) {
			somaMediaFinal += disciplina.getNota();
		}
		
		return somaMediaFinal / disciplinas.size();
	}

	public String getClassificacaoFinal() {
		double media = this.getMediaFinal();
		if (media >= 5) {
			if (media >= 7) {
				return "Aluno(a) aprovado(a)";
			}	
			else {
				return "Aluno(a) de recuperação";
			}
		}
		else {
			return "Aluno(a) reprovado(a)";
		}
	}
}
