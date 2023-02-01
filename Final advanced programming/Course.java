
package srs;

import java.util.Map;

public class Course {
    private int id;
    private String name;
    private int creditHours;
    private Map sections;
    
    public Course(int id, String name, int hours){
        this.id = id;
        this.name = name;
        this.creditHours = hours;
    }
    
    public int getHours(){
        return this.creditHours;
    }
    
    public String toString(){
        return name;
    }
}
