
/**
 *
 * @author Eng.Mohamed
 */
public class Playground {

    private String name;
    private String location;
    private double size;
    private int hours;
    int arr[] = new int[5];
    int arr2[] = new int[5];

    public Playground(String name, String location, double size, int hours) {
        this.name = name;
        this.location = location;
        this.size = size;
        this.hours = hours;

        int arr[] = new int[5];
        int arr2[] = new int[5];
    }

    public Playground() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String aName) {
        this.name = aName;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String aLocation) {
        this.location = aLocation;
    }

    public double getSize() {
        return this.size;
    }

    public void setSize(double aSize) {
        this.size = aSize;
    }

    public int getHours() {
        return this.hours;
    }

    public void setHours(int aHours) {
        this.hours = aHours;
    }

    public void storeData(int from, int to, int count) {
        for (int i = 0; i < count; i++) {
            arr[i] = from;
            arr2[i] = to;
        }
    }

    public void showData() {
        for (int i = 0; i < 2; i++) {
            System.out.print("from ");
            System.out.print(arr[i]);
            System.out.print(" to ");
            System.out.print(arr2[i] + "\n");
        }
    }

    public void availableHours() {

    }

    public void pricePerHour() {

    }
}
