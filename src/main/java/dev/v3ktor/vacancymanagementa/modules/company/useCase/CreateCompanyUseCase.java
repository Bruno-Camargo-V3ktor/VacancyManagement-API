package dev.v3ktor.vacancymanagementa.modules.company.useCase;

import dev.v3ktor.vacancymanagementa.exceptions.UserFoundException;
import dev.v3ktor.vacancymanagementa.modules.company.entitys.CompanyEntity;
import dev.v3ktor.vacancymanagementa.modules.company.repositorys.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateCompanyUseCase {

    // Atributos
    @Autowired private CompanyRepository companyRepository;

    // Métodos
    public void executer(CompanyEntity company)
    {
        this.companyRepository.findByUsernameOrEmail( company.getUsername(), company.getEmail() )
                .ifPresent( (user) -> { throw new UserFoundException(); } );

        this.companyRepository.save( company );
    }

}
