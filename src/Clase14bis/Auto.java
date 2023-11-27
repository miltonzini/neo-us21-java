package Clase14bis;

public class Auto {

    private String marca;

    private String modelo;

    private boolean enMarcha;

    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.enMarcha = enMarcha;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isEnMarcha() {
        return enMarcha;
    }

    public void setEnMarcha(boolean enMarcha) {
        this.enMarcha = enMarcha;
    }

    @Override
    public String toString() {
        return "Auto{"
                + "marca='" + marca + '\''
                + ", modelo='" + modelo + '\''
                + ",enMarcha" + enMarcha
                + '}';
    }

}