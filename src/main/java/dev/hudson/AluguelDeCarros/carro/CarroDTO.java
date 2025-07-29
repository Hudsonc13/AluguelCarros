package dev.hudson.AluguelDeCarros.carro;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarroDTO {

    private Long Id;
    private String marca;
    private String modelo;
    private int valor;
    private int Ano;
    private String placa;
    private int diaria;
    private boolean disponivel;
    // adcicionar boolean disponivel


    //lombok não adicionou este get automaticamente, tive que adicionar manualmente
    public boolean getDisponivel(){
        return disponivel;
    }

}
