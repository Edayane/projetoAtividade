package Atividade2.atv.atv.formularioControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import Atividade2.atv.atv.formularioRepository.CarroRepository;
import Atividade2.atv.atv.pessoaEntity.Carro;

@Controller
public class CarroController {

	@Autowired
	CarroRepository carroRepository;
	
	@GetMapping("/carro")
	public ModelAndView carro (Carro carro) {
		ModelAndView modelAndView = new ModelAndView("carro");
		return modelAndView;
		
	}
	
	@PostMapping ("/carroPost")
	public void createCarro (Carro carro) {
		System.out.println(carro);
		carroRepository.save(carro);
	}

	
}
