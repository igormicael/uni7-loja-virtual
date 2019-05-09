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
	
	public void diminuirQuantidade(Long q) {
		quantidade = quantidade - q;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((produto == null) ? 0 : produto.hashCode());
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
		ItemEstoque other = (ItemEstoque) obj;
		if (produto == null) {
			if (other.produto != null)
				return false;
		} else if (!produto.equals(other.produto))
			return false;
		return true;
	}

}