package dev.v3ktor.vacancymanagementa.modules.company.entitys;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity( name = "job")
public class JobEntity {

    // Atributos
    @Id @GeneratedValue( strategy = GenerationType.UUID)
    private UUID id;
    private String description;
    private String benefits;
    @NotBlank(message = "Esse campo é obrigatorio") private String level;

    @ManyToOne(fetch = FetchType.LAZY) @JoinColumn( name = "company_id", nullable = false)
    private CompanyEntity company;

    @CreationTimestamp
    private LocalDateTime createdAt;

    // Construtores
    public JobEntity() { }
    public JobEntity(UUID id, String description, String benefits, String level, CompanyEntity company, LocalDateTime createdAt) {
        this.id = id;
        this.description = description;
        this.benefits = benefits;
        this.level = level;
        this.company = company;
        this.createdAt = createdAt;
    }

    // Getters & Setters
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getBenefits() { return benefits; }
    public void setBenefits(String benefits) { this.benefits = benefits; }

    public String getLevel() { return level; }
    public void setLevel(String level) { this.level = level; }

    public CompanyEntity getCompany() { return company; }
    public void setCompany(@NotNull CompanyEntity company) { this.company = company; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}
