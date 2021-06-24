package org.generation.blogPessoal.controller;

import java.util.List;

import org.generation.blogPessoal.model.Postagem;
import org.generation.blogPessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/postagens")
@CrossOrigin("*")
public class PostagemController {
		
	@Autowired	
	private PostagemRepository repository;
	
	@GetMapping("/findAll")
	public List<Postagem> findAll(){
		return repository.findAll();
	}
	
	@GetMapping("/findById")
	public List<Postagem> findById(){
		return repository.findById((long) 3);
	}
	@GetMapping("/getByTitulo")
	public List<Postagem> getByTitulo(){
		return repository.getByTitulo("teste");
	}
}
