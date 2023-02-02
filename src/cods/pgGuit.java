package cods;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class pgGuit {
    private final String url = "jdbc:postgresql://localhost/projetodesktop";
    private final String user = "postgres";
    private final String password = ""; //COLOCAR SENHA

    
    
    public Connection connect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
    
    
    public void insertGuit(Guitarra guit){
        String SQL = "Insert into Guitarra (codigo, tipo, marca, modelo, qtdCordas, captador, preco) " + 
                     "Values (?, ?, ?, ?, ?, ?, ?)";
        
        
        
        try (Connection conn = connect();
                PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            
            pstmt.setString(1, guit.getCodigo());
            pstmt.setString(2, guit.getTipo());
            pstmt.setString(3, guit.getMarca());
            pstmt.setString(4, guit.getModelo());
            pstmt.setString(5, guit.getQtdCordas()+"");
            pstmt.setString(6, guit.getCaptador());
            pstmt.setFloat(7, guit.getVenda1().getPreco());

            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
    public void updateGuit(Guitarra guit, String CodAnt){
        String SQL = "Update Guitarra set "
                + "codigo = ?, tipo = ?, marca = ?, modelo = ?, "
                + "qtdCordas = ?, captador = ?, preco = ? "
                + "where codigo = ?";
        
        try(Connection conn = connect();
                PreparedStatement pstmt = conn.prepareStatement(SQL)){
            
            pstmt.setString(1, guit.getCodigo());
            pstmt.setString(2, guit.getTipo());
            pstmt.setString(3, guit.getMarca());
            pstmt.setString(4, guit.getModelo());
            pstmt.setString(5, guit.getQtdCordas()+"");
            pstmt.setString(6, guit.getCaptador());
            pstmt.setFloat(7, guit.getVenda1().getPreco());
            pstmt.setString(8, CodAnt);
            
            pstmt.executeUpdate();
            
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    
    public void deleteGuit(Guitarra guit){
        String SQL = "Delete from Guitarra where codigo = ?";
        
        try(Connection conn = connect();
                PreparedStatement pstmt = conn.prepareStatement(SQL)){
            
            pstmt.setString(1, guit.getCodigo());
            
            pstmt.executeUpdate();
            
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public List<Guitarra> queryGuit(){
        List<Guitarra> guits = new ArrayList<Guitarra>();

        String SQL = "Select * from guitarra";
        
        try(Connection conn = connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(SQL)){
            
            while(rs.next()){
                
                Guitarra g1 = new Guitarra();
                g1.setCodigo(rs.getString("codigo"));
                g1.setTipo(rs.getString("tipo"));
                g1.setMarca(rs.getString("marca"));
                g1.setModelo(rs.getString("modelo"));
                g1.setQtdCordas(Integer.parseInt(rs.getString("qtdCordas")));
                g1.setCaptador(rs.getString("captador"));
                g1.getVenda1().setPreco((int) Float.parseFloat(rs.getString("preco")));
                
                guits.add(g1);

            }
            

        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        
        return guits;
    }
    
    public String searchCodGuit(String codSearch){
        String SQL = "Select * from guitarra";
        String cod = "";
        
        try(Connection conn = connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(SQL)){
            
            while(rs.next()){
                
                if(rs.getString("codigo").equals(codSearch)){
                    return codSearch;
                }
            }
            

        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        
        return "";
    }
}
