package com.example.demo.controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.interfaceServices.IPersonaService;
import com.example.demo.modelo.Persona;

public class Controller {

	
	public IPersonaService service;
	
	@GetMapping("/listar")
	public String Listar(Model model ) {
		List<Persona>personas =service.listar();
		model.addAttribute("personas",personas);	
		return "index";
	}
	
	
	@GetMapping("/nuevo")
	public String Agregar (Model model){
		model.addAttribute("personaAgregar", new Persona());
		return "formulario";
	}
	
	@PostMapping ("/save")
	
	public String save (@Validated Persona p, Model model) {
		
		service.Save(p);
		
		return "redirect:/listar";
	}
}
