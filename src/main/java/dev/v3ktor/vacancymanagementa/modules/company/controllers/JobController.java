package dev.v3ktor.vacancymanagementa.modules.company.controllers;

import dev.v3ktor.vacancymanagementa.modules.company.entitys.JobEntity;
import dev.v3ktor.vacancymanagementa.modules.company.useCase.CreateJobUseCase;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequestMapping("/job")
public class JobController {

    // Atributos
    @Autowired private CreateJobUseCase createJobUseCase;

    // Endpoints
    @PostMapping
    public ResponseEntity< Object > create( @Valid @RequestBody JobEntity  job)
    {
        return ResponseEntity.status(HttpStatus.CREATED ).body( createJobUseCase.execute(job) );
    }

}
