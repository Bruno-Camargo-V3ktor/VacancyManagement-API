package dev.v3ktor.vacancymanagementa.modules.company.useCase;

import dev.v3ktor.vacancymanagementa.modules.company.entitys.JobEntity;
import dev.v3ktor.vacancymanagementa.modules.company.repositorys.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateJobUseCase {

    // Atributos
    @Autowired private JobRepository jobRepository;

    // Métodos
    public JobEntity execute(JobEntity job)
    {
        return jobRepository.save( job );
    }

}
