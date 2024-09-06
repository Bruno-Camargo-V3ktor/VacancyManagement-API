package dev.v3ktor.vacancymanagementa.modules.company.repositorys;

import dev.v3ktor.vacancymanagementa.modules.company.entitys.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface CompanyRepository extends JpaRepository<CompanyEntity, UUID> {

    Optional<CompanyEntity> findByUsernameOrEmail(String username, String email);

}
