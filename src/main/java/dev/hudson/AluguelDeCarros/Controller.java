package dev.hudson.AluguelDeCarros;


import dev.hudson.AluguelDeCarros.aluguel.AluguelDTO;
import dev.hudson.AluguelDeCarros.aluguel.AluguelService;
import dev.hudson.AluguelDeCarros.carro.CarroDTO;
import dev.hudson.AluguelDeCarros.carro.CarroService;
import dev.hudson.AluguelDeCarros.cliente.ClienteDTO;
import dev.hudson.AluguelDeCarros.cliente.ClienteModel;
import dev.hudson.AluguelDeCarros.cliente.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Admin")
public class Controller {

    CarroService carro;
    ClienteService cliente;
    AluguelService aluguel;

    public Controller(CarroService carro, ClienteService cliente, AluguelService aluguel) {
        this.carro = carro;
        this.cliente = cliente;
        this.aluguel = aluguel;
    }

    @PostMapping ("/adcCarro")
    public CarroDTO adcCarro(@RequestBody CarroDTO dto){
        return carro.criarCarro(dto);
    }

    @PostMapping("/adcCliente")
    public ClienteDTO adcCliente(@RequestBody ClienteDTO dto){
        return cliente.criarCliente(dto);
    }

    @PostMapping("/adcAluguel")
    public AluguelDTO adcAluguelDTO(@RequestBody AluguelDTO dto){
        return aluguel.adcAluguel(dto);
    }


    @GetMapping("/mostrarCliente/{id}")
    public ClienteModel mostrarc(@PathVariable Long id){
        return aluguel.mostrarcliente(id);
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
