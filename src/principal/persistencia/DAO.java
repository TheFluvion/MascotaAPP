
package principal.persistencia;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public abstract class DAO {
    
    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;
    
    
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "perros";
    private final String DRIVER = "com.mysql.jdbc.Driver";

    public void rollback(){
        try{
            conexion.rollback();
        }catch (SQLException ex){
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  

    protected void conectarBase() throws ClassNotFoundException, SQLException{
        try{
            Class.forName(DRIVER);
            String urlBaseDeDatos = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false";
            conexion = DriverManager.getConnection(urlBaseDeDatos, USER, PASSWORD);
        
        
        
        }catch (ClassNotFoundException | SQLException ex){
            throw ex;
        }
    
    
    }
    
    protected void desconectarBase() throws Exception{
        try {
            if (resultado != null) {
                resultado.close();
            }
            if (sentencia!=null) {
                sentencia.close();
            }
            if (conexion!=null) {
                conexion.close();
            }
            
        } catch (Exception e) {
            throw e;   
        }

    }
    
    protected void insertarModificarEliminar(String sql) throws Exception{
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
        } catch (SQLException | ClassNotFoundException ex) {
            // conexion.rollback();
            /*
                descomentar la linea anterior si desean tener en cuent el rollback
                Correr el siguiente script en Workbench
                
                SET autocommit=1;
                COMMIT;
                
                sin rollback igual anda*/
            throw ex;
        }finally{
            desconectarBase();
        }
    }
    
    protected void consultarBase (String sql) throws Exception{
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
        } catch (Exception ex) {
            throw ex;
        }
    
    }
    
    
    
    
}
