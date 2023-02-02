package cods;



import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

// 

public class GerGuit {
    private Guitarra g1;
    
    pgGuit bd = new pgGuit();
    private List<Guitarra> bdGuit = bd.queryGuit();
    
    
    public List<Guitarra> getBdGuit(){
        return bdGuit;
    }
    
    public Guitarra cadGuit(Guitarra g1){
        if(consultaCodigo(g1) == null){
            bdGuit.add(g1);
            return g1;
        }
        else{
            return null;
        }
    }
    
    public Guitarra consultaCodigo(Guitarra g1){
        for(int i = 0; i < bdGuit.size(); i++){
            if(g1.getCodigo().equals(bdGuit.get(i).getCodigo())){
                return bdGuit.get(i);
            }
        }
        return null;
    }
    
    public Guitarra excluirGuit(Guitarra g1){
        g1 = consultaCodigo(g1);
        if(g1 != null){
            bdGuit.remove(g1);
            return null;
        }
        else{
            return g1;
        }
    }
    
    public Guitarra alteraGuit(Guitarra g1, String CodAnt){
        
        for(int i = 0; i < bdGuit.size(); i++){
            if(g1.getCodigo().equals(bdGuit.get(i).getCodigo())){
                
                CodAnt = g1.getCodigo();
                
                String codigo = JOptionPane.showInputDialog(null, "Novo codigo:", 
                                            "Alterar Guitarra", JOptionPane.QUESTION_MESSAGE);
                g1.setCodigo(codigo);
                bdGuit.set(i, g1);
                //
                String tipo = JOptionPane.showInputDialog(null, "Novo tipo:", 
                                            "Alterar Guitarra", JOptionPane.QUESTION_MESSAGE);
                g1.setTipo(tipo);
                bdGuit.set(i, g1);
                //
                String marca = JOptionPane.showInputDialog(null, "Nova marca:", 
                                            "Alterar Guitarra", JOptionPane.QUESTION_MESSAGE);
                g1.setMarca(marca);
                bdGuit.set(i, g1);
                //
                String modelo = JOptionPane.showInputDialog(null, "Novo modelo:", 
                                            "Alterar Guitarra", JOptionPane.QUESTION_MESSAGE);
                g1.setModelo(modelo);
                bdGuit.set(i, g1);
                //
                String captador = JOptionPane.showInputDialog(null, "Novo captador:", 
                                            "Alterar Guitarra", JOptionPane.QUESTION_MESSAGE);
                g1.setCaptador(captador);
                bdGuit.set(i, g1);
                //
                String qtdCordas = JOptionPane.showInputDialog(null, "Nova quantidade de cordas:", 
                                            "Alterar Guitarra", JOptionPane.QUESTION_MESSAGE);
                g1.setQtdCordas(Integer.parseInt(qtdCordas));
                bdGuit.set(i, g1);
                //
                String preco = JOptionPane.showInputDialog(null, "Novo preço:", 
                                            "Alterar Guitarra", JOptionPane.QUESTION_MESSAGE);
                g1.getVenda1().setPreco(Integer.parseInt(preco));
                bdGuit.set(i, g1);
                
                return bdGuit.get(i);
            }
        }
        return null;
    }
}
