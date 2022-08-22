package br.com.traveller.implementacao;

import java.time.LocalDate;

import br.com.traveller.beans.Cidade;

public class TesteCidade {

	public static void main(String[] args) {
		Cidade cidade1 = new Cidade(
				1,
				"Natal",
				"Brasil",
				"RN",
				"https://s3.aws/fdsfsdfsdfsd.jpeg",
				"Cidade do sol",
				LocalDate.now()
				);
		System.out.println(cidade1.getId());
		System.out.println(cidade1.getNome());
		System.out.println(cidade1.getPais());
		System.out.println(cidade1.getEstado());
		System.out.println(cidade1.getImagem());
		System.out.println(cidade1.getDescricao());
		System.out.println(cidade1.getCriado_em());
		
		Cidade cidade2 = new Cidade();
		cidade2.setCriado_em(LocalDate.now());
		cidade2.setNome("São Paulo");
		cidade2.setPais("Brasil");
		cidade2.setEstado("SP");
		cidade2.setImagem("https://s3.aws/fdsfsdffdsfsdfsd.jpeg");
		cidade2.setDescricao("Descricao");
		cidade2.setId(2);
		
		System.out.println(cidade1.getId());
		System.out.println(cidade1.getNome());
		System.out.println(cidade1.getPais());
		System.out.println(cidade1.getEstado());
		System.out.println(cidade1.getImagem());
		System.out.println(cidade1.getDescricao());
		System.out.println(cidade1.getCriado_em());

	}

}
