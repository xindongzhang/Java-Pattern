package com.xiaohua.xindongzhang.TransferObject;

import java.util.ArrayList;
import java.util.List;

public class StudentBO {
	
	private List<StudentVO> students;
	
	public StudentBO() {
		students = new ArrayList<StudentVO>();
		StudentVO student1 = new StudentVO("xindongzhang", 0);
		StudentVO student2 = new StudentVO("hefang", 1);
		this.students.add(student1);
		this.students.add(student2);
	}
	
	public void deleteStudent(StudentVO student) {
		this.students.remove(student.getRollNo());
		System.out.println("delete from database rollNo:" + student.getRollNo());
	}
	
	public List<StudentVO> getStudents() {
		return this.students;
	}
	
	public StudentVO getStudent(int rollNo) {
		return this.students.get(rollNo);
	}
	
	public void updateStudent(StudentVO student) {
		this.students.get(student.getRollNo()).setName(student.getName());
		System.out.println("update the database rollNo:" + student.getRollNo());
	}
}
