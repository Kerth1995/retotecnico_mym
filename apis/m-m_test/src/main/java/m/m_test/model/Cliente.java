package m.m_test.model;

public class Cliente {
    private int int_id_cliente;
    private String vc_codigo;
    private String vc_dni;
    private String vc_nombres;
    private String vc_apellidos;

    public Cliente() {
    }

    public int getInt_id_cliente() {
        return int_id_cliente;
    }

    public void setInt_id_cliente(int int_id_cliente) {
        this.int_id_cliente = int_id_cliente;
    }

    public String getVc_codigo() {
        return vc_codigo;
    }

    public void setVc_codigo(String vc_codigo) {
        this.vc_codigo = vc_codigo;
    }

    public String getVc_dni() {
        return vc_dni;
    }

    public void setVc_dni(String vc_dni) {
        this.vc_dni = vc_dni;
    }

    public String getVc_nombres() {
        return vc_nombres;
    }

    public void setVc_nombres(String vc_nombres) {
        this.vc_nombres = vc_nombres;
    }

    public String getVc_apellidos() {
        return vc_apellidos;
    }

    public void setVc_apellidos(String vc_apellidos) {
        this.vc_apellidos = vc_apellidos;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "int_id_cliente=" + int_id_cliente +
                ", vc_codigo=" + vc_codigo +
                ", vc_dni=" + vc_dni +
                ", vc_nombres=" + vc_nombres +
                ", vc_apellidos=" + vc_apellidos +
                '}';
    }
}
