package br.com.fiap.concessionaria.dto.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.time.Year;

import java.time.Year;

public record VeiculoRequest(

        @Positive(message = "O Id deve ser um número positivo")
        @NotNull(message = "O id é obrigatório")
        Double preco,

        @Size(min = 3, max = 2500)
        @NotNull(message = "O modelo é campo obrigatório")
        String modelo,

        @NotNull(message = "O ano de fabricação é campo obrigatório")
        Year anoDeFabricacao,

        @NotNull(message = "O id é obrigatório")
        @Size(min = 3, max = 200)
        String nome,

        @Valid
        @NotNull(message = "O tipo é campo obrigatório")
        AbstractRequest tipo,

        @Valid
        @NotNull(message = "O fabricante é campo obrigatório")
        AbstractRequest fabricante,

        @NotNull(message = "A cor é campo obrigatório")
        @Size(min = 3, max = 200)
        String cor,

        @Size(min = 3, max = 200)
        @NotNull(message = "A palavra de efeito é campo obrigatório")
        String palavraDeEfeito,

        @Positive(message = "As cilindradas deve ser um número positivo")
        @NotNull(message = "As cilindradas  é obrigatório")
        Short cilindradas

) {
}
