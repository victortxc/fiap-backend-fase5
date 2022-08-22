package br.com.traveller.implementacao;

import java.time.LocalDate;

import br.com.traveller.beans.Programacao;

public class TesteProgramacao {

	public static void main(String[] args) {
		Programacao programacao1 = new Programacao(
				1,
				1,
				"Passeio de buggy",
				"Passeio de buggy nas praias",
				"https://s3.aws/buggy.jpeg",
				150,
				LocalDate.now()
				);
		System.out.println(programacao1.getId());
		System.out.println(programacao1.getCidade_id());
		System.out.println(programacao1.getNome());
		System.out.println(programacao1.getDescricao());
		System.out.println(programacao1.getImagem());
		System.out.println(programacao1.getPreco());
		System.out.println(programacao1.getCriado_em());
		
		Programacao programacao2 = new Programacao();
		
		programacao2.setId(2);
		programacao2.setCidade_id(1);
		programacao2.setNome("Passeio de dromedario");
		programacao2.setDescricao("Passeio de dromedario nas dunas");
		programacao2.setImagem("https://s3.aws/dunas.jpeg");
		programacao2.setPreco(200);
		programacao2.setCriado_em(LocalDate.now());

		
		System.out.println(programacao2.getId());
		System.out.println(programacao2.getCidade_id());
		System.out.println(programacao2.getNome());
		System.out.println(programacao2.getDescricao());
		System.out.println(programacao2.getImagem());
		System.out.println(programacao2.getPreco());
		System.out.println(programacao2.getCriado_em());

	}

}
