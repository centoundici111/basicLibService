package ec.com.empresa.model.libro;


import lombok.Builder;

@Builder(toBuilder = true)
public record Libro(
        String ISBN,
        String nombre,
        String descripcion) {

}


// Ciudad  codigo valor estado
// Paises codigo valor estado
// Genero codigo valor estado


// Tabla de catalogos 

// COdigo | Nombre_catalogo| ESTADO
// 001        Ciudad           Activo
// 002        PAIS           Activo
// 003        Genero         Activo  


// tabla de valores de los catalogos

// CODIGO| CODIGO_CATALOGO| VALOR| ESTADO
// 123     001              Quito   Activo
// 122    001              GYE      Activo
// 124     002             Ecuador  Activo
// 125     003             DRAMA    Activo
// 126     003             FICCION  Activo

