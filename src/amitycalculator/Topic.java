package amitycalculator;

public class Topic {//Topic class. Each conversation topic has a name, 
    //favor level, and interest level.
    private String topicName;
    private int topicFavorLevel;
    private int topicInterestLevel;
    
    //Basic get set methods
    public String getTopicName() {
        return topicName;
    }
    
    public int getTopicInterestLevel() {
        return topicInterestLevel;
    }
    
    public int getTopicFavorLevel() {
        return topicFavorLevel;
    }
    
    public void setTopicName(String newName) {
        topicName = newName;
    }
    
    public void setTopicInterestLevel(int newInterestLevel) {
        topicInterestLevel = newInterestLevel;
    }
    
    public void setTopicFavorLevel(int newFavorLevel) {
        topicFavorLevel = newFavorLevel;
    }

    
}
