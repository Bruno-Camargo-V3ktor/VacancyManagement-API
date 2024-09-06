package dev.v3ktor.vacancymanagementa.modules.company.controllers;

import dev.v3ktor.vacancymanagementa.modules.company.entitys.CompanyEntity;
import dev.v3ktor.vacancymanagementa.modules.company.useCase.CreateCompanyUseCase;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequestMapping("/company")
public class CompanyController {

    // Atributos
    @Autowired private CreateCompanyUseCase createCompanyUseCase;

    // Endpoints
    @PostMapping
    public ResponseEntity<Object> create(@Valid @RequestBody CompanyEntity company)
    {
        try {
            var result = createCompanyUseCase.executer(company);
            return ResponseEntity.status( HttpStatus.CREATED ).body( result );
        }
        catch (Exception e) { return ResponseEntity.badRequest().body( e.getMessage() ); }
    }

}
