package ec.com.empresa.api;

import ec.com.empresa.model.exceptions.EntityNotFoundException;
import ec.com.empresa.model.exceptions.ValidationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class BookAdvice {

    @ResponseBody
    @ExceptionHandler(ValidationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    String bookAdviceHandler(ValidationException ex) {
        return ex.getMessage();
    }

    @ResponseBody
    @ExceptionHandler(EntityNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String entityNotFoundHandler(EntityNotFoundException ex) {
        return ex.getMessage();
    }

}
