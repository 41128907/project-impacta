package br.com.impacta.springmvc.meuprojeto;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.impacta.dao.PostDAO;
import br.com.impacta.model.Post;



@RunWith(SpringRunner.class)
@SpringBootTest
public class PostRepositoryTests {
	
	@Autowired
	PostDAO dao;

	@Test
	public void criar() {
		Post post = new Post();
		post.setTitulo("Titulo 1");
		post.setAutor("Autor 1");
		post.setDescricao("Descricao 1");
		
		//Assert.assertNull(post.getId()); 
		dao.save(post);
		Long cod = post.getId();
		Assert.assertNotNull(cod); 
		
	}
	
	@Test
	public void buscarTodos() {
		
		List<Post> lista = dao.findAll();
		System.out.println(lista);

	}
	
	@Test
	public void findByTitulo(){
		Post post = new Post();
		post.setTitulo("Titulo 1");
		post.setAutor("Autor 1");
		post.setDescricao("Descricao 1");
		
		dao.save(post);
		
		String titulo = post.getTitulo();
		List<Post> list = dao.findByTitulo(titulo);
		
		
		
		Assert.assertNotNull(list); 
		
		System.out.println("Lista: " + list);
	}

	@Test
	public void atualizar(){
		Post postLocal = new Post();
		postLocal.setTitulo("Titulo 1");
		postLocal.setAutor("Autor 1");
		postLocal.setDescricao("Descricao 1");
		
		dao.save(postLocal);
		
		
		
	}
	
	@Test
	public void excluir(){
		
		Post postLocal1 = new Post();
		postLocal1.setTitulo("Titulo 1");
		postLocal1.setAutor("Autor 1");
		postLocal1.setDescricao("Descricao 1");
		
		
		
	}
}
