package m.m_test.repository;

import m.m_test.model.Cliente;
import m.m_test.model.Producto;

import java.util.List;

public interface IProductoRepository {
    public List<Producto> listarProducto();
}
