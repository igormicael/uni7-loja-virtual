package br.com.im.negocio.models;

public class ItemEstoque {
	
	private Long id;
	private Produto produto;
	private Long quantidade;
	
	public ItemEstoque() {
		super();
	}
	
	public ItemEstoque(Long id, Produto produto, Long quantidade) {
		super();
		this.id = id;
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Long getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}
	
	public void aumentarQuantidade() {
		quantidade++;
	}
	
	public void diminuirQuantidade() {
		quantidade--;
	}

}