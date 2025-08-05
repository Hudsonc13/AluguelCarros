package dev.hudson.AluguelDeCarros.aluguel;


import dev.hudson.AluguelDeCarros.carro.CarroModel;
import dev.hudson.AluguelDeCarros.cliente.ClienteModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Entity
@Table(name = "Servico")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AluguelModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "Clientes")
    private ClienteModel cliente;

    @ManyToOne
    @JoinColumn(name = "Carros")
    private CarroModel carro;

    @Column
    private String DataInicio;

    @Column
    private String DataFim;

    @Column
    private int Valor;

}
