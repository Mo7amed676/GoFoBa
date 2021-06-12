/****
 *@author Mohamed
 * @since  11 june 2021
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
		po.register(po, gr);
		po.addPlayground(gr);
		po.addAvalibleHours(gr);
		po.addPriceForHours(gr);

		///////////////////////////////////////////////////////////////////////////////////////////////////////////

		Player pl = new Player();
		pl.register(pl);
		pl.displayPlayground(gr);
		pl.selectFreeTimeSlot(gr);
		pl.displayPlayground(gr);

	}
}
