package m.m_test.repository.repositoryImpl;

import m.m_test.model.Cliente;
import m.m_test.model.MedioPago;
import m.m_test.repository.IMedioPagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MedioPagoRepository implements IMedioPagoRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<MedioPago> listarMedioPago() {
        String sql = "SELECT int_id_medio_pago\n" +
                "      ,int_codigo\n" +
                "      ,vc_nombre\n" +
                "      ,vc_descripcion\n" +
                "  FROM dbo.tb_medio_pago;";
        List<MedioPago> medioPagos = null;
        try {
            medioPagos = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(MedioPago.class));
            return medioPagos;
        }catch (Exception ex){
            ex.printStackTrace();
            return medioPagos;
        }
    }
}
