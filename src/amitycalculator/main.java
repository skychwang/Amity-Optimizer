/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amitycalculator;

import java.util.*;
/**
 *
 * @author skywang329
 */
public class main {
    public String displayBestRoute(NPC npc, String successCondition, String likelyAmity) {
        
        //Remember to convert likely/Amity to "Amity" or "Likely" when passing value
        int max;
        int posmax;
        
        int min;
        int posmin;
        
        int[] favors = new int[npc.Topics.size()];
        int[] percentageSparkInterest = new int[favors.length];
        
        for (int counter = 0; counter < favors.length; counter++) {
            favors[counter] = npc.Topics.get(counter).getTopicFavorLevel();
        }
        
        for (int counter = 0; counter < percentageSparkInterest.length; counter++) {
            if (npc.Topics.get(counter).getTopicInterestLevel()/npc.getNPCInterestLevel() > 1) {
                percentageSparkInterest[counter] = 1;
            } else {
                percentageSparkInterest[counter] = npc.Topics.get(counter).getTopicInterestLevel()/npc.getNPCInterestLevel();
            }
        }
        
        
        for (int count = 0; count < npc.getConstellation().getLength(); count++) {
            if (
                    successCondition.equals("Consecutively Spark the Interest of the NPC 5 Times") ||
                    successCondition.equals("Consecutively Spark the Interest of the NPC 4 Times") ||
                    successCondition.equals("Consecutively Spark the Interest of the NPC 3 Times") ||
                    successCondition.equals("Consecutively Spark the Interest of the NPC 2 Times") ||
                    successCondition.equals("Spark the Interest of the NPC 1 Time") ||
                    successCondition.equals("Talk Freely with the NPC")
                    ) {
                if (likelyAmity.equals("Likely")) {
                    max = percentageSparkInterest[0];
                } else if (likelyAmity.equals("Amity")) {
                    max = favors[0];
                }
                posmax = 0;
                
            }
        }
        
        
        
        
        
        
        
        return "hi";
    }
}
