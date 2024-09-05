package dev.v3ktor.vacancymanagementa.exceptions;

public class UserFoundException extends RuntimeException{
    public UserFoundException() { super("User Existed"); }
    public UserFoundException(String message) { super(message); }
}
