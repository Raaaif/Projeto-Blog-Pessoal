package br.org.generation.blogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.blogpessoal.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{ //herança de JPARepository  -  Qual tabela do Banco de dados os métodos irão trabalhar? No caso tabela postagem e PK Long


}
