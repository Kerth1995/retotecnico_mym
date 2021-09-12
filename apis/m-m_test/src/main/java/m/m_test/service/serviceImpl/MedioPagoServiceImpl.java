package m.m_test.service.serviceImpl;

import m.m_test.model.Cliente;
import m.m_test.model.MedioPago;
import m.m_test.repository.repositoryImpl.MedioPagoRepository;
import m.m_test.service.IMedioPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedioPagoServiceImpl implements IMedioPagoService {

    @Autowired
    MedioPagoRepository medioPagoRepository;

    @Override
    public List<MedioPago> listarMeedioPago() {
        return medioPagoRepository.listarMedioPago();
    }
}
