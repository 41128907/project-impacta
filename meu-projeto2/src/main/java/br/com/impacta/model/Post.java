package br.com.impacta.model;


public class Post {
	
	private long id;
	private String titulo;
	private String descricao;
	private String autor;
	
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Post(Long id, String titulo, String descricao, String autor) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.autor = autor;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	@Override
	public String toString() {
		return "Post [id=" + id + ", titulo=" + titulo + ", descricao=" + descricao + ", autor=" + autor + "]";
	}
	

}
