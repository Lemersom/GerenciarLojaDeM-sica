package cods;



import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

// 

public class GerBaixo {
    private Baixo b1;
    private List<Baixo> bdBaixo = new ArrayList<Baixo>();
    
    public List<Baixo> getBdBaixo(){
        return bdBaixo;
    }
    
    public Baixo cadBaixo(Baixo b1){
        if(consultaCodigo(b1) == null){
            bdBaixo.add(b1);
            return b1;
        }
        else{
            return null;
        }
    }
    
    public Baixo consultaCodigo(Baixo b1){
        for(int i = 0; i < bdBaixo.size(); i++){
            if(b1.getCodigo().equals(bdBaixo.get(i).getCodigo())){
                return bdBaixo.get(i);
            }
        }
        return null;
    }
    
    public Baixo excluirBaixo(Baixo b1){
        b1 = consultaCodigo(b1);
        if(b1 != null){
            bdBaixo.remove(b1);
            return null;
        }
        else{
            return b1;
        }
    }
    
    public Baixo alteraBaixo(Baixo b1){
        for(int i = 0; i < bdBaixo.size(); i++){
            if(b1.getCodigo().equals(bdBaixo.get(i).getCodigo())){
                String codigo = JOptionPane.showInputDialog(null, "Novo codigo:", 
                                            "Alterar Baixo", JOptionPane.QUESTION_MESSAGE);
                b1.setCodigo(codigo);
                bdBaixo.set(i, b1);
                //
                String tipo = JOptionPane.showInputDialog(null, "Novo tipo:", 
                                            "Alterar Baixo", JOptionPane.QUESTION_MESSAGE);
                b1.setTipo(tipo);
                bdBaixo.set(i, b1);
                //
                String marca = JOptionPane.showInputDialog(null, "Nova marca:", 
                                            "Alterar Baixo", JOptionPane.QUESTION_MESSAGE);
                b1.setMarca(marca);
                bdBaixo.set(i, b1);
                //
                String modelo = JOptionPane.showInputDialog(null, "Novo modelo:", 
                                            "Alterar Baixo", JOptionPane.QUESTION_MESSAGE);
                b1.setModelo(modelo);
                bdBaixo.set(i, b1);
                //
                String captador = JOptionPane.showInputDialog(null, "Novo captador:", 
                                            "Alterar Baixo", JOptionPane.QUESTION_MESSAGE);
                b1.setCaptador(captador);
                bdBaixo.set(i, b1);
                //
                String qtdCordas = JOptionPane.showInputDialog(null, "Nova quantidade de cordas:", 
                                            "Alterar Baixo", JOptionPane.QUESTION_MESSAGE);
                b1.setQtdCordas(Integer.parseInt(qtdCordas));
                bdBaixo.set(i, b1);
                //
                String preco = JOptionPane.showInputDialog(null, "Novo preço:", 
                                            "Alterar Baixo", JOptionPane.QUESTION_MESSAGE);
                b1.getVenda1().setPreco(Integer.parseInt(preco));
                bdBaixo.set(i, b1);
                
                return bdBaixo.get(i);
            }
        }
        return null;
    }
}
