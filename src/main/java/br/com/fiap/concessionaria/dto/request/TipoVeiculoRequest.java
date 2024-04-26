package br.com.fiap.concessionaria.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record TipoVeiculoRequest(

        @Size(min = 3, max = 200)
        @NotNull(message = "O nome é campo obrigatório")
        String nome

) {
}
