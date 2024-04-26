package br.com.fiap.concessionaria.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record FabricanteRequest(

        @Size(min = 3, max = 200, message = "A quantidade de caracteres do nome deve estar entre 3 e 200")
        @NotNull(message = "O nome é campo obrigatório")
        String nome,

        @Size(min = 3, max = 200, message = "A quantidade de caracteres do nome deve estar entre 3 e 200")
        @NotNull(message = "O nome fantasis é campo obrigatório")
        String nomeFantasia

) {
}
