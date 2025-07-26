package dev.hudson.AluguelDeCarros.carro;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarroService {

    CarroMapper mapper;
    CarroRepository repository;

    public CarroService(CarroMapper mapper, CarroRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    public List<CarroDTO> listarCarros(){
        List<CarroModel> model = repository.findAll();
        return model.stream()
                .map(mapper::map)
                .collect(Collectors.toList());

    }

    public CarroDTO criarCarro(CarroDTO DTO){
        repository.save(mapper.map(DTO));
        return DTO;
    }

    public void deletarCarro(Long id){
        if(repository.findById(id).isPresent()){
            repository.deleteById(id);
        }
    }

    public CarroDTO editarCarro(CarroDTO DTO, Long id){

        if(repository.findById(id).isPresent()){
            CarroModel model = mapper.map(DTO);
            repository.save(model);
            model.setId(id);
            return mapper.map(model);

        }
        return null;
    }


}
