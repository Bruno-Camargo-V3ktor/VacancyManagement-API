package dev.v3ktor.vacancymanagementa.modules.candidate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "candidate")
public class CandidateEntity {

    // ATRIBUTOS
    @Id @GeneratedValue( strategy = GenerationType.UUID )
    private UUID id;
    private String name;

    @Pattern(regexp = "\\S+", message = "O campo [username] não pode conter espaços")
    private String username;

    @Email(message = "O campo deve conter um e-mail válido")
    private String email;

    @Length(min = 10, max = 100)
    private String password;

    private String description;
    private String curriculum;

    @CreationTimestamp
    private LocalDateTime createdAt;

    // CONTRUTORES
    public CandidateEntity() {}
    public CandidateEntity(UUID id, String name, String username, String email, String password, String description, String curriculum) {
        this.curriculum = curriculum;
        this.description = description;
        this.email = email;
        this.id = id;
        this.name = name;
        this.password = password;
        this.username = username;
    }

    // GETTERS & SETTERS
    public String getCurriculum() { return curriculum; }
    public void setCurriculum(String curriculum) { this.curriculum = curriculum; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }



}
