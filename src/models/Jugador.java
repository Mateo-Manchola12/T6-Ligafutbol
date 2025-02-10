package models;

public class Jugador {
    private String nombre;
    private String posicion;
    private int velocidad;
    private int regate;
    private Boolean lesionado;

    public Jugador(String nombre, String posicion, Boolean lesionado) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.lesionado = lesionado;
        this.regate = (int) (Math.random() * 100);
        this.velocidad = (int) (Math.random() * 100);
    }

    public Jugador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getRegate() {
        return regate;
    }

    public void setRegate(int regate) {
        this.regate = regate;
    }

    public Boolean getLesionado() {
        return lesionado;
    }

    public void setLesionado(Boolean lesionado) {
        this.lesionado = lesionado;
    }

    @Override
    public String toString() {
        return "Jugador [nombre=" + nombre + ", posicion=" + posicion + ", velocidad=" + velocidad + ", regate="
                + regate + ", lesionado=" + lesionado + "]";
    }

}
