import java.util.Scanner;

/**
 * * @author Mohamed
 * 
 * @since 11 june 2021
 * @version 1.0
 * @author Eng.Mohamed
 * 
 *         class playgroundowner extends from user has 2 attribute
 *         defaultLocation,playground
 */
public class PlaygroundOwner extends User {

	private String defaultLocation;
	private Playground playground;

	/**
	 * parameterized constructor that set data of playground
	 * 
	 * @param defaultLocation location of playground
	 * @param playground      playground
	 * @param profile         profile of playground owner
	 */
	public PlaygroundOwner(String defaultLocation, Playground playground, Profile profile) {
		super(profile);
		this.defaultLocation = defaultLocation;
		this.playground = playground;
	}

	/**
	 * parameterized constructor that set data of playground owner profile
	 * 
	 * @param profile profile of playground owner
	 */

	public PlaygroundOwner(Profile profile) {
		super(profile);
	}

	/**
	 * defualt constructor
	 */
	public PlaygroundOwner() {
	}

	/**
	 * function to get default location
	 * 
	 * @return the value of default location
	 */
	public String getDefaultLocation() {
		return this.defaultLocation;
	}

	/**
	 * function to set aDefaultLocation
	 * 
	 * @param aDefaultLocation aDefaultLocation of playground
	 */
	public void setDefaultLocation(String aDefaultLocation) {
		this.defaultLocation = aDefaultLocation;
	}
        /**
	 * function to create profile for user 
	 * 
	 * 
	 */
	@Override
	public void createProfile() {
		PlaygroundOwner pr = null;
		register(pr, playground); // To change body of generated methods, choose Tools | Templates.
	}

	public void register(PlaygroundOwner plgro, Playground playground) {
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
		plgro = new PlaygroundOwner(pr);
	}

	/**
	 * function to addDetailsAboutPlayground
	 */
	public void addDetailsAboutPlayground() {
		addPlayground(playground);
	}

	/**
	 * function to addPlayground which add name of playground function to
	 * addPlayground which add location function to addPlayground which add size
	 * function to addPlayground which add hour
	 */
	public void addPlayground(Playground pl) {
		Scanner i = new Scanner(System.in);
		System.out.println("enter name of playground");
		String name = i.next();
		System.out.println("enter location");
		String location = i.next();
		System.out.println("enter size");
		double size = i.nextDouble();
		System.out.println("enter hours");
		int hours = i.nextInt();
		pl = new Playground(name, location, size, hours);

	}

	/**
	 * function to addAvailableHours
	 */
	public void addAvalibleHours(Playground plg) {
		boolean flag = false;
		Scanner i = new Scanner(System.in);
		int count = 0;
		while (!flag) {
			++count;
			System.out.println("enter avalible slot time as a range from");
			int avaTime = i.nextInt();
			System.out.println("enter avalible slot time as a range to");
			int ava2Time = i.nextInt();

			System.out.println("Do you need add another available time \n1-y(yes) \n 2-n(no) ?");
			char ch = i.next().charAt(0);
			if (ch == 'n') {
				flag = true;
			}
			plg.storeData(avaTime, ava2Time, count);
		}
	}

	/**
	 * function addPriceForHours
	 * 
	 * @param Playground
	 * 
	 */

	public void addPriceForHours(Playground pl) {
		System.out.println("Enter price per hour");
		Scanner i = new Scanner(System.in);
		int price = i.nextInt();
		pl.setpriceprh(price);

	}

	/**
	 * function to get playground
	 * 
	 * @return playground
	 */
	public Playground getPlayground() {
		return this.playground;
	}

	/**
	 * function to set playground which Receiving object from Playground
	 * 
	 * @param aPlayground playground
	 */
	public void setPlayground(Playground aPlayground) {
		this.playground = aPlayground;
	}
}
