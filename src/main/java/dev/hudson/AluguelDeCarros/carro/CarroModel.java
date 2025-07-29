package dev.hudson.AluguelDeCarros.carro;


import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.hudson.AluguelDeCarros.cliente.ClienteModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "Carros")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CarroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Marca")
    private String marca;

    @Column(name = "Modelo")
    private String modelo;

    //Valor total do carro
    @Column(name = "Valor")
    private int valor;

    @Column(name = "Ano")
    private int Ano;

    @Column(unique = true, name = "Placa")
    private String placa;

    //Valor do aluguel de um dia
    @Column(name = "diaria")
    private int diaria;

    @Column(name = "disponivel")
    private boolean disponivel;

    //lombok não adicionou este get automaticamente, tive que adicionar manualmente
    public boolean getDisponivel(){
        return disponivel;
    }

}
