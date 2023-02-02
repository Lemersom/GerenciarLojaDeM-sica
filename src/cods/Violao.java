package cods;



public class Violao extends InstrumentoMusical{

	private String modelo = "";
	private int qtdCordas = 0;
        public String produto = "Violão";

        

	public String getModelo(){
		return modelo;
	}

	public int getQtdCordas(){
		return qtdCordas;
	}

	public void setModelo(String modelo){
		this.modelo = modelo;
	}

	public void setQtdCordas(int qtdCordas){
		this.qtdCordas = qtdCordas;
	}

}