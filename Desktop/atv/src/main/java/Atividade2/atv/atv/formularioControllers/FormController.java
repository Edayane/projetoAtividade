package Atividade2.atv.atv.formularioControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import Atividade2.atv.atv.formularioRepository.PessoaRepository;
import Atividade2.atv.atv.pessoaEntity.Pessoa;

@Controller
public class FormController {

	@Autowired
	PessoaRepository pessoaRepository;

	@GetMapping("/formulario")
	public ModelAndView form(Pessoa pessoa) {
		ModelAndView modelAndView = new ModelAndView("formulario");
		return modelAndView;
	}

	@GetMapping("/")
	public ModelAndView home() {
		System.out.println("olá");
		ModelAndView modelAndView = new ModelAndView("index");
		return modelAndView;
	}

	@GetMapping("/listaPessoas")
	public ModelAndView listaPessoas() {
		ModelAndView modelAndView = new ModelAndView("listaPessoas");
		List<Pessoa> pessoas = pessoaRepository.findAll();
		modelAndView.addObject("sacolaPessoa", pessoas);
		return modelAndView;
	}

	@PostMapping
	public ModelAndView create(Pessoa pessoa, RedirectAttributes redirectAttributes) {
		ModelAndView modelAndView = new ModelAndView("redirect:/formulario");
		System.out.println(pessoa);
		pessoaRepository.save(pessoa);
		redirectAttributes.addFlashAttribute("home", pessoa.getNome() + " Cadastrada com sucesso");
		return modelAndView;
	}

}
