package com.example.registro_2.beans;

import java.io.InputStream;
import java.sql.Blob;

public class Usuario {

    private String codigo_pucp;
    private String nombre;
    private String apellido;
    private String rol;
    private int dni;
    private int telefono;
    private String correo;
    private String contraseña;
    private String fecha_nacimiento;
    private String direccion;
    private String foto;
    private String tarjeta;

    public Usuario(String codigo_pucp, String nombre, String apellido, String rol, int dni, int telefono, String correo, String contraseña, String fecha_nacimiento, String direccion, String foto, String tarjeta) {
        this.codigo_pucp = codigo_pucp;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
        this.dni = dni;
        this.telefono = telefono;
        this.correo = correo;
        this.contraseña = contraseña;
        this.fecha_nacimiento = fecha_nacimiento;
        this.direccion = direccion;
        this.foto = foto;
        this.tarjeta = tarjeta;
    }

    public String getCodigo_pucp() {
        return codigo_pucp;
    }

    public void setCodigo_pucp(String codigo_pucp) {
        this.codigo_pucp = codigo_pucp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }
}
