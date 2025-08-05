package dev.hudson.AluguelDeCarros.aluguel;

import dev.hudson.AluguelDeCarros.carro.CarroModel;
import dev.hudson.AluguelDeCarros.cliente.ClienteModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AluguelDTO {

    private Long id;
    private ClienteModel cliente;
    private CarroModel carro;
    private String DataInicio;
    private String DataFim;
    private int Valor;


}
