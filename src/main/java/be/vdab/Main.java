package be.vdab;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import be.vdab.entities.Persoon;
import be.vdab.presentation.PersoonViewer;

public class Main {
	
	
	public static void main(String[] args) {
	
	
		Persoon persoonA = new Persoon(1,"Pieter","Mels",0);
		Persoon persoonB = new Persoon(2,"Johan", "Peeters",2);
		Persoon persoonC = new Persoon(3,"Geert","Roelandts",3);
	
		List<Persoon> personen = new ArrayList<Persoon>();
		
		personen.add(persoonA);
		personen.add(persoonB);
		personen.add(persoonC);
			
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("container.xml")) {
			context.getBean(PersoonViewer.class).afbeelden(personen);
		}
	
	}

}
