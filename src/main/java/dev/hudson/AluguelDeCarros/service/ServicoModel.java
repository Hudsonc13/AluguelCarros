package dev.hudson.AluguelDeCarros.service;


import dev.hudson.AluguelDeCarros.carro.CarroModel;
import dev.hudson.AluguelDeCarros.cliente.ClienteModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "Servico")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ServicoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne(mappedBy = "Clientes")
    private ClienteModel cliente;

    @OneToOne(mappedBy = "Carros")
    private CarroModel carro;

    @Column
    private Date DataInicio;

    @Column
    private Date DataFim;

    @Column
    private int Valor;

}
