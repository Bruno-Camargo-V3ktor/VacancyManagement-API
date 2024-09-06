package dev.v3ktor.vacancymanagementa.modules.company.entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity( name = "Company")
public class CompanyEntity {

    // Atributos
    @Id @GeneratedValue( strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String description;

    @NotBlank @Pattern( regexp = "\\S+", message = "O campo [username] não deve conter espaços")
    private String username;

    @Email( message = "O campo [email] deve conter um e-mail válido")
    private String email;

    @Size(min = 10, max = 100, message = "A senha deve conter de (10) a (100) caractres")
    private String password;
    private String websites;

    @CreationTimestamp
    private LocalDateTime createdAt;

    // Construtores
    public CompanyEntity() {}
    public CompanyEntity(UUID id, String name, String description, String username, String email, String password, String websites, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.username = username;
        this.email = email;
        this.password = password;
        this.websites = websites;
        this.createdAt = createdAt;
    }

    //Getters & Setters
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getWebsites() { return websites; }
    public void setWebsites(String websites) { this.websites = websites; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

}
