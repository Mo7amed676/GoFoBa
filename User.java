
import java.util.Scanner;

/**
 *
 * @author Eng.Mohamed
 */
public class User {

    private Profile profile;
    private Ewallet ewallet;

    public User() {
    }

    public User(Profile profile, Ewallet ewallet) {
        this.profile = profile;
        this.ewallet = ewallet;
    }

    public Profile getProfile() {
        return this.profile;
    }

    public void setProfile(Profile aProfile) {
        this.profile = aProfile;
    }

    public void createProfile() {
        register();
    }

    public void register() {
        Scanner i = new Scanner(System.in);
        System.out.println("enter name");
        String name = i.next();
        System.out.println("enter phone");
        String phone = i.next();
        System.out.println("enter email");
        String email = i.next();
        System.out.println("enter id");
        int id = i.nextInt();
        System.out.println("enter password");
        String password = i.next();
        Profile pr=new Profile(name, phone, email, id, password);
        
    }

    public Ewallet getEwallet() {
        return this.ewallet;
    }

    public void setEwallet(Ewallet aEwallet) {
        this.ewallet = aEwallet;
    }
}
