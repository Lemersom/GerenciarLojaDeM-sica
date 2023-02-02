package cods;



abstract class InstrumentoMusical{
	
	private String codigo = "";
	private String tipo = "";
	private String marca = "";

	private String nomeCli = "";
	
	private Venda venda1 = new Venda();



	public String getCodigo(){
		return codigo;
	}

	public String getTipo(){
		return tipo;
	}

	public String getMarca(){
		return marca;
	}

	public Venda getVenda1(){
		return venda1;
	}

	public String getNomeCli(){
		return nomeCli;
	}


	public void setCodigo(String codigo){
		this.codigo = codigo;
	}

	public void setTipo(String tipo){
		this.tipo = tipo;
	}

	public void setMarca(String marca){
		this.marca = marca;
	}

	public void setVenda1(Venda venda1){
		this.venda1 = venda1;
	}
	
	public void setNomeCli(String nomeCli){
		this.nomeCli = nomeCli;
	}
}