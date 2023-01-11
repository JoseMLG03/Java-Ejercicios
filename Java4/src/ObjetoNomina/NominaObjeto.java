package ObjetoNomina;

public class NominaObjeto {

    /*Variables*/

    private String nombreEmpleado;
    private float sueldoBase;
    private float porcDescuento;
    private byte numeroHorasTrabajadas;
    private float precioHora;

    private float mesActual;

    /*Constructores*/

    public NominaObjeto(String nombreEmpleado, float sueldoBase, float porcDescuento, byte numeroHorasTrabajadas, float precioHora, float mesActual) {
        this.nombreEmpleado = nombreEmpleado;
        this.sueldoBase = sueldoBase;
        this.porcDescuento = porcDescuento;
        this.numeroHorasTrabajadas = numeroHorasTrabajadas;
        this.precioHora = precioHora;
        this.mesActual = mesActual;
    }

    /*Getter / Setter*/

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public float getPorcDescuento() {
        return porcDescuento;
    }

    public void setPorcDescuento(float porcDescuento) {
        this.porcDescuento = porcDescuento;
    }

    public byte getNumeroHorasTrabajadas() {
        return numeroHorasTrabajadas;
    }

    public void setNumeroHorasTrabajadas(byte numeroHorasTrabajadas) {
        this.numeroHorasTrabajadas = numeroHorasTrabajadas;
    }

    public float getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(float precioHora) {
        this.precioHora = precioHora;
    }

    public float getMesActual() {
        return mesActual;
    }

    public void setMesActual(float mesActual) {
        this.mesActual = mesActual;
    }
}
