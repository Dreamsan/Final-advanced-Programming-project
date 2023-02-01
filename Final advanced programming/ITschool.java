
package srs;

import java.util.ArrayList;
import java.util.Arrays;

public class ITschool extends School{
    private ArrayList<Program> programs;  
    public ITschool(int id){
        super(id, "Infirmatics", "IT");
        programs = new ArrayList<>(Arrays.asList(new ComputerScience(45), new DataScience(46), new CyberSecurity(47) ));
    }
    
    public Program chooseProgram(String s){
        for(Program p : programs){
            if(s==p.getAbrv()) return p;
        }
        return null;
    }
    
}

class ComputerScience extends Program{
    
    public ComputerScience(int id){
        super(id, "Computer Science", "CS");
    }
}

class CyberSecurity extends Program{
    
    public CyberSecurity(int id){
        super(id, "Cyber Security", "CYS");
    }
}

class DataScience extends Program{
    
    public DataScience(int id){
        super(id, "Data Science", "DS");
    }
}