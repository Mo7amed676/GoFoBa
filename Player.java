/**
 *@author Mohamed
 * @since  12 june 2021
 *  @version 1.0
 *
 * 
 * class player  extends from user  has one attribute complaint
 */

import java.util.Scanner;

public class Player extends User {

	/**
	 *
	 * function to display information about playground
	 */
	public void displayPlayground(Playground pl) {
		pl.showData();

	}

	/**
	*this function create profile to player as name and phone and so on
	*/
	@Override
	public void createProfile() {
		Player pl = null;
		register(pl);
	}

    /**
     * this function call be register as can be invoke in function create profile 
     */
	public void register(Player pl) {  // i as input
		Scanner i = new Scanner(System.in);
		System.out.println("enter name of player");
		String name = i.next();
		System.out.println("enter phone of player");
		String phone = i.next();
		System.out.println("enter email of player");
		String email = i.next();
		System.out.println("enter id of player");
		int id = i.nextInt();
		System.out.println("enter password of player");
		String password = i.next();
		Profile pr = new Profile(name, phone, email, id, password);

	}


	/**
	 * function to select freeTimeslot
	 * 
	 * @param Playground
	 */
	public void selectFreeTimeSlot(Playground pl) {
		Scanner i = new Scanner(System.in);
		int count = 0;
		System.out.println("enter slot time as a range from");
		int slotpgn = i.nextInt();
		System.out.println("enter  slot time as a range to");
		int slotend = i.nextInt();
		++count;
		for (int j = 0; j < count; j++) {
			pl.arr[j] = slotend;
			pl.arr2[j] = pl.arr2[j];
		}

	}

}
