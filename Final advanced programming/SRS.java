
package srs;

public class SRS {
    public static void main(String[] args) {
        Degree degree = new Degree("b");
        ITschool school = new ITschool(55);
        Program program = school.chooseProgram("CS"); 
        Program program2 = school.chooseProgram("DS");
        Course course1 = new Course(22,"Algorithms",4); program.addCourse(course1);
        Course course2 = new Course(23,"Data Structres",4); program.addCourse(course2);
        Course course3 = new Course(24,"Mathmetics",3); program.addCourse(course3);
        Course course4 = new Course(25,"Object Oriented Programming", 6); program.addCourse(course4);
        Course course5 = new Course(26,"Artificial Inteligence", 3); program.addCourse(course5);
        Course course6 = new Course(27,"Compilers",2); program.addCourse(course6);
        Student johnny = new Student(123, "Johnny", degree, school, program, StudyingType.Regular);
        johnny.add(course1);
        
        johnny.add(course2);
        johnny.add(course3);
        johnny.add(course4);
        johnny.add(course5);
        System.out.println(johnny.getCourses());

        johnny.drop(course2);
        System.out.println(johnny.getCourses());
        System.out.println(johnny.getHours());
        
        System.out.println(johnny.getProgram());
        johnny.changeProgram(program2);
        System.out.println(johnny.getProgram());
        
        johnny.setGrades(4,3,2,4,3);
        System.out.println("Grade Average is: " + johnny.calcAverage());

    }
    
}
