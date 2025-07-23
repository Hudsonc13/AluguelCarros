package dev.hudson.AluguelDeCarros.cliente;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "Clientes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String nome;

    //CPF ou CNPJ
    @Column(unique = true, name = "CPF/CNPJ")
    private String identificacao;

}
