package ec.com.empresa.api;
import ec.com.empresa.model.libro.Libro;
import ec.com.empresa.usecase.libro.LibroUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/biblioteca", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {
   private final LibroUseCase libroUseCase;


    @GetMapping(path = "/libros")
    public Libro findById(@RequestParam String id) {
//      return useCase.doAction();
        return libroUseCase.findById(id);

    }
}
