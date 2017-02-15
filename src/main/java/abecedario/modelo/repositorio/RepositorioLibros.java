package abecedario.modelo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import abecedario.modelo.entidades.Libro;

public interface RepositorioLibros extends JpaRepository<Libro, Long>{

}
