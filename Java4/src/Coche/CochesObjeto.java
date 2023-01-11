package Coche;

public class CochesObjeto {

    private String modelo;
    private String marca;
    private String color;
    private String combustible;
    private String potencia;
    private String cilindrada;
    private String matricula;
    private int fechaMatriculacion;
    private static String tipo;

    public CochesObjeto(String modelo, String marca, String color, String combustible, String potencia, String cilindrada, String matricula, int fechaMatriculacion) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.combustible = combustible;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.matricula = matricula;
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public CochesObjeto() {
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(int fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public void metodoShow(){
        System.out.println(modelo);
        System.out.println(marca);
        System.out.println(color);
        System.out.println(combustible);
        System.out.println(potencia);
        System.out.println(cilindrada);
        System.out.println(matricula);
        System.out.println(fechaMatriculacion);
        System.out.println(tipo);
    }

}
