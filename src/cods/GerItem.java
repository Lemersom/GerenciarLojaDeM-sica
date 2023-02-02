package cods;



import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

// 

public class GerItem{
    private Item i1;
    private List<Item> bdItem = new ArrayList<Item>();
    
    public List<Item> getBdItem(){
        return bdItem;
    }
    
    public Item cadItem(Item i1){
        if(consultaCodigo(i1) == null){
            bdItem.add(i1);
            return i1;
        }
        else{
            return null;
        }
    }
    
    public Item consultaCodigo(Item i1){
        for(int i = 0; i < bdItem.size(); i++){
            if(i1.getCodigo().equals(bdItem.get(i).getCodigo())){
                return bdItem.get(i);
            }
        }
        return null;
    }
    
    public Item excluirItem(Item i1){
        i1 = consultaCodigo(i1);
        if(i1 != null){
            bdItem.remove(i1);
            return null;
        }
        else{
            return i1;
        }
    }
    
    public Item alteraItem(Item i1){
        for(int i = 0; i < bdItem.size(); i++){
            if(i1.getCodigo().equals(bdItem.get(i).getCodigo())){
                String codigo = JOptionPane.showInputDialog(null, "Novo codigo:", 
                                            "Alterar Item", JOptionPane.QUESTION_MESSAGE);
                i1.setCodigo(codigo);
                bdItem.set(i, i1);
                //
                int qtd = Integer.parseInt(JOptionPane.showInputDialog(null, "Nova quantidade:", 
                                            "Alterar Item", JOptionPane.QUESTION_MESSAGE));
                i1.setQtd(qtd);
                bdItem.set(i, i1);
                //
                float preco = Float.parseFloat(JOptionPane.showInputDialog(null, "Novo preço:", 
                                            "Alterar Item", JOptionPane.QUESTION_MESSAGE));
                i1.setPreco(preco);
                bdItem.set(i, i1);
                //
                
                return bdItem.get(i);
            }
        }
        return null;
    }
}
