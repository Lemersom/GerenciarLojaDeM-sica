package cods;



import java.util.List;
import java.util.ArrayList;

// 

public class GerServico {
    private Servico s1;
    private List<Servico> bdServ = new ArrayList<Servico>();
    
    public List<Servico> getbdServ(){
        return bdServ;
    }
    
    public Servico cadServ(Servico s1){
        if(consultaCodigo(s1) == null){
            bdServ.add(s1);
            return s1;
        }
        else{
            return null;
        }
    }
    
    public Servico consultaCodigo(Servico s1){
        for(int i = 0; i < bdServ.size(); i++){
            if(s1.getCodigo().equals(bdServ.get(i).getCodigo())){
                return bdServ.get(i);
            }
        }
        return null;
    }
    
    public Servico excluirServ(Servico s1){
        s1 = consultaCodigo(s1);
        if(s1 != null){
            bdServ.remove(s1);
            return null;
        }
        else{
            return s1;
        }
    }
    
    public void concluirServ(Servico s1){
        s1.setStatus("Concluido");
    }
}
