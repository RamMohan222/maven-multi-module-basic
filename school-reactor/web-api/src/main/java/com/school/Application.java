package com.school;

import com.school.lecturer.LecturerController;
import com.school.student.StudentController;

public class Application {

	public static void main(String[] args) {
		StudentController studentCtrl = new StudentController();
		System.out.println(studentCtrl.getMessage(null));

		LecturerController lecturerCtrl = new LecturerController();
		System.out.println(lecturerCtrl.getMessage(null));
	}
}
