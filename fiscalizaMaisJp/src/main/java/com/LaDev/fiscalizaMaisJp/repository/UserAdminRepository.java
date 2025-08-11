package com.LaDev.fiscalizaMaisJp.repository;

import com.LaDev.fiscalizaMaisJp.model.UserAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserAdminRepository extends JpaRepository<UserAdmin, UUID> {
}
