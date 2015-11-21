package com.xiaohua.xindongzhang.Filter;

import java.util.List;

public class AndCriteria implements Criteria {

	private Criteria criteria;
	
	private Criteria otherCriteria;
	
	public AndCriteria(Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}
	
	@Override
	public List<Person> meetCriterial(List<Person> persons) {
		List<Person> firstCriteriaPersons = criteria.meetCriterial(persons);
		return otherCriteria.meetCriterial(firstCriteriaPersons);
	}

}
