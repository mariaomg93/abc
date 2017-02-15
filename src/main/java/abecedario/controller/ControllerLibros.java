package abecedario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import abecedario.modelo.entidades.Libro;
import abecedario.modelo.repositorio.RepositorioLibros;



@Controller
@RequestMapping("/libros")
public class ControllerLibros {

	@Autowired
	private RepositorioLibros repoli;
	
	@RequestMapping(method=RequestMethod.GET)
	public String listar(Model model)
	{
		Iterable<Libro>lista =  repoli.findAll();
		model.addAttribute("titulo", "Listado de libros");
		model.addAttribute("libros", lista);
		
		return "pages/libros";
	}




}
