/**
 * @author Mohamed
 * @since  12 june 2021
 *  @version 1.0
 */
public abstract class User {

    private Profile profile;
   
    /**
     *defualt constructor
     */
    public User() {
    }

    /**
     * Receiving object   from profile 
     * @param profile of user 
     */
    public User(Profile profile) {
        this.profile = profile;
       
    }

    /**
     *function to get profile of user 
     * @return profile of user 
     */
    public Profile getProfile() {
        return this.profile;
    }

    /**
     * function to set profile of user which Receiving object from profile 
     * @param aProfile profile of user 
     */
    public void setProfile(Profile aProfile) {
        this.profile = aProfile;
    }

    /**
     * function to  create Profile on system 
     */
    public void createProfile() {
    }
}

