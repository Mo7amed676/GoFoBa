/**
 *@since  11 june 2021
 * @version 1.0
 * 0@author Mohamed
 * class team which set name of team ,players ,members
 * 
 */
public class Team {
 
    private String name;
    private int members;
    private Player player;

    /**
     *function to get name of team 
     * @return name name of team  
     */
    public String getName() {
        return this.name;
    }

    /**
     * function to set name of team 
     * @param aName name of team 
     */
    public void setName(String aName) {
        this.name = aName;
    }

    /**
     * function to get members of teams
     * @return  the value of members of teams 
     */
    public int getMembers() {
        return this.members;
    }

    /**
     * function to set members of teams 
     * @param aMembers member of team 
     */
    public void setMembers(int aMembers) {
        this.members = aMembers;
    }

   
    
    /**
     *function to get player of  team 
     * @return player of teams
     * 
     */
    public Player getPlayer() {
        return this.player;
    }
/**
 * 
 * function to set player which receive object from player
 * @pram  aPlayer player 
 * */
    public void setPlayer(Player aPlayer) {
        this.player = aPlayer;
    }
}
