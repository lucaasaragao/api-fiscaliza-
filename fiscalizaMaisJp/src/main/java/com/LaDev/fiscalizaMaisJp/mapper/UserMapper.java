package com.LaDev.fiscalizaMaisJp.mapper;

import com.LaDev.fiscalizaMaisJp.dto.CreateUserDTO;
import com.LaDev.fiscalizaMaisJp.dto.UserResponseDTO;
import com.LaDev.fiscalizaMaisJp.model.User;

public class UserMapper {

    public static User toEntity(CreateUserDTO dto) {
        if (dto == null) {
            return null;
        }
        User user = new User();
        user.setNome(dto.getNome());
        user.setTelefone(dto.getTelefone());
        user.setSenha(dto.getSenha());
        return user;
    }

    public static UserResponseDTO toDTO(User user) {
        if (user == null) {
            return null;
        }
        UserResponseDTO dto = new UserResponseDTO();
        dto.setId(user.getId());
        dto.setNome(user.getNome());
        dto.setTelefone(user.getTelefone());
        return dto;
    }
}
