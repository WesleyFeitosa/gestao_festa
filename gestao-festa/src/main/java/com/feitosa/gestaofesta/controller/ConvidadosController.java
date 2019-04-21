package com.feitosa.gestaofesta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.feitosa.gestaofesta.repository.Convidados;

@Controller
public class ConvidadosController {

	@Autowired
	Convidados convidados;
	
	@GetMapping("/convidados")
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView("listaConvidados");
		mv.addObject("convidados", convidados.findAll());
		return mv;
	}
	
}
