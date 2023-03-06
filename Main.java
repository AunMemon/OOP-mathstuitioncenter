package com.example.mathtuitioncenter;

public class Main {

    public static void main(String[] args) {
        
		Database databaseObject = new Database();
		HelloApplication helloObject = new HelloApplication();
		HelloController heeloCons = new HelloController();
		Name nameObj = new Name();
		Student stdObject = new Student();
		StudentBatch stdBatchObj = new StudentBatch();
		
		databaseObject.Connect();
		
		nameObj.setFName("John");
		nameObj.setLName("Doe");
		nameObj.setMName("J.");
		
		stdObject.setName(nameObj);

		stdObject.displayMarks();
		
		Teacher teacherObj = new Teacher("Jane", "John", "address", "2 year", "M.A");
		
		teacherObj.teach();
		teacherObj.grade(stdObject);
		teacherObj.updateExperience("5");
		
		stdBatchObj.add(stdObject, 10);

        boolean found = stdBatchObj.find(studentName);
        if (found) {
            System.out.println("Student found in the batch.");
        } else {
            System.out.println("Student not found in the batch.");
        }
        heeloCons.onHelloButtonClick();
		helloObject.launch();
		stdObject.displayMarks();
    }
}