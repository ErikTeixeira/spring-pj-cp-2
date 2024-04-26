package br.com.fiap.concessionaria.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Positive;

public record AcessorioRequest(

        @Size(min = 3, max = 200, message = "A quantidade de caracteres do nome deve estar entre 3 e 200")
        @NotNull(message = "O nome é campo obrigatório")
        String nome,

        @Positive(message = "O preço precisa ser positivo")
        @NotNull(message = "O preço é campo obrigatório")
        Double preco
) {

}
