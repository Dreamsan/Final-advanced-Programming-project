
package srs;

import java.util.ArrayList;
import java.util.Arrays;

public class ENGschool extends School{
    private ArrayList<Program> programs;
    public ENGschool(int id){
        super(id, "Engineering School", "ENG");
        programs = new ArrayList<>(Arrays.asList(new EnergyEngineering(43), new ElectricalEngineering(44)));
    }
}

class ElectricalEngineering extends Program{
    public ElectricalEngineering(int id){
        super(id, "Electrical Engineering", "ELENG");
    }
    
}

class EnergyEngineering extends Program{
    
    public EnergyEngineering(int id){
        super(id, "Energy Engineering", "ENENG");
    }
}