package br.com.traveller.implementacao;

import java.time.LocalDate;

import br.com.traveller.beans.Usuario;

public class TesteUsuario {

	public static void main(String[] args) {
		Usuario usuario1 = new Usuario(
				1,
				"usuario@gmail.com",
				"Primeiro Usuario",
				false,
				"senha123",
				LocalDate.now()
				);
		System.out.println(usuario1.getId());
		System.out.println(usuario1.getEmail());
		System.out.println(usuario1.getNome());
		System.out.println(usuario1.getPassword());
		System.out.println(usuario1.isEmail_verificado());
		System.out.println(usuario1.getCriado_em());
		
		Usuario usuario2 = new Usuario();
		usuario2.setCriado_em(LocalDate.now());
		usuario2.setEmail("usuario2@gmail.com");
		usuario2.setEmail_verificado(true);
		usuario2.setId(2);
		usuario2.setNome("Segundo Usuario");
		usuario2.setPassword("123456");
		
		System.out.println(usuario2.getId());
		System.out.println(usuario2.getEmail());
		System.out.println(usuario2.getNome());
		System.out.println(usuario2.getPassword());
		System.out.println(usuario2.isEmail_verificado());
		System.out.println(usuario2.getCriado_em());
	}

}
