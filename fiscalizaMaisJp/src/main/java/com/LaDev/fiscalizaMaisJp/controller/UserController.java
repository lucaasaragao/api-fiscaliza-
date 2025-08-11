package com.LaDev.fiscalizaMaisJp.controller;

import com.LaDev.fiscalizaMaisJp.dto.CreateUserDTO;
import com.LaDev.fiscalizaMaisJp.dto.UserResponseDTO;
import com.LaDev.fiscalizaMaisJp.mapper.UserMapper;
import com.LaDev.fiscalizaMaisJp.model.User;
import com.LaDev.fiscalizaMaisJp.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Criar usuário
    @PostMapping
    public ResponseEntity<UserResponseDTO> createUser(@Valid @RequestBody CreateUserDTO dto) {
        User user = UserMapper.toEntity(dto);
        User saved = userService.save(user);
        return new ResponseEntity<>(UserMapper.toDTO(saved), HttpStatus.CREATED);
    }

    // Listar todos os usuários
    @GetMapping
    public ResponseEntity<List<UserResponseDTO>> getAllUsers() {
        List<User> users = userService.findAll();
        List<UserResponseDTO> dtos = users.stream()
                .map(UserMapper::toDTO)
                .collect(Collectors.toList());
        return ResponseEntity.ok(dtos);
    }

    // Buscar usuário por ID
    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDTO> getUserById(@PathVariable UUID id) {
        User user = userService.findById(id);
        return ResponseEntity.ok(UserMapper.toDTO(user));
    }

    // Atualizar usuário (exemplo básico)
    @PutMapping("/{id}")
    public ResponseEntity<UserResponseDTO> updateUser(@PathVariable UUID id,
                                                      @Valid @RequestBody CreateUserDTO dto) {
        User user = UserMapper.toEntity(dto);
        User updated = userService.update(id, user);
        return ResponseEntity.ok(UserMapper.toDTO(updated));
    }

    // Deletar usuário
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable UUID id) {
        userService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
