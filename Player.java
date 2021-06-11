

/**
 *@author Mohamed
 * @since  11 june 2021
 *  @version 1.0
 * 
 * class player  extends from user  has one attribute complaint
 */

import java.util.Scanner;

public class Player extends User {

   

    /**
     *
     * function to display information about playground
     */
    public void displayPlayground() {
        
    }

   
    @Override
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
        Profile pr = new Profile(name, phone, email, id, password);

    }


    /**
     * function to make player join team
     */
    public void joinTeam() {
        
    }


    /**
     *function to select freeTimeslot
     */
    public void selectFreeTimeSlot() {
        
    }


    /**
     * function to calculateTotalPrice
     */

}
