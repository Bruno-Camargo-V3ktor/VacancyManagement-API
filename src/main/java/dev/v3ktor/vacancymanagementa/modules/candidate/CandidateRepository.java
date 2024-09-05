package dev.v3ktor.vacancymanagementa.modules.candidate;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface CandidateRepository extends JpaRepository<CandidateEntity, UUID> {

    Optional< CandidateEntity > findByUsernameOrEmail(String username, String email );
}