package model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Cliente {
    
    private int idCliente;
    @NotBlank (message = "Nombre y apellido son obligatorios")
    private String nombre;
    @NotBlank (message = "Numero de telefono es obligatorio")
    @Size (message = "Formato +56123456789 o 123456789", min = 9, max = 12)
    private String telefono;
    @NotBlank (message = "El email es obligatorio")
    @Email (message = "Formato valido requerido, nombre@domino.com")
    private String email;
    
    public Cliente() {
    }

    public Cliente(int idCliente, String nombre, String telefono, String email) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
