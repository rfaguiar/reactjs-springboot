package br.com.caelum.cdcreact.daos;

import br.com.caelum.cdcreact.models.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorDao extends JpaRepository<Autor, Integer> {

}
