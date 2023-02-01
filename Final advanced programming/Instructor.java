
package srs;


public class Instructor {
    private int id;
    private String name;
    private int salary;
    private School school;
    
    public Instructor(int id, int salary, String name, School school){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.school = school;
    }
}
