
package srs;


enum degreeType{
    Bachelor,
    Master;
}
public class Degree {
    private degreeType dt;
    
    public Degree(String s){
        dt = (s == "b" ? degreeType.Bachelor : degreeType.Master);
    }
    
    public String toString(){
        return dt.toString();
    }
}
