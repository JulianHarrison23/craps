/**
 * File for a Song class to be used in the Playlist Project
 * @author
 * @version
 */
public class Die {
    //Fields-- what information do we want each Song to store?
    private int roll;

    public Die(){
        roll = (int)(Math.random()*6)+1;
    }

    public int getRoll(){
        return roll;
    }
    
    public void newRoll(){
        roll = (int)(Math.random()*6)+1;
    }


}
