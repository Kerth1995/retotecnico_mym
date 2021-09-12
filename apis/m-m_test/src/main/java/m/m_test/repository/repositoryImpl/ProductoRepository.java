package m.m_test.repository.repositoryImpl;

import m.m_test.model.Cliente;
import m.m_test.model.MedioPago;
import m.m_test.model.Producto;
import m.m_test.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductoRepository implements IProductoRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Producto> listarProducto() {
        String sql = "SELECT int_id_producto\n" +
                "      ,vc_codigo\n" +
                "      ,vc_nombre\n" +
                "      ,vc_descripcion\n" +
                "  FROM dbo.tb_producto;";
        List<Producto> productos = null;
        try {
            productos = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Producto.class));
            return productos;
        }catch (Exception ex){
            ex.printStackTrace();
            return productos;
        }
    }
}
