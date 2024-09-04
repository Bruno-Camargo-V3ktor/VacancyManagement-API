package dev.v3ktor.vacancymanagementa.modules.candidate.controllers;

import dev.v3ktor.vacancymanagementa.modules.candidate.CandidateEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequestMapping("/candidate")
public class CandidateController {

    // ATRIBUTOS

    // ENDPOINTS
    @PostMapping
    public void create(@RequestBody CandidateEntity candidate)
    {
        System.out.println( "Candidato" );
        System.out.println( candidate.getEmail() );
    }

    // MÉTODOS

}
