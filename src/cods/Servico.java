package cods;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Servico {
    
    private String codigo;
    private String luthier;
    private String descricao;
    private String data;
    private String status = "Pendente";
    private float valor;
    
    
    public String getData(){
        return data;
    }
    public String getCodigo(){
        return codigo;
    }
    public String getLuthier(){
        return luthier;
    }
    public String getDescricao(){
        return descricao;
    }
    public String getStatus(){
        return status;
    }
    public float getValor(){
        return valor;
    }
    
    
    public void setData(String data){
	this.data = data;
    }
    public void setCodigo(String codigo){
	this.codigo = codigo;
    }
    public void setLuthier(String luthier){
	this.luthier = luthier;
    }
    public void setDescricao(String descricao){
	this.descricao = descricao;
    }
    public void setStatus(String status){
	this.status = status;
    }
    public void setValor(float valor){
	this.valor = valor;
    }
    
}
