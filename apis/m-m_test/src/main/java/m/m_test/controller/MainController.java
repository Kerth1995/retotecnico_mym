package m.m_test.controller;

import m.m_test.model.ResponseData;
import m.m_test.service.serviceImpl.ClienteServiceImpl;
import m.m_test.service.serviceImpl.MedioPagoServiceImpl;
import m.m_test.service.serviceImpl.ProductoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {

    @Autowired
    ClienteServiceImpl clienteService;

    @Autowired
    ProductoServiceImpl productoService;

    @Autowired
    MedioPagoServiceImpl medioPagoService;

    @GetMapping("clientes")
    public ResponseEntity<?> obtenerClientes(){
        ResponseData data = new ResponseData();
        try {
            data.setData(clienteService.listarCliente());
            data.setCodeStatus(HttpStatus.OK.value()+"");
            data.setStatus(HttpStatus.OK.toString());
            return new ResponseEntity<>(data, HttpStatus.OK);
        }catch (Exception exception){
            data.setCodeStatus(HttpStatus.BAD_REQUEST.value()+"");
            data.setStatus(HttpStatus.BAD_REQUEST.toString());
            return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("productos")
    public ResponseEntity<?> obteneProductos(){
        ResponseData data = new ResponseData();
        try {
            data.setData(productoService.listarProducto());
            data.setCodeStatus(HttpStatus.OK.value()+"");
            data.setStatus(HttpStatus.OK.toString());
            return new ResponseEntity<>(data, HttpStatus.OK);
        }catch (Exception exception){
            data.setCodeStatus(HttpStatus.BAD_REQUEST.value()+"");
            data.setStatus(HttpStatus.BAD_REQUEST.toString());
            return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("medioPago")
    public ResponseEntity<?> obtenerMedioPago(){
        ResponseData data = new ResponseData();
        try {
            data.setData(medioPagoService.listarMeedioPago());
            data.setCodeStatus(HttpStatus.OK.value()+"");
            data.setStatus(HttpStatus.OK.toString());
            return new ResponseEntity<>(data, HttpStatus.OK);
        }catch (Exception exception){
            data.setCodeStatus(HttpStatus.BAD_REQUEST.value()+"");
            data.setStatus(HttpStatus.BAD_REQUEST.toString());
            return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);
        }
    }
}
