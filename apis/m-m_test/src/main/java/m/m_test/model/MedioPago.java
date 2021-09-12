package m.m_test.model;

public class MedioPago {
    private int int_id_medio_pago;
    private int int_codigo;
    private String vc_nombre;
    private String vc_descripcion;

    public MedioPago() {
    }

    public int getInt_id_medio_pago() {
        return int_id_medio_pago;
    }

    public void setInt_id_medio_pago(int int_id_medio_pago) {
        this.int_id_medio_pago = int_id_medio_pago;
    }

    public int getInt_codigo() {
        return int_codigo;
    }

    public void setInt_codigo(int int_codigo) {
        this.int_codigo = int_codigo;
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
        return "MedioPago{}";
    }
}
