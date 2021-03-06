/**
 *
 * @author Mohamed
 * @since 12 june 2021
 * @version 1.0 this class add information about playground(name, location
 *          size,hours)
 */

public class Playground {

	private String name;
	private String location;
	private double size;
	private int hours;
	int arr[];
	int arr2[];
	private int priceprh;

	/**
	 * Parameterized Constructor that set the playground Data
	 * 
	 * @param name     name of playground
	 * @param location location of playground
	 * @param size     size of playground
	 * @param hours    Reservation hours
	 */
	public Playground(String name, String location, double size, int hours) {
		this.arr2 = new int[5]; // 5 as example
		this.arr = new int[5];
		this.name = name;
		this.location = location;
		this.size = size;
		this.hours = hours;
	}

	/**
	 * default Constructor
	 */
	public Playground() {
		this.arr2 = new int[5];
		this.arr = new int[5];
	}

	/**
	 * function to get name of playground
	 * 
	 * @return the value of name of playground
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * function to set name of playground
	 * 
	 * @param aName the name of playground
	 */
	public void setName(String aName) {
		this.name = aName;
	}

	/**
	 * function to get location of playground
	 * 
	 * @return the value of location of playground
	 * 
	 */
	public String getLocation() {
		return this.location;
	}

	/**
	 * function to set location of playground
	 * 
	 * @param aLocation the location of playground
	 */
	public void setLocation(String aLocation) {
		this.location = aLocation;
	}

	/**
	 * function to get size of playground
	 * 
	 * @return the value of size playground
	 */
	public double getSize() {
		return this.size;
	}

	/**
	 * function to set size of playground
	 * 
	 * @param aSize the size of playground
	 */
	public void setSize(double aSize) {
		this.size = aSize;
	}

	/**
	 * function to get hour
	 * 
	 * @return the value of hour
	 */
	public int getHours() {
		return this.hours;
	}

	/**
	 * function to set hour
	 * 
	 * @param aHours Reservation hours
	 */
	public void setHours(int aHours) {
		this.hours = aHours;
	}

	/**
	 * function to get price per hour
	 * 
	 * @return the value of price p h
	 */
	public int getpriceprh() {
		return this.priceprh;
	}

	/**
	 * function to set price per hour
	 * 
	 * @param priceprh price per hour
	 */
	public void setpriceprh(int priceprh) {
		this.priceprh = priceprh;
	}

	/**
	 * function to store avalible hour in playground
	 * 
	 * @param from  first paramter ( first hour )
	 * @param to    second paramter ( second hour )
	 * @param count counter which Calculates time
	 */
	public void storeData(int from, int to, int count) {
		for (int i = 0; i < count; i++) {
			arr[i] = from; // from as player can reserve from any time 
			arr2[i] = to; // to another any time like from 10 to 11
		}
	}

	/**
	 * function to display all avaliable data about playground to cho)se any avaliable slot time that he like
	 */
	public void showData() {
		System.out.print(name);
		System.out.print(location);
		System.out.print(size);
		System.out.print(priceprh);
		for (int i = 0; i < 1; i++) {
			System.out.print("from ");
			System.out.print(arr[i]);
			System.out.print(" to ");
			System.out.print(arr2[i] + "\n");
		}
	}

	/**
	 * function to display pricePerHour for player
	 */
	public void pricePerHour() {
		System.out.println("This play ground costs " + priceprh + "per hour");

	}
}
