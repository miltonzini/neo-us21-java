package Actividad2;

public class Libro {
    private int id;
    private String titulo;
    private String autor;
    private String genero;
    private Boolean disponible;
    private String alquiladoDNI;

    public Libro(int id, String titulo, String autor, String genero, Boolean disponible, String alquiladoDNI) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.disponible = disponible;
        this.alquiladoDNI = alquiladoDNI;
    }

    // Getters y setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Boolean getDisponible() {
        return disponible;
    }
    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public String getAlquiladoDNI() {
        return alquiladoDNI;
    }
    public void setAlquiladoDNI(String alquiladoDNI) {
        this.alquiladoDNI = alquiladoDNI;
    }

}

