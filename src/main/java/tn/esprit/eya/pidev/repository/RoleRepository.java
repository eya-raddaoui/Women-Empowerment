package tn.esprit.eya.pidev.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import tn.esprit.eya.pidev.entity.Role;
import tn.esprit.eya.pidev.entity.eumeration.ERole;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);

}
