package m.m_test.repository.repositoryImpl;

import m.m_test.model.Cliente;
import m.m_test.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClienteRepository implements IClienteRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Cliente> listarCliente() {
        String sql = "SELECT int_id_cliente\n" +
                "      ,vc_codigo\n" +
                "      ,vc_dni\n" +
                "      ,vc_nombres\n" +
                "      ,vc_apellidos\n" +
                "  FROM dbo.tb_cliente;";
        List<Cliente> clientes = null;
        try {
            clientes = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Cliente.class));
            return clientes;
        }catch (Exception ex){
            ex.printStackTrace();
            return clientes;
        }
    }
}
