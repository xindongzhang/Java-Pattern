package com.xiaohua.xindongzhang.DAO;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDAO {

	private List<Student> students;
	
	public StudentDaoImpl() {
		this.students = new ArrayList<>();
		Student student1 = new Student("xindongzhang", 0);
		Student student2 = new Student("hefang", 1);
		students.add(student1);
		students.add(student2);
	}
	
	@Override
	public List<Student> getAllStudents() {
		return this.students;
	}

	@Override
	public Student getStudent(int rollNo) {
		return this.students.get(rollNo);
	}

	@Override
	public void updateStudent(Student student) {
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("update:" + student.getName());
	}

	@Override
	public void deleteStudent(Student student) {
		students.remove(student.getRollNo());
		System.out.println("delete: " + student.getName());
	}

}
