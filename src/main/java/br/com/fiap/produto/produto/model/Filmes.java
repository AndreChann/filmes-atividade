package br.com.fiap.produto.produto.model;

public class Filmes {
	private Long id;
	private String filme;
	private String diretor;
	private String elenco;
	private int lancamento;
	private String genero;
	private float nota;

	public Filmes(Long id, String filme, String diretor, String elenco, int lancamento, String genero, float nota) {
		super();
		this.id = id;
		this.filme = filme;
		this.diretor = diretor;
		this.elenco = elenco;
		this.lancamento = lancamento;
		this.genero = genero;
		this.nota = nota;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFilme() {
		return filme;
	}

	public void setFilme(String filme) {
		this.filme = filme;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public String getElenco() {
		return elenco;
	}

	public void setElenco(String elenco) {
		this.elenco = elenco;
	}

	public int getLancamento() {
		return lancamento;
	}

	public void setLancamento(int lancamento) {
		this.lancamento = lancamento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

}
