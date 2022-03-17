package br.com.fiap.produto.produto.controllers;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.produto.produto.model.Filmes;

@Controller
public class ListaController {
	
	@GetMapping("/lista")
	public ModelAndView index() {
		ModelAndView modelView = new ModelAndView("listaFilmes/lista");
													//Long id, String filme, String diretor, String elenco, int lancamento, String genero, float nota
		Filmes filme1 = new Filmes(new Long(1), "Percy Jackson e os Ladrões do Olimpo", "Rick Riordan","Logan Lerman - Kevin McKidd - Steve Coogan",(2010),"Literatura fantástica", (8));
		Filmes filme2 = new Filmes(new Long(2),"Uncharted", "Ruben Fleischer","Tom Holland - Mark Wahlberg - Sophia Ali - Tati Gabrielle - Antonio Banderas",(2022),"Ação/Aventura", (9));
		Filmes filme3 = new Filmes(new Long(3),"Os Croods", "Joel Crawford","Nicolas Cage - Emma Stone - Ryan Reynolds - Chris Sanders - Catherine Keener",(2013),"Animação", (10));
				
		List<Filmes> filmes = Arrays.asList(filme1, filme2, filme3);
		modelView.addObject("listarFilmes", filmes);
		
		return modelView;
	}
}
