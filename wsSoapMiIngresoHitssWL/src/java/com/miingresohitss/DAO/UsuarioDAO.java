package com.miingresohitss.DAO;

import com.miingresohitss.Model.UsuarioModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
    Conexion conn = new Conexion();
    
    public UsuarioModel validarLoguin(String usuarioP, String passwordP){
        UsuarioModel usuario = new UsuarioModel();        
        try{
            Connection connection = conn.Conectar();
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM USUARIO WHERE LOGIN=? AND PASSWORD=?");
            ps.setString(1, usuarioP);
            ps.setString(2, passwordP);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                usuario.setIdUsuario(rs.getString(1));
                usuario.setUsuario(rs.getString(2));
                usuario.setPassword(rs.getString(3));
            }
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return usuario;
    }
}
