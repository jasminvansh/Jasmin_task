public class Student {
    int studentId;
    String studentName;
    String grade;


public Student(int studentId, String studentName, String grade){
    this.studentId =studentId;
    this.studentName =studentName;
    this.grade = grade;
}

public Student(){
    this(1,"Jasmin","A+");
    
}

public static void main(String[] args) {
    Student student1 = new Student();
    System.out.println("Student 1 - ID: " + student1.studentId + ", Name: " + student1.studentName + ", Grade: " + student1.grade);

    Student student2 = new Student(2,"Nikhil","A+");
    System.out.println("Student 2- ID: " + student2.studentId + ", Name: " + student2.studentName + ", Grade: " + student2.grade);
}

}
