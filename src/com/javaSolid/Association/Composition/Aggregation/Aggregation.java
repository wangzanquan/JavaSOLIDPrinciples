package com.javaSolid.Association.Composition.Aggregation;

import java.util.ArrayList;
import java.util.List;

/*
 	Aggregation is a special form of Association where:
 	It represents Has-A relationship.
 	It is a unidirectional association i.e. a one way relationship.
 	For example, department can have students but vice versa is not possible and thus unidirectional in nature.
 	In Aggregation, both the entries can survive individually which means ending will not effect the other entity.
 */
public class Aggregation {

	public static void main(String[] args) {
		Student s1 = new Student("Mia", 1, "CSE");
		Student s2 = new Student("Priya", 2, "CSE");
		Student s3 = new Student("John", 1, "EE");
		Student s4 = new Student("Rahul", 2, "EE");
		
		//making a list of
		//CSE Students.
		List<Student> cse_students = new ArrayList<Student>();
		cse_students.add(s1);
		cse_students.add(s2);

		// making a List of
		// EE Students
		List<Student> ee_students = new ArrayList<Student>();
		ee_students.add(s3);
		ee_students.add(s4);

		Department CSE = new Department("CSE", cse_students);
		Department EE = new Department("EE", ee_students);

		List<Department> departments = new ArrayList<Department>();
		departments.add(CSE);
		departments.add(EE);

		// creating an instance of Institute.
		Institute institute = new Institute("BITS", departments);

		System.out.print("Total students in institute: ");
		System.out.print(institute.getTotalStudentsInInstitute());
		
		
	}

}

class Student{
	String name;
	int id;
	String dept;
	
	Student(String name, int id, String dept){
		this.name = name;
		this.id = id;
		this.dept = dept;
	}
}
/*
 
 */
class Department{
	String deptName;
	private List<Student> students;
	public Department(String deptName, List<Student> students) {
		this.deptName = deptName;
		this.students = students;
	}
	public List<Student> getStudents() {
		return students;
	}	
}
/*
Institude class contains list of Department Objects. It is associated with 
Department class through its Object(s)
*/
class Institute{
	String instituteName;
	private List<Department> departments;
	public Institute(String instituteName, List<Department> departments) {
		super();
		this.instituteName = instituteName;
		this.departments = departments;
	}
	//count total students of all departments
	//in a given institute
	public int getTotalStudentsInInstitute() {
		int noOfStudents = 0;
		List<Student> students;
		for(Department dept : departments) {
			students = dept.getStudents();
			for(Student s : students) {
				noOfStudents++;
			}
		}
		return noOfStudents;
	}
}
