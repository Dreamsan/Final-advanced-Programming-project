
package srs;

import java.util.ArrayList;


public abstract class Program {
    private int id;
    private String name;
    private String abrv;
    private ArrayList courses;
    
    public Program(int id, String name, String abrv){
        this.id = id;
        this.name = name;
        this.abrv = abrv;
        courses = new ArrayList<>();
    }
    
    public String getAbrv(){
        return abrv;
    }
    
    public void addCourse(Course course){
        if(courses.contains(course)){
            System.out.println("Course Already in the Program");
        }else{
            courses.add(course);
        }
    }
    
   
    public String toString(){
        return name;
    }
    
}
