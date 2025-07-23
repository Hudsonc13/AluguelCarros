package dev.hudson.AluguelDeCarros.service;

import dev.hudson.AluguelDeCarros.carro.CarroModel;
import dev.hudson.AluguelDeCarros.cliente.ClienteModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServicoDTO {


    private ClienteModel cliente;
    private CarroModel carro;
    private Date DataInicio;
    private Date DataFim;
    private int Valor;


}
