package com.xiaohua.xindongzhang.Filter;

import java.util.List;

public class OrCriteria implements Criteria {

	private Criteria criteria;
	
	private Criteria otherCriteria;
	
	public OrCriteria(Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}
	
	@Override
	public List<Person> meetCriterial(List<Person> persons) {
		List<Person> firstCriteriaItems = criteria.meetCriterial(persons);
		List<Person> otherCritetiaItems = otherCriteria.meetCriterial(persons);
		for (Person person: otherCritetiaItems) {
			if ( !firstCriteriaItems.contains(person) ) {
				firstCriteriaItems.add(person);
			}
		}
		return firstCriteriaItems;
	}

}
