package ec.com.empresa.usecase.libro;

import java.util.List;
import java.util.Optional;

import ec.com.empresa.model.exceptions.ValidationException;
import ec.com.empresa.model.libro.Libro;
import ec.com.empresa.model.libro.gateways.LibroRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LibroUseCase {
	private final LibroRepository libroRepository;

	private List<Libro> findByName(String name) {
		return libroRepository.findByName(name);
	}

	public final Optional<Libro> findById(String id) {
		return Optional.ofNullable(libroRepository.findById(id));
	}

	public final Libro createBook(Libro libro) throws ValidationException {

		if ((libro.ISBN() == null || libro.ISBN().isEmpty())
				|| (libro.nombreDelLibro() == null || libro.nombreDelLibro().isEmpty())) {
			throw new ValidationException("Required data is missing.");
		}

		return libroRepository.createBook(libro);
	}
}
