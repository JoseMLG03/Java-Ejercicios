package Objeto;

public class Libro {

    /*Atributos*/

    private  String mes;
    private  String tituloLibro;
    private  int cantidadLibros;
    private  byte numeroConsultaLibro;
    private  int totalPrestamos;

    /*Constructores*/

    public Libro(String mes, String tituloLibro, int cantidadLibros, byte numeroConsultaLibro, int totalPrestamos) {
        this.mes = mes;
        this.tituloLibro = tituloLibro;
        this.cantidadLibros = cantidadLibros;
        this.numeroConsultaLibro = numeroConsultaLibro;
        this.totalPrestamos = totalPrestamos;
    }

    /*Getter y Setter*/

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public int getCantidadLibros() {
        return cantidadLibros;
    }

    public void setCantidadLibros(int cantidadLibros) {
        this.cantidadLibros = cantidadLibros;
    }

    public byte getNumeroConsultaLibro() {
        return numeroConsultaLibro;
    }

    public void setNumeroConsultaLibro(byte numeroConsultaLibro) {
        this.numeroConsultaLibro = numeroConsultaLibro;
    }

    public int getTotalPrestamos() {
        return totalPrestamos;
    }

    public void setTotalPrestamos(int totalPrestamos) {
        this.totalPrestamos = totalPrestamos;
    }
}
