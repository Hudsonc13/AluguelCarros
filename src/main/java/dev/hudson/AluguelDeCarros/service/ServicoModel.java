package dev.hudson.AluguelDeCarros.service;


import dev.hudson.AluguelDeCarros.carro.CarroDTO;
import dev.hudson.AluguelDeCarros.carro.CarroModel;
import dev.hudson.AluguelDeCarros.cliente.ClienteDTO;
import dev.hudson.AluguelDeCarros.cliente.ClienteModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Servico")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ServicoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "Clientes")
    private ClienteModel cliente;

    @ManyToOne
    @JoinColumn(name = "Carros")
    private CarroModel carro;

    @Column
    private Date DataInicio;

    @Column
    private Date DataFim;

    @Column
    private int Valor;

}
