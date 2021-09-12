package m.m_test.model;

public class Producto {
    private int int_id_producto;
    private String vc_codigo;
    private String vc_nombre;
    private String vc_descripcion;

    public Producto() {
    }

    public int getInt_id_producto() {
        return int_id_producto;
    }

    public void setInt_id_producto(int int_id_producto) {
        this.int_id_producto = int_id_producto;
    }

    public String getVc_codigo() {
        return vc_codigo;
    }

    public void setVc_codigo(String vc_codigo) {
        this.vc_codigo = vc_codigo;
    }

    public String getVc_nombre() {
        return vc_nombre;
    }

    public void setVc_nombre(String vc_nombre) {
        this.vc_nombre = vc_nombre;
    }

    public String getVc_descripcion() {
        return vc_descripcion;
    }

    public void setVc_descripcion(String vc_descripcion) {
        this.vc_descripcion = vc_descripcion;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "int_id_producto=" + int_id_producto +
                ", vc_codigo='" + vc_codigo + '\'' +
                ", vc_nombre='" + vc_nombre + '\'' +
                ", vc_descripcion='" + vc_descripcion + '\'' +
                '}';
    }
}
