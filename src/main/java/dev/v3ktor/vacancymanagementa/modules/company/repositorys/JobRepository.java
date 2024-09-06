package dev.v3ktor.vacancymanagementa.modules.company.repositorys;

import dev.v3ktor.vacancymanagementa.modules.company.entitys.JobEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JobRepository extends JpaRepository<JobEntity, UUID> {
}
