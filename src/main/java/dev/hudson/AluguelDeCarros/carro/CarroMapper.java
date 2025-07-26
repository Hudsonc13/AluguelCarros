package dev.hudson.AluguelDeCarros.carro;


import org.springframework.stereotype.Component;

@Component
public class CarroMapper {

    public CarroModel map(CarroDTO DTO ){
        CarroModel Model = new CarroModel();

        Model.setId(DTO.getId());
        Model.setMarca(DTO.getMarca());
        Model.setModelo(DTO.getModelo());
        Model.setAno(DTO.getAno());
        Model.setValor(DTO.getValor());
        Model.setPlaca(DTO.getPlaca());
        Model.setDiaria(DTO.getDiaria());

        return Model;
    }

    public CarroDTO map(CarroModel Model ){
        CarroDTO DTO = new CarroDTO();

        DTO.setId(Model.getId());
        DTO.setMarca(Model.getMarca());
        DTO.setModelo(Model.getModelo());
        DTO.setAno(Model.getAno());
        DTO.setValor(Model.getValor());
        DTO.setPlaca(Model.getPlaca());
        DTO.setDiaria(Model.getDiaria());

        return DTO;
    }

}
