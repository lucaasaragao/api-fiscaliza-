package com.LaDev.fiscalizaMaisJp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users_admin")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAdmin extends User {

}
