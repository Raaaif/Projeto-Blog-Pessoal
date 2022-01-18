package br.org.generation.blogpessoal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.blogpessoal.model.Postagem;
import br.org.generation.blogpessoal.repository.PostagemRepository;

@RestController //Define que é uma classe controladora
@RequestMapping("/postagens") //Define "postagens" como 
@CrossOrigin(origins = "*", allowedHeaders = "*") //Ligação com frontend Informa que pode ser qualquer origem para ter acesso a aplicação
public class PostagemController {
	
	@Autowired //Spring decide ai os dados utilizamos manualmente Postagem postagem = new postagem(1(id),yyyyy(titulo)...) 
	private PostagemRepository postagemRepository;
	
	@GetMapping
	public ResponseEntity<List<Postagem>> getAll(){  //Retorne uma resposta http + uma Lista de todos os itens dentro da classe Postagem
		return ResponseEntity.ok(postagemRepository.findAll()); //Vai retornar um ok mais os dados que quero consultar = select * from tb_postagens
		
		
	}

}
