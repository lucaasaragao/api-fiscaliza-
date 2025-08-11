package com.LaDev.fiscalizaMaisJp.repository;

import com.LaDev.fiscalizaMaisJp.model.OtherPublic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface OtherPublicRepository extends JpaRepository<OtherPublic, UUID> {
    Optional<OtherPublic> findByNome(String nome);
}
