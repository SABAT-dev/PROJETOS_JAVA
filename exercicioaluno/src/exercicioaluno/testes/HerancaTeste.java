package exercicioaluno.testes;

import exercicioaluno.classes.Aluno;
import exercicioaluno.classes.Diretor;
import exercicioaluno.classes.Secretario;

public class HerancaTeste {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Filipe Massa");
		aluno.setCpf("091.432.010-67");
		aluno.setNomeInstituicao("Disneylândia");
		
		Diretor diretor = new Diretor();
		diretor.setNome("Henrique Carlos");
		diretor.setTempoDirecao(2);
		diretor.setRegistroEducacao("dasdasudgasuyd");
		
		Secretario secretario = new Secretario();
		secretario.setNome("Marcela Candida");
		secretario.setExperiencia("Gestão");
		secretario.setRegistro("sfjdsfsadfjufj");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println("Salário do Aluno: " + aluno.salario());
		System.out.println("Salário do Diretor: " + diretor.salario());
		System.out.println("Salário do Secretário: " + secretario.salario());
	}
}
