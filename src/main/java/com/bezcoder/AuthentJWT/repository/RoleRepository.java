package com.bezcoder.AuthentJWT.repository;

import com.bezcoder.AuthentJWT.models.ERole;
import com.bezcoder.AuthentJWT.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
