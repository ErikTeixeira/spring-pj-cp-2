package br.com.fiap.concessionaria.dto.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record CaracteristicasRequest(

        @Valid
        @NotNull(message = "Veiculo e obrigatório")
        AbstractRequest veiculo,

        @NotNull(message = "Nome e obrigatório")
        String nome,

        @NotNull(message = "Descricao e obrigatório")
        String descricao

) {
}
