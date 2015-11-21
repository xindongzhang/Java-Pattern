package com.xiaohua.xindongzhang.Filter;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<>();
	    persons.add(new Person("Robert","Male", "Single"));
	    persons.add(new Person("John","Male", "Married"));
	    persons.add(new Person("Laura","Female", "Married"));
	    persons.add(new Person("Diana","Female", "Single"));
	    persons.add(new Person("Mike","Male", "Single"));
	    persons.add(new Person("Bobby","Male", "Single"));
	    
	    Criteria male = new CriteriaMale();
	    Criteria female = new CriteriaFemale();
	    Criteria single = new CriteriaSingle();
	    Criteria singleMale = new AndCriteria(single, male);
	    Criteria singleOrFemale = new OrCriteria(single, female);
	    
	    System.out.println("male");
	    printPersons(male.meetCriterial(persons));
	    
	    System.out.println("female");
	    printPersons(female.meetCriterial(persons));
	    
	    System.out.println("single male");
	    printPersons(singleMale.meetCriterial(persons));
	    
	    System.out.println("single or female");
	    printPersons(singleOrFemale.meetCriterial(persons));
	    
	}
	
	public static void printPersons(List<Person> persons) {
		for (Person person: persons) {
			System.out.println("name: " + person.getName() + 
					           " ,gender: " + person.getGender() + 
					           " ,marital :" + person.getMaritalStatus());
		}
	}

}
