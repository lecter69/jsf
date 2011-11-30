package com.example.jsfdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.example.jsfdemo.domain.Person;


@ApplicationScoped
public class PersonManager {
	private List<Person> db = new ArrayList<Person>();
	        
        private int lastid = 0;
        
	public void addPerson(Person person){
		Person newPerson = new Person();
		newPerson.setName(person.getName());
		newPerson.setYob(person.getYob());                
                newPerson.setId(this.lastid);
                this.lastid++;          
		db.add(newPerson);
	}
                
        public void removePerson(Person person){
            db.remove(person);
	}
        
        public void editPerson(Person person){
            //db.update(person);
	}
	
	public List<Person> getAllPerson(){
		return db;
	}


        
       
}
