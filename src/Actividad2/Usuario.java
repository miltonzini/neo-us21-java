package Actividad2;

public class Usuario {
    private String dni;
    private String nombre;
    private String apellido;
    private String email;
    private String contrasena;
    private Boolean poseeLibro;

    public Usuario(String dni, String nombre, String apellido, String email, String contrasena, Boolean poseeLibro) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.contrasena = contrasena;
        this.poseeLibro = poseeLibro;
    }

     // Getters y setters
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
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

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Boolean getPoseeLibro() {
        return poseeLibro;
    }
    public void setPoseeLibro(Boolean poseeLibro) {
        this.poseeLibro = poseeLibro;
    }

}

