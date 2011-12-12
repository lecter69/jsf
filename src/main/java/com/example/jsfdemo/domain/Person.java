package com.example.jsfdemo.domain;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.validation.constraints.Min;

public class Person {
	
	private String name = "unknown";
	private int yob = 1900;
        private int id = 0;
        
        
        
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Min(value=1900)
	public int getYob() {
		return yob;
	}
	public void setYob(int yob) {
		this.yob = yob;
	}
        
        public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
