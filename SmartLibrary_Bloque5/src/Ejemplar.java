public class Ejemplar {
    private String codigo;
    private String estado;

    public Ejemplar(String codigo, String estado) {
        this.codigo = codigo;
        this.estado = estado;
    }

    public String getCodigo() { return codigo; }
    public String getEstado() { return estado; }
}
