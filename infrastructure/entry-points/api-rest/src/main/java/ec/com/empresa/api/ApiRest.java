package ec.com.empresa.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import ec.com.empresa.model.exceptions.BookException;
import ec.com.empresa.model.libro.Libro;
import ec.com.empresa.usecase.libro.LibroUseCase;
import lombok.AllArgsConstructor;

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

	@PostMapping(path = "/libros")
	@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Required data is missing.")
	public Libro createBook(@RequestBody Libro libro) {
//      return useCase.doAction();
		try {
			return libroUseCase.createBook(libro);
		} catch (BookException be) {
			throw new RuntimeException();
		}

	}
}
