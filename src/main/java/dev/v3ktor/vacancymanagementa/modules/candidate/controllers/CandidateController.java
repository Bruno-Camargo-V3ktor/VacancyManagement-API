package dev.v3ktor.vacancymanagementa.modules.candidate.controllers;

import dev.v3ktor.vacancymanagementa.exceptions.UserFoundException;
import dev.v3ktor.vacancymanagementa.modules.candidate.CandidateEntity;
import dev.v3ktor.vacancymanagementa.modules.candidate.CandidateRepository;
import dev.v3ktor.vacancymanagementa.modules.candidate.useCase.CreateCandidateUserCase;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequestMapping("/candidate")
public class CandidateController {

    // ATRIBUTOS
    @Autowired private CreateCandidateUserCase createCandidateUserCase;

    // ENDPOINTS
    @PostMapping
    public ResponseEntity< Object > create(@Valid @RequestBody CandidateEntity candidate )
    {
        try {
            var result = createCandidateUserCase.execute(candidate);
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body( result );
        }
        catch (Exception e) {
            return ResponseEntity.badRequest().body( e.getMessage() );
        }

    }


}
