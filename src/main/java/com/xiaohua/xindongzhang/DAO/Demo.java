package com.xiaohua.xindongzhang.DAO;

public class Demo {
	
	public static void main(String[] args) {
		StudentDAO studentDao = new StudentDaoImpl();
		for (Student student: studentDao.getAllStudents()) {
			System.out.println("student:" + student.getName());
		}
		Student student = studentDao.getAllStudents().get(0);
		student.setName("hehehe");
		studentDao.updateStudent(student);
		studentDao.getStudent(0);
		System.out.println("student: " + student.getName());
	}
	
}
