package amitycalculator;

public class Constellation {//Constellation class. Decided to make it a class 
    //seeing as there are a fixed number of them, each with a length value.
    private final String name;
    private final int length;

    public int getLength() {
        return length;
    }
    
    public Constellation(String con) {//All program needs to do to 
        //create constellation and set it its length attribute is to call 
        //this class with the name of the constellation. 
        name = con;
        
        if (name.equals("BlackDragon")) {//Sets length for given name.
            length = 6;
        } else if (name.equals("Camel")) {
            length = 4;
        } else if (name.equals("Giant")) {
            length = 5;
        } else if (name.equals("Shield")) {
            length = 6;
        } else if (name.equals("Boat")) {
            length = 1;
        } else if (name.equals("Hammer")) {
            length = 1;
        } else if (name.equals("Seal")) {
            length = 1;
        } else if (name.equals("Key")) {
            length = 1;
        } else if (name.equals("Goblin")) {
            length = 1;
        } else if (name.equals("Wagon")) {
            length = 4;
        } else if (name.equals("Owl")) {
            length = 4;
        } else if (name.equals("Elephant")) {
            length = 4;
        } else {//If constellation does not exist, length 0. This would return
            //an error when continuing to create the NPC.
            length = 0;
        }
    }
    
    public String getName() {
        return name;
    }
}


