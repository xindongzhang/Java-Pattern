package com.xiaohua.xindongzhang.TransferObject;

public class Demo {
	public static void main(String[] args) {
		
		StudentBO studentsBusinessObject = new StudentBO();
		
		for (StudentVO student: studentsBusinessObject.getStudents()) {
			System.out.println("Student:" + student.getName());
		}
		
		StudentVO student = studentsBusinessObject.getStudents().get(0);
		student.setName("xiaohua");
		studentsBusinessObject.updateStudent(student);
		
		studentsBusinessObject.getStudent(0);
		System.out.println("Student:" + student.getName());
	}
}
