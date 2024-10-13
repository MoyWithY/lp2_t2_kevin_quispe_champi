package com.example.demo.modelo;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity 

@Table(name ="persona")
public class Persona {

	
	@Id
	@GeneratedValue (strategy  = GenerationType.IDENTITY)
	private int idperson ;
	private String fistname;
	private String lastname ;
	private Date datebirth;
	
	
	public Persona() {

		
		

	}


	public Persona(int idperson, String fistname, String lastname, Date datebirth) {
		super();
		this.idperson = idperson;
		this.fistname = fistname;
		this.lastname = lastname;
		this.datebirth = datebirth;
	}


	public int getIdperson() {
		return idperson;
	}


	public void setIdperson(int idperson) {
		this.idperson = idperson;
	}


	public String getFistname() {
		return fistname;
	}


	public void setFistname(String fistname) {
		this.fistname = fistname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public Date getDatebirth() {
		return datebirth;
	}


	public void setDatebirth(Date datebirth) {
		this.datebirth = datebirth;
	}
	
	
	
}
