package com.LaDev.fiscalizaMaisJp.mapper;

import com.LaDev.fiscalizaMaisJp.dto.CreateInfractionDTO;
import com.LaDev.fiscalizaMaisJp.dto.InfractionResponseDTO;
import com.LaDev.fiscalizaMaisJp.model.Infraction;
import com.LaDev.fiscalizaMaisJp.model.OtherPublic;
import com.LaDev.fiscalizaMaisJp.model.User;

import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;

public class InfractionMapper {
    // Converte CreateInfracaoDTO para Infracao
    public static Infraction toEntity(CreateInfractionDTO dto, User usuario, OtherPublic organizacao) {
        if (dto == null) {
            return null;
        }

        Infraction infracao = new Infraction();

        try {
            infracao.setDataHora(LocalDateTime.parse(dto.getDataHora())); // espera ISO 8601
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("DataHora inválida, use formato ISO 8601: yyyy-MM-ddTHH:mm:ss");
        }

        infracao.setLocalizacao(dto.getLocalizacao());
        // foto deve ser convertida fora deste metodo, pois MultipartFile não pertence ao model.
        infracao.setDescricao(dto.getDescricao());
        infracao.setUsuario(usuario);
        infracao.setOrganizacao(organizacao);

        return infracao;
    }

    // Converte Infracao para InfracaoResponseDTO
    public static InfractionResponseDTO toDTO(Infraction infracao) {
        if (infracao == null) {
            return null;
        }

        InfractionResponseDTO dto = new InfractionResponseDTO();

        dto.setId(infracao.getId());
        dto.setDataHora(infracao.getDataHora());
        dto.setLocalizacao(infracao.getLocalizacao());
        dto.setDescricao(infracao.getDescricao());

        if (infracao.getUsuario() != null) {
            dto.setUsuarioId(infracao.getUsuario().getId());
            dto.setUsuarioNome(infracao.getUsuario().getNome());
        }

        if (infracao.getOrganizacao() != null) {
            dto.setOrganizacaoId(infracao.getOrganizacao().getId());
            dto.setOrganizacaoNome(infracao.getOrganizacao().getNome());
        }

        return dto;
    }
}
