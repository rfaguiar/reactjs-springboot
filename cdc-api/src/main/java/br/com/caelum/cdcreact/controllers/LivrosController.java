package br.com.caelum.cdcreact.controllers;

import br.com.caelum.cdcreact.controllers.forms.LivroForm;
import br.com.caelum.cdcreact.daos.AutorDao;
import br.com.caelum.cdcreact.daos.LivroDao;
import br.com.caelum.cdcreact.models.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
@RequestMapping("/api/livros")
public class LivrosController {
	
	@Autowired
	private LivroDao livroDao;
	@Autowired
	private AutorDao autorDao;

	@RequestMapping(consumes=MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public Iterable<Livro> salva(@Valid @RequestBody LivroForm livroForm) {
		livroDao.save(livroForm.build(autorDao));
		
		return lista();
	}

	@RequestMapping(method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public Iterable<Livro> lista() {
		return livroDao.findAll();
	}	
}
