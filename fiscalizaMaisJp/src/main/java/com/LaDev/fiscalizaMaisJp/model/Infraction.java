package com.LaDev.fiscalizaMaisJp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "infracoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Infraction {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private LocalDateTime dataHora;

    @Column(nullable = false)
    private String localizacao;

    @Lob
    private byte[] foto;

    private String descricao;

    @ManyToOne(optional = false)
    @JoinColumn(name = "usuario_id")
    private User usuario;

    @ManyToOne(optional = false)
    @JoinColumn(name = "organizacao_id")
    private OtherPublic organizacao;
}
