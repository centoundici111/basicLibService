package ec.com.empresa.usecase.libro;

import java.util.List;

import ec.com.empresa.model.exceptions.BookException;
import ec.com.empresa.model.libro.Libro;
import ec.com.empresa.model.libro.gateways.LibroRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LibroUseCase {
	private final LibroRepository libroRepository;

	private final List<Libro> findByName(String name) {
		return libroRepository.findByName(name);
	}

	public final Libro findById(String id) {
		return libroRepository.findById(id);
	}

	public final Libro createBook(Libro libro) throws BookException {

		if ((libro.ISBN() == null || libro.ISBN().isEmpty())
				|| (libro.nombreDelLibro() == null || libro.nombreDelLibro().isEmpty())) {
			throw new BookException("Required data is missing.");
		}

		return libroRepository.createBook(libro);
	}
}
