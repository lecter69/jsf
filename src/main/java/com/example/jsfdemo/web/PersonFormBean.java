package com.example.jsfdemo.web;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.example.jsfdemo.domain.Person;
import com.example.jsfdemo.service.PersonManager;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@SessionScoped
@Named("personBean")
public class PersonFormBean implements Serializable {

	private static final long serialVersionUID = 1L;
     

        
        //private FacesContext context = FacesContext.getCurrentInstance();
        //private Map map = context.getExternalContext().getRequestParameterMap();
        
	private Person person = new Person();
	
	@Inject
	private PersonManager pm;
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	public List<Person> getAllPersons(){
		return pm.getAllPerson();
	}
	
	// Actions
	public String addPerson(){		
		pm.addPerson(person);		
		return "showPersons";
	}
                        
        public String removePerson(Person person){
                pm.removePerson(person);                                 
                return "showPersons";
	}
        
        public String editPerson(Person person){
                setPerson(person);                
		return "edit";                
	}
        
        public String afterEdit(){
                setPerson(new Person());
                return "showPersons";
        }
                
         
}
