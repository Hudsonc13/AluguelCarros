package dev.hudson.AluguelDeCarros;


import dev.hudson.AluguelDeCarros.carro.CarroDTO;
import dev.hudson.AluguelDeCarros.carro.CarroService;
import dev.hudson.AluguelDeCarros.cliente.ClienteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Admin")
public class Controller {

    CarroService carro;
    ClienteService cliente;

    public Controller(CarroService carro, ClienteService cliente) {
        this.carro = carro;
        this.cliente = cliente;
    }

    @PutMapping("/adcCarro")
    public CarroDTO adcCarro(CarroDTO dto){
        return carro.criarCarro(dto);
    }

    @GetMapping("mostrarCarros")
    public List<CarroDTO> mostrarCarros(){
        return carro.listarCarros();
    }



}
