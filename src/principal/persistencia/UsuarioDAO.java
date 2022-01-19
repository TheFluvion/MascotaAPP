package principal.persistencia;

import principal.Usuario.Usuario;


public final class UsuarioDAO extends DAO {
    
    public void guardarUsuario (Usuario usuario) throws Exception{
        try {
            if (usuario == null) {
                throw new Exception ("Debe indicar un usuario");
            }
            
            String sql = "Insert INTO Usuario (correo electronico, clave"
                    + "VALUES ( '" + usuario.getCorreoElectronico() + "' , '" + usuario.getClave() + "' );";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void modificarUsuario (Usuario usuario) throws Exception{
        try {
            if(usuario==null){
                throw new Exception ("Indicar el usuario a modificar");
            }
            
            String sql = "UPDATE Usuario SET"
                    + "clave = '" + usuario.getClave() + "' WHERE correoElectronico = '" + usuario.getCorreoElectronico();
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void eliminarUsuario (String correoElectronico) throws Exception{
        try {
            String sql = "DELETE FROM Usuario WHERE correoEletronico = '" + correoElectronico + "'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    
    
    }
    
    public Usuario buscarUsuarioPorCorreo(String correoElectronico) throws Exception{
        try {
            String sql = "SELECT * FROM Usuario" +
                            " WHERE correoElectronico = '" + correoElectronico +"'";
            
            consultarBase(sql);
            
            Usuario usuario = null;
            while (resultado.next()){
                usuario = new Usuario();
                usuario.setId(resultado.getInt(1));
                usuario.setCorreoElectronico(resultado.getString(2));
                usuario.setClave(resultado.getString(3));
            
            }
                desconectarBase();
                return usuario;
        } catch (Exception e) {
            desconectarBase(); 
            throw e;
        }
        
    }
    
    
}
