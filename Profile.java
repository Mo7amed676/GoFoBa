
/**
 *
 * @author Eng.Mohamed
 */
public class Profile {

    private String name;
    private String phone;
    private String email;
    private int iD;
    private String password;

    /**
     *
     * @param name
     * @param phone
     * @param email
     * @param iD
     * @param password
     */
    public Profile(String name, String phone, String email, int iD, String password) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.iD = iD;
        this.password = password;
    }

    /**
     *
     */
    public Profile() {
    }

    /**
     *
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     *
     * @param aName
     */
    public void setName(String aName) {
        this.name = aName;
    }

    /**
     *
     * @return
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     *
     * @param aPhone
     */
    public void setPhone(String aPhone) {
        this.phone = aPhone;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return this.email;
    }

    /**
     *
     * @param aEmail
     */
    public void setEmail(String aEmail) {
        this.email = aEmail;
    }

    /**
     *
     * @return
     */
    public int getID() {
        return this.iD;
    }

    /**
     *
     * @param aID
     */
    public void setID(int aID) {
        this.iD = aID;
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return this.password;
    }

    /**
     *
     * @param aPassword
     */
    public void setPassword(String aPassword) {
        this.password = aPassword;
    }
}
