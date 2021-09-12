package m.m_test.repository;

import m.m_test.model.Cliente;
import m.m_test.model.MedioPago;

import java.util.List;

public interface IMedioPagoRepository {
    public List<MedioPago> listarMedioPago();
}
