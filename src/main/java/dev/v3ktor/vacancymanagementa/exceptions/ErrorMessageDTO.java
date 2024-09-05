package dev.v3ktor.vacancymanagementa.exceptions;

public class ErrorMessageDTO {

    //ATRIBUTOS
    private String message;
    private String field;

    //CONSTRUTORES
    public ErrorMessageDTO() {}
    public ErrorMessageDTO(String message, String field) {
        this.field = field;
        this.message = message;
    }


    //GETTERS & SETTERS
    public String getField() { return field; }
    public void setField(String field) { this.field = field; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

}
