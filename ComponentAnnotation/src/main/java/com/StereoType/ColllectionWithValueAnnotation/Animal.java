package com.StereoType.ColllectionWithValueAnnotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Hello world!
 *
 */
@Component	/* Component annotation allow to IOC container to generate 
			 object of a class without using bean tag in xml file*/
			// Component("obj") This will create the object of class animal (obj) by IOC container
public class Animal 
{	@Value("Cat")	// Value annotation to initialize the value of class variables
    private String name;
	@Value("Meo Meo")
    private String sound;
	
	@Value("#{anilist}") // Use Spring Expression Language to access list from xml file
	private List<String> AnimalList;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	
	public List<String> getAnimalList() {
		return AnimalList;
	}
	public void setAnimalList(List<String> animalList) {
		AnimalList = animalList;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + "\nsound=" + sound + "\nAnimalList=" + AnimalList + "]";
	}
	
	
}
