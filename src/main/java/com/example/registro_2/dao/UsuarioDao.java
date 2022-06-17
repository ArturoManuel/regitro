package com.example.registro_2.dao;

import com.example.registro_2.beans.Usuario;

import java.sql.*;
import java.util.ArrayList;

public class UsuarioDao {
    private static String user = "root";
    private static String pass = "root";
    private static String url = "jdbc:mysql://localhost:3306/mysystem4?serverTimezone=America/Lima";

    private static String sql_agregar="insert into usuarios(codigo_pucp,nombre,apellido,rol,dni,telefono,correo,contraseña,fecha_nacimiento,direccion,foto,tarjeta)\n" +
            "values (?,?,?,?,?,?,?,?,?,?,?,?);";
    private static String sql_delete="delete from usuarios where codigo_pucp=?;";


    public static void agregar(Usuario usuario) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection conn = DriverManager.getConnection(url, user, pass);
             PreparedStatement pstmt = conn.prepareStatement(sql_agregar)
             ) {
            System.out.println(usuario.getDireccion()+usuario.getContraseña()+usuario.getFecha_nacimiento());
            pstmt.setString(1, usuario.getCodigo_pucp());
            pstmt.setString(2, usuario.getNombre());
            pstmt.setString(3, usuario.getApellido());
            if (usuario.getRol() == null) {
                usuario.setRol("cliente");
            }
            pstmt.setString(4, usuario.getRol());
            pstmt.setInt(5, usuario.getDni());
            pstmt.setInt(6, usuario.getTelefono());
            pstmt.setString(7, usuario.getCorreo());
            pstmt.setString(8, usuario.getContraseña());
            pstmt.setString(9, usuario.getFecha_nacimiento());
            pstmt.setString(10, usuario.getDireccion());
            pstmt.setString(11, usuario.getFoto());
            pstmt.setString(12, usuario.getTarjeta());


            pstmt.executeUpdate();
        } catch (SQLException error) {
            error.printStackTrace();
        }


    }
    public static void eliminar(Usuario usuario) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection conn = DriverManager.getConnection(url, user, pass);
             PreparedStatement pstmt = conn.prepareStatement(sql_delete)
        ) {
            pstmt.setString(1, usuario.getCodigo_pucp());
            pstmt.executeUpdate();

        } catch (SQLException error) {
            error.printStackTrace();
        }


    }


}
