package br.com.impacta.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.impacta.model.Post;

public interface PostDAO extends JpaRepository<Post, Integer> {
	
	public List<Post> findByTitulo(String titulo);

}



