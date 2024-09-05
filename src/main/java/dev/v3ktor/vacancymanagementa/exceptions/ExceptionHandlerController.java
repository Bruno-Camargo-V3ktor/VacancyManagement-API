package dev.v3ktor.vacancymanagementa.exceptions;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class ExceptionHandlerController {

    // Atributos
    private MessageSource source;

    // Construtores
    public ExceptionHandlerController(MessageSource source) {
        this.source = source;
    }

    // Handlers
    @ExceptionHandler( MethodArgumentNotValidException.class )
    public ResponseEntity< List<ErrorMessageDTO> > handleMethodArgumentNotValidException(MethodArgumentNotValidException ex, WebRequest request)
    {
        List<ErrorMessageDTO> dto = new ArrayList<>();

        ex.getBindingResult().getFieldErrors().forEach( error -> {
            String message =  source.getMessage( error, LocaleContextHolder.getLocale());
            dto.add( new ErrorMessageDTO(message, error.getField()) );
        } );

        return ResponseEntity.badRequest().body( dto );
    }

}
