package com.LaDev.fiscalizaMaisJp.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InfractionResponseDTO {

    private UUID id;
    private LocalDateTime dataHora;
    private String localizacao;
    private String descricao;
    private UUID usuarioId;
    private String usuarioNome;
    private UUID organizacaoId;
    private String organizacaoNome;
}
