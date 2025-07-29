package dev.hudson.AluguelDeCarros;


import dev.hudson.AluguelDeCarros.carro.CarroDTO;
import dev.hudson.AluguelDeCarros.carro.CarroService;
import dev.hudson.AluguelDeCarros.cliente.ClienteDTO;
import dev.hudson.AluguelDeCarros.cliente.ClienteService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping ("/adcCarro")
    public CarroDTO adcCarro(@RequestBody CarroDTO dto){
        return carro.criarCarro(dto);
    }

    @PostMapping("/adcCliente")
    public ClienteDTO adcCliente(@RequestBody ClienteDTO dto){
        return cliente.criarCliente(dto);
    }

    @GetMapping("/mostrarCarros")
    public List<CarroDTO> mostrarCarros(){

        return carro.listarCarros();
    }

    @GetMapping("/mostrarClientes")
    public List<ClienteDTO> mostrarClientes(){

        return cliente.listarClientes();
    }

    @DeleteMapping("deletarCliente/{id}")
    public void deletarCliente(@PathVariable Long id){
        cliente.removerCliente(id);
    }

    @DeleteMapping("deletarCarro/{id}")
    public void deletarCarro(@PathVariable Long id) {
        carro.deletarCarro(id);
    }




}
