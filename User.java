import java.util.Scanner;
/**
 * @author Mohamed
 * @since  11 june 2021
 *  @version 1.0
 */
public class User {

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
        register();
    }

    /**
     * 
     * function register which  register Data of user (name,email,id,password) 
     * 
     */
    public void register() {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = i.next();
        System.out.println("Enter Your Phone");
        String phone = i.next();
        System.out.println("Enter your Email");
        String email = i.next();
        System.out.println("Enter your ID");
        int id = i.nextInt();
        System.out.println("Enter Your Password");
        String password = i.next();
        Profile pr=new Profile(name, phone, email, id, password);
        
    }

}

