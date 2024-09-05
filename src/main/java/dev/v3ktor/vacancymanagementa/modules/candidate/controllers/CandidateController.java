package dev.v3ktor.vacancymanagementa.modules.candidate.controllers;

import dev.v3ktor.vacancymanagementa.modules.candidate.CandidateEntity;
import dev.v3ktor.vacancymanagementa.modules.candidate.CandidateRepository;
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
    @Autowired private CandidateRepository candidateRepository;

    // ENDPOINTS
    @PostMapping
    public ResponseEntity< CandidateEntity > create(@Valid @RequestBody CandidateEntity candidate )
    {
        //System.out.println( "Candidato" );
        //System.out.println( candidate.getEmail() );

        return ResponseEntity.status(HttpStatus.CREATED).body( this.candidateRepository.save( candidate ) );
    }

    // MÉTODOS


}
