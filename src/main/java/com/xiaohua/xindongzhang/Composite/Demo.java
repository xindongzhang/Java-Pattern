package com.xiaohua.xindongzhang.Composite;

public class Demo {
	public static void main(String[] args) {
		Employee CEO = new Employee("xindongzhang", "CEO", 300000);
		Employee headSales = new Employee("hefang", "Head Sales", 20000);
		Employee saleExecutives1 = new Employee("test1", "sale executive", 10000);
		Employee saleExecutives2 = new Employee("test2", "sale executive", 10000);
		
		CEO.add(headSales);
		headSales.add(saleExecutives1);
		headSales.add(saleExecutives2);
		
		System.out.println(CEO);
		for (Employee headEmployee: CEO.getSubordinates()) {
			System.out.println(headEmployee);
			for (Employee employee: headEmployee.getSubordinates()) {
				System.out.println(employee);
			}
		}
	}
}
