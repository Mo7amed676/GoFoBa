
/**
 *
 * class profile which contain Data of use ( name,phone,email,ID,password)
 * @author Mohamed
 * @since  12 june 2021
 * @version 1.0 
 * @author Eng.Mohamed
 */
public class Profile {

    private String name;
    private String phone;
    private String email;
    private int iD;
    private String password;

    /**
     *parameterized constructor that set data of playground
     * @param name name of user 
     * @param phone phone of user 
     * @param email email of user 
     * @param iD id of user 
     * @param password password of user 
     */
    public Profile(String name, String phone, String email, int iD, String password) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.iD = iD;
        this.password = password;
    }

    /**
     *defualt constructor 
     */
    public Profile() {
    }

    /**
     * function to get name of user 
     * @return Name  the value of user 
     */
    public String getName() {
        return this.name;
    }

    /**
     * function to set name of user 
     * @param aName  name of user
     */
    public void setName(String aName) {
        this.name = aName;
    }

    /**
     * function to getPhone of user 
     * @return phone of  user
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * function to set  phone of user 
     * @param aPhone  phone of user 
     */
    public void setPhone(String aPhone) {
        this.phone = aPhone;
    }

    /**
     * function to get email of user 
     * @return email email of user  
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * function to set email of user  
     * @param aEmail email of user 
     */
    public void setEmail(String aEmail) {
        this.email = aEmail;
    }

    /**
     * function to get id of user 
     * @return  the value of  id of user 
     */
    public int getID() {
        return this.iD;
    }

    /**
     * function to set id of user 
     * @param aID id of user 
     */
    public void setID(int aID) {
        this.iD = aID;
    }

    /**
     * function to get password 
     * @return  password of user 
     */
    public String getPassword() {
        return this.password;
    }

    /**
     *function to set id of user 
     * @param aPassword Password of user 
     */
    public void setPassword(String aPassword) {
        this.password = aPassword;
    }
}
