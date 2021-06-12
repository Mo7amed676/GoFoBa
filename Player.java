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
	public void displayPlayground(Playground pl) {
		pl.showData();

	}

	@Override
	public void createProfile() {
		Player pl = null;
		register(pl);
	}

	public void register(Player pl) {
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

	/**
	 * function to calculateTotalPrice
	 */

}
