package com.xiaohua.xindongzhang.MVC;

public class Demo {
	
	public static void main(String[] args) {
		Student model = retriveStudentFromDB();
		StudentView view = new StudentView();
		StudentController controller = new StudentController(model, view);
		controller.updateView();
		
		controller.setStudentName("hefang");
		controller.updateView();
	}
	
	private static Student retriveStudentFromDB() {
		Student student = new Student();
		student.setName("xindongzhang");
		student.setRollNo("10");
		return student;
	}
	
}
