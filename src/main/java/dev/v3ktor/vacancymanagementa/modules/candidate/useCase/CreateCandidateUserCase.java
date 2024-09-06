package dev.v3ktor.vacancymanagementa.modules.candidate.useCase;

import dev.v3ktor.vacancymanagementa.exceptions.UserFoundException;
import dev.v3ktor.vacancymanagementa.modules.candidate.CandidateEntity;
import dev.v3ktor.vacancymanagementa.modules.candidate.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CreateCandidateUserCase {

    // Atributos
    @Autowired private CandidateRepository candidateRepository;

    // Métodos
    public CandidateEntity execute( CandidateEntity candidate )
    {
        this.candidateRepository.findByUsernameOrEmail( candidate.getUsername(), candidate.getEmail() )
                .ifPresent( user -> { throw new UserFoundException(); } );

        return this.candidateRepository.save( candidate );
    }

}
