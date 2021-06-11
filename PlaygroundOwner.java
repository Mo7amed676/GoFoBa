
import java.util.Scanner;

/**
 *
 * @author Eng.Mohamed
 */
public class PlaygroundOwner extends User {

    private String defaultLocation;
    private Playground playground;

    public PlaygroundOwner(String defaultLocation, Playground playground, Profile profile, Ewallet ewallet) {
        super(profile, ewallet);
        this.defaultLocation = defaultLocation;
        this.playground = playground;
    }

    public PlaygroundOwner(String defaultLocation, Playground playground) {
        this.defaultLocation = defaultLocation;
        this.playground = playground;
    }

    public PlaygroundOwner() {
    }

    public String getDefaultLocation() {
        return this.defaultLocation;
    }

    public void setDefaultLocation(String aDefaultLocation) {
        this.defaultLocation = aDefaultLocation;
    }

    public void addDetailsAboutPlayground() {
        addPlayground();
    }

    public void addPlayground() {
        Scanner i = new Scanner(System.in);
        System.out.println("enter name of playground");
        String name = i.next();
        System.out.println("enter location");
        String location = i.next();
        System.out.println("enter size");
        double size = i.nextDouble();
        System.out.println("enter hours");
        int hours = i.nextInt();
        Playground pl = new Playground(name, location, size, hours);

    }

    /*
    public void checkEwallet() {
    throw new UnsupportedOperationException();
    }*/
    public void addAvailableHours() {
        addAvalibleTime();
    }

    public void addAvalibleTime() {
        boolean flag = false;
        Scanner i = new Scanner(System.in);
        int count=0;
        while (!flag) {
            ++count;
            System.out.println("enter avalible slot time as a range from");
            int avaTime = i.nextInt();
            System.out.println("enter avalible slot time as a range to");
            int ava2Time = i.nextInt();
            System.out.println("do you need add another available time enter y to not need enter n ?");
            char ch=i.next().charAt(0);
            if(ch=='n'){
                flag=true;
            }
            Playground plg=new Playground();
            plg.storeData(avaTime, ava2Time,count);
        }
    }

    /*
    public void addCancelationPeriod() {
    throw new UnsupportedOperationException();
    }*/
    public void addPriceForHours() {

    }

    /*    public void requestRegisteringPlayground() {
    throw new UnsupportedOperationException();
    }*/
 /*    public void viewBookings() {
    throw new UnsupportedOperationException();
    }*/
 /*    public void transferMoney() {
    throw new UnsupportedOperationException();
    }*/
    public Playground getPlayground() {
        return this.playground;
    }

    public void setPlayground(Playground aPlayground) {
        this.playground = aPlayground;
    }
}
