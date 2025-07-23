package dev.hudson.AluguelDeCarros.cliente;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO {

    private long id;
    private String nome;
    private String identificacao;

}
