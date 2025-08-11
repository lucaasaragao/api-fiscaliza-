package com.LaDev.fiscalizaMaisJp.mapper;

import com.LaDev.fiscalizaMaisJp.dto.CreateOtherPublicDTO;
import com.LaDev.fiscalizaMaisJp.dto.OtherPublicResponseDTO;
import com.LaDev.fiscalizaMaisJp.model.OtherPublic;

public class OtherPublicMapper {
    public static OtherPublic toEntity(CreateOtherPublicDTO dto) {
        if (dto == null) {
            return null;
        }
        OtherPublic org = new OtherPublic();
        org.setNome(dto.getNome());
        org.setEmailContato(dto.getEmailContato());
        return org;
    }

    public static OtherPublicResponseDTO toDTO(OtherPublic org) {
        if (org == null) {
            return null;
        }
        OtherPublicResponseDTO dto = new OtherPublicResponseDTO();
        dto.setId(org.getId());
        dto.setNome(org.getNome());
        dto.setEmailContato(org.getEmailContato());
        return dto;
    }
}
