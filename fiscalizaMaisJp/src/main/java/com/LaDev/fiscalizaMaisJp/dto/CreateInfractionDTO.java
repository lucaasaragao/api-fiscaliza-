package com.LaDev.fiscalizaMaisJp.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateInfractionDTO {


    @NotNull(message = "Data e hora são obrigatórias")
    private String dataHora; // idealmente ISO 8601 (ex: 2025-08-11T10:30:00)

    @NotBlank(message = "Localização é obrigatória")
    private String localizacao;

    @NotNull(message = "Foto é obrigatória")
    private MultipartFile foto;

    private String descricao;

    @NotNull(message = "ID do usuário é obrigatório")
    private UUID usuarioId;

    @NotNull(message = "ID da organização é obrigatório")
    private UUID organizacaoId;
}
