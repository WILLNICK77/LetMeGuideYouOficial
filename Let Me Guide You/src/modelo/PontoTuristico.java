package modelo;

public class PontoTuristico {
	
	private int codigo;
	private String nome;
	private String cidade;
	private String estado;
	
	
	
	public PontoTuristico(String nome, String cidade, String estado) {
	
		this.nome = nome;
		this.cidade = cidade;
		this.estado = estado;
	}



	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCidade() {
		return cidade;
	}



	public void setCidade(String cidade) {
		this.cidade = cidade;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	
	
	

}
