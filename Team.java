

/**
 *
 * @author Eng.Mohamed
 */
public class Team {

    private String name;
    private int members;
    private Player player;

    public String getName() {
        return this.name;
    }

    public void setName(String aName) {
        this.name = aName;
    }

    public int getMembers() {
        return this.members;
    }

    public void setMembers(int aMembers) {
        this.members = aMembers;
    }

    public Player getPlayer() {
        return this.player;
    }

    public void setPlayer(Player aPlayer) {
        this.player = aPlayer;
    }
}
