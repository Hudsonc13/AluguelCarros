package dev.hudson.AluguelDeCarros.cliente;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteService {

    ClienteMapper mapper;
    ClienteRepository repository;

    public ClienteService(ClienteMapper mapper, ClienteRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    public ClienteDTO criarCliente(ClienteDTO dto){
        repository.save(mapper.map(dto));
        return dto;

    }

    public List<ClienteDTO> listarClientes(){
        List<ClienteModel> model = repository.findAll();
        return model.stream()
                .map(mapper::map)
                .collect(Collectors.toList());
    }

    public void removerCliente(Long id){

        if(repository.findById(id).isPresent()){
            repository.deleteById(id);
        }

    }

    public ClienteDTO editarCliente(ClienteDTO DTO, Long id){

        if(repository.findById(id).isPresent()){
            ClienteModel model = mapper.map(DTO);
            model.setId(id);
            repository.save(model);

            return mapper.map(model);
        }
        return null;
    }




}
