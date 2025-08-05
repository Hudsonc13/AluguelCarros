package dev.hudson.AluguelDeCarros.aluguel;


import dev.hudson.AluguelDeCarros.carro.CarroService;
import dev.hudson.AluguelDeCarros.cliente.ClienteDTO;
import dev.hudson.AluguelDeCarros.cliente.ClienteModel;
import org.springframework.stereotype.Service;



@Service
public class AluguelService {

    AluguelMapper mapper;
    AluguelRepository repository;
    CarroService carro;

    public AluguelService(AluguelMapper mapper, AluguelRepository repository, CarroService carro) {
        this.mapper = mapper;
        this.repository = repository;
        this.carro = carro;
    }

    public AluguelDTO adcAluguel(AluguelDTO dto){
        if(carro.disponivel(dto.getCarro())){
            AluguelModel model = mapper.map(dto);
            repository.save(model);
            return mapper.map(model);
        }
        return null;

    }

    public void deletarAluguel(Long id){
        repository.deleteById(id);
    }

    public ClienteModel mostrarcliente(Long id){
        if(repository.existsById(id)){
            AluguelModel model = repository.getReferenceById(id);
            mapper.map(model);
            return model.getCliente();
        }
        return null;
    }





}
