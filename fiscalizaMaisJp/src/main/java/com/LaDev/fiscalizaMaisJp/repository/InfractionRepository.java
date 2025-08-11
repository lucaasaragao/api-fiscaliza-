package com.LaDev.fiscalizaMaisJp.repository;

import com.LaDev.fiscalizaMaisJp.model.Infraction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface InfractionRepository extends JpaRepository<Infraction, UUID> {

}
