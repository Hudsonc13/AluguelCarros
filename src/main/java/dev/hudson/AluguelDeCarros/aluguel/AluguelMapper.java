package dev.hudson.AluguelDeCarros.aluguel;

import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AluguelMapper {

    public AluguelModel map(AluguelDTO dto){
        AluguelModel model = new AluguelModel();

        model.setCarro(dto.getCarro());
        model.setCliente(dto.getCliente());
        model.setDataFim(dto.getDataFim());
        model.setDataInicio(dto.getDataInicio());
        model.setId(dto.getId());
        model.setValor(dto.getValor());

        return model;
    }

    public AluguelDTO map(AluguelModel model){
        AluguelDTO dto = new AluguelDTO();

        dto.setCarro(model.getCarro());
        dto.setCliente(model.getCliente());
        dto.setDataFim(model.getDataFim());
        dto.setDataInicio(model.getDataInicio());
        dto.setId(model.getId());
        dto.setValor(model.getValor());

        return dto;
    }


}
