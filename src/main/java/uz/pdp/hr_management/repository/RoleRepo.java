package uz.pdp.hr_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.hr_management.entity.Role;
import uz.pdp.hr_management.entity.enums.RoleEnum;

import java.util.Optional;

@Repository
public interface RoleRepo extends JpaRepository<Role,Long> {

    Optional<Role> findByName(RoleEnum name);
}
