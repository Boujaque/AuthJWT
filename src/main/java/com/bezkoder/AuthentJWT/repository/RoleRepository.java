package com.bezkoder.AuthentJWT.repository;

import com.bezkoder.AuthentJWT.models.ERole;
import com.bezkoder.AuthentJWT.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
