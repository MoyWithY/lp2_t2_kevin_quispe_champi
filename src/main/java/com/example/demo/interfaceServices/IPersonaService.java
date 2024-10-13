package com.example.demo.interfaceServices;

import java.util.List;
import java.util.Optional;

import com.example.demo.modelo.Persona;

public interface IPersonaService {

	public List<Persona>listar();
	public Optional<Persona>listarId(int id);


	public int Save(Persona p);
}
