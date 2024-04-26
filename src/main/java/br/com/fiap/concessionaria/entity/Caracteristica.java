package br.com.fiap.concessionaria.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "TB_CARACTERISTICA", uniqueConstraints = {
        @UniqueConstraint(name = "UK_CARACTERISTICA_NOME_VEICULO", columnNames = { "NM_CARACTERISTICA", "VEICULO_ID" })
})
public class Caracteristica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CARACTERISTICA")
    private Long id;

    @Column(name = "NM_CARACTERISTICA", length = 30)
    private String nome;

    //20 digitos
    @Column(length = 20)
    private String descricao;


    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(
            name = "ID_VEICULO",
            referencedColumnName = "ID_VEICULO",
            foreignKey = @ForeignKey(
                    name = "FK_CARACTERISTICA_VEICULO"
            )
    )
    private Veiculo veiculo;


}
