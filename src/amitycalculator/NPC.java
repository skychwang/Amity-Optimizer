package amitycalculator;

//Importing necessary libraries
import java.util.*;

public class NPC {//NPC Class!
    
    //datamembers
    public ArrayList<Topic> Topics = new ArrayList<Topic>(); //Array list, as
    //the number of conversation topics is subject to change. 
    private Constellation constellation; //NPC constellation relies on the 
    //constellation class.
    private int favorLevel;
    private int interestLevel;
    private String name;
    
    //empty constructor
    public NPC() {
        //Creates an empty NPC
    }
    
    public NPC(Constellation constellationIn, int favorlevelIn, 
            int interestlevelIn, String nameIn, 
            ArrayList<Topic> topicsIn) {//Creates a filled NPC
        //Polymorphic constructor   
        Topics = topicsIn;
        constellation = constellationIn;
        favorLevel = favorlevelIn;
        interestLevel = interestlevelIn;
        name = nameIn;
    }
    
    //Get and set methods
    public Constellation getConstellation() {
        return constellation;
    }
    
    public int getNPCFavorLevel() {
        return favorLevel;
    }
    
    
    public int getNPCInterestLevel() {
        return interestLevel;
    }
    
    public String getNPCName() {
        return name;
    }
    
    public void setConstellation(Constellation newConstellation) {
        constellation = newConstellation;
    }
    
    public void setNPCFavorLevel(int newNPCFavorLevel) {
        favorLevel = newNPCFavorLevel;
    }
    
    public void setNPCInterestLevel(int newNPCFavorLevel) {
        interestLevel = newNPCFavorLevel;
    }
    
    public void setNPCName(String newNPCName) {
        name = newNPCName;
    }
}
