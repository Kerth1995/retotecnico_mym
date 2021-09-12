package m.m_test.service.serviceImpl;

import m.m_test.model.Cliente;
import m.m_test.model.Producto;
import m.m_test.repository.repositoryImpl.ProductoRepository;
import m.m_test.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements IProductoService {

    @Autowired
    ProductoRepository productoRepository;

    @Override
    public List<Producto> listarProducto() {
        return productoRepository.listarProducto();
    }
}
