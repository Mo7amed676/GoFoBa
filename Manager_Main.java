/****
 *@author Mohamed
 * @since  12 june 2021
 *  @version 1.0
 * 
 */
public class Manager_Main { 

  /**
	 *** This is the main method. It is for testing purposes to test This is the main
	 * method. It is for testing purposes to test the work of GOFO Football
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		PlaygroundOwner po = new PlaygroundOwner();
		Playground gr = new Playground();
		System.out.println("registering playground owner");
		po.register(po, gr);
		System.out.println("registering playground");
		po.addPlayground(gr);
		po.addAvalibleHours(gr);
		po.addPriceForHours(gr);

		///////////////////////////////////////////////////////////////////////////////////////////////////////////

		Player pl = new Player();
		System.out.println("registering player");
		pl.register(pl);
		System.out.println("desplay the play ground  and book a free slot");
		// we should replace it with array list but we do that just for testing the
		// functions as demanded
		pl.displayPlayground(gr);
		pl.selectFreeTimeSlot(gr);
		System.out.println("desplay the play ground after booking a free slot");
		pl.displayPlayground(gr);

	}
}
