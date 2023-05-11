package ec.com.empresa.api;

import ec.com.empresa.model.exceptions.EntityNotFoundException;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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
		return libroUseCase.findById(id).orElseThrow(() -> new EntityNotFoundException("Book not found."));

	}

	@PostMapping(path = "/libros")
	public Libro createBook(@RequestBody Libro libro) {
			return libroUseCase.createBook(libro);
	}
}
