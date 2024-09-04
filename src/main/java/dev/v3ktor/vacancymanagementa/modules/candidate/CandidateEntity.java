package dev.v3ktor.vacancymanagementa.modules.candidate;

import java.util.UUID;

public class CandidateEntity {

    // ATRIBUTOS
    private UUID id;
    private String name;
    private String username;
    private String email;
    private String password;
    private String description;
    private String curriculum;

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
