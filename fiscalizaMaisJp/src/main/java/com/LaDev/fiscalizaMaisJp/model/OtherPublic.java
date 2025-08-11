package com.LaDev.fiscalizaMaisJp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "organizacoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OtherPublic {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false, unique = true)
    private String nome;

    @Column(nullable = false)
    private String emailContato;

}
