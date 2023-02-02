package cods;



import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

// 

public class GerViolao {
    private Violao v1;
    private List<Violao> bdViolao = new ArrayList<Violao>();
    
    public List<Violao> getBdViolao(){
        return bdViolao;
    }
    
    public Violao cadViolao(Violao v1){
        if(consultaCodigo(v1) == null){
            bdViolao.add(v1);
            return v1;
        }
        else{
            return null;
        }
    }
    
    public Violao consultaCodigo(Violao v1){
        for(int i = 0; i < bdViolao.size(); i++){
            if(v1.getCodigo().equals(bdViolao.get(i).getCodigo())){
                return bdViolao.get(i);
            }
        }
        return null;
    }
    
    public Violao excluirViolao(Violao v1){
        v1 = consultaCodigo(v1);
        if(v1 != null){
            bdViolao.remove(v1);
            return null;
        }
        else{
            return v1;
        }
    }
    
    public Violao alteraViolao(Violao v1){
        for(int i = 0; i < bdViolao.size(); i++){
            if(v1.getCodigo().equals(bdViolao.get(i).getCodigo())){
                String codigo = JOptionPane.showInputDialog(null, "Novo codigo:", 
                                            "Alterar Violão", JOptionPane.QUESTION_MESSAGE);
                v1.setCodigo(codigo);
                bdViolao.set(i, v1);
                //
                String tipo = JOptionPane.showInputDialog(null, "Novo tipo:", 
                                            "Alterar Violão", JOptionPane.QUESTION_MESSAGE);
                v1.setTipo(tipo);
                bdViolao.set(i, v1);
                //
                String marca = JOptionPane.showInputDialog(null, "Nova marca:", 
                                            "Alterar Violão", JOptionPane.QUESTION_MESSAGE);
                v1.setMarca(marca);
                bdViolao.set(i, v1);
                //
                String modelo = JOptionPane.showInputDialog(null, "Novo modelo:", 
                                            "Alterar Violão", JOptionPane.QUESTION_MESSAGE);
                v1.setModelo(modelo);
                bdViolao.set(i, v1);
                //
                String qtdCordas = JOptionPane.showInputDialog(null, "Nova quantidade de cordas:", 
                                            "Alterar Violão", JOptionPane.QUESTION_MESSAGE);
                v1.setQtdCordas(Integer.parseInt(qtdCordas));
                bdViolao.set(i, v1);
                //
                String preco = JOptionPane.showInputDialog(null, "Novo preço:", 
                                            "Alterar Violão", JOptionPane.QUESTION_MESSAGE);
                v1.getVenda1().setPreco(Integer.parseInt(preco));
                bdViolao.set(i, v1);
                
                return bdViolao.get(i);
            }
        }
        return null;
    }
}
