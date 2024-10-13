package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.interfaceServices.IPersonaService;
import com.example.demo.interfaces.IPersona;
import com.example.demo.modelo.Persona;





@org.springframework.stereotype.Service

public class Service implements IPersonaService {

	
	@Autowired
	private IPersona data;
	@Override
	public List<Persona> listar() {

		
		
		// TODO Auto-generated method stub
		
		
		return (List<Persona>)data.findAll(); 

	}
	
	@Override
	public Optional<Persona> listarId(int id) {
	 return data.findById(id);
	}


	@Override
	public int Save(Persona p) {
		// TODO Auto-generated method stub
		int res=0;
		Persona persona =data.save(p);
		
		if(!persona.equals(null)) {
			res=1;
		}
		return res;
	}

}
