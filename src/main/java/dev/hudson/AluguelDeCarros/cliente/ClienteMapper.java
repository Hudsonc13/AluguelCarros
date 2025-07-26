package dev.hudson.AluguelDeCarros.cliente;


import org.springframework.stereotype.Component;

@Component
public class ClienteMapper {

    public ClienteModel map(ClienteDTO DTO){
        ClienteModel model = new ClienteModel();

        model.setId(DTO.getId());
        model.setIdentificacao(DTO.getIdentificacao());
        model.setNome(DTO.getNome());

        return model;
    }

    public ClienteDTO map(ClienteModel Model){
        ClienteDTO dto = new ClienteDTO();

        dto.setId(Model.getId());
        dto.setIdentificacao(Model.getIdentificacao());
        dto.setNome(Model.getNome());

        return dto;
    }
}
