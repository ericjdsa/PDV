package DAO;

public class ProdutoDAO {
	
	int id;
	String marca;
	String modelo;
	String tipo;
	String garantia;
	String descricao;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {

		this.tipo = tipo;
	}
	
	public String getGarantia() {
		return garantia;
	}
	
	public void setGarantia(String garantia) {
		this.garantia = garantia;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
