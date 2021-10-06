package classes;

public class Aluno {
	
	private Disciplina disciplina = new Disciplina();
	
	private String nome;
	private int idade;
	private String dataNascimento;
	private String cpf;
	private String nomeMae;
	private String nomePai;
	private String nomeInstituicao;
	private double mediaFinal;
	private boolean classificacaoFinal;
	
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
	
	public Disciplina getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	
	
	public double getMediaFinal() {
		return (disciplina.getNota1() + disciplina.getNota2()
		+ disciplina.getNota3() + disciplina.getNota4()) / 4;
	}
	
	public boolean getClassificacaoFinal() {
		double media = this.getMediaFinal();
		if (media > 7) {
			return true;
		}
		else {
			return false;
		}
	}
}
