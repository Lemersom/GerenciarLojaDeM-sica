package cods;



public class Venda{

	private String nomeVendedor = "";
	private int preco = 0;
	private int comissao = 0;

	public String getNomeVendedor(){
		return nomeVendedor;
	}
	public int getPreco(){
		return preco;
	}
	public int getComissao(){
		return comissao;
	}
	
	public void setNomeVendedor(String nomeVendedor){
		this.nomeVendedor = nomeVendedor;
	}
	public void setPreco(int preco){
		this.preco = preco;
	}

//Polimorfismo Sobrecarga
	public void calcComissao(){               //calcComissao = setComissao
		comissao = preco * 10/100;
	}
	public void calcComissao(int preco){
		comissao = preco * 10/100;
	}

}