package models;

public class Arbitro {
    private String nombre;
    private String colegio;
    private int velocidad;
    private int acierto;
    private Boolean activo;

    public Arbitro(String nombre, String colegio, Boolean activo) {
        this.nombre = nombre;
        this.colegio = colegio;
        this.activo = activo;
        this.velocidad = (int) (Math.random() * 100);
        this.acierto = (int) (Math.random() * 100);
    }

    public Arbitro() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getAcierto() {
        return acierto;
    }

    public void setAcierto(int acierto) {
        this.acierto = acierto;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Arbitro [nombre=" + nombre + ", colegio=" + colegio + ", velocidad=" + velocidad + ", acierto="
                + acierto + ", activo=" + activo + "]";
    }

}
