package com.xiaohua.xindongzhang.Filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {

	@Override
	public List<Person> meetCriterial(List<Person> persons) {
		List<Person> femalePersons = new ArrayList<>();
		for ( Person person: persons ) {
			if ( person.getGender().equalsIgnoreCase("FEMALE") ) {
				femalePersons.add(person);
			}
		}
		return femalePersons;
	}

}
