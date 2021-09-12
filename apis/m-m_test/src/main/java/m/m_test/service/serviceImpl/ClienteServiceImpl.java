package m.m_test.service.serviceImpl;

import m.m_test.model.Cliente;
import m.m_test.repository.repositoryImpl.ClienteRepository;
import m.m_test.repository.repositoryImpl.ProductoRepository;
import m.m_test.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements IClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public List<Cliente> listarCliente() {
        return clienteRepository.listarCliente();
    }
}
