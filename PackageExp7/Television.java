package PackageExp7;

public class Television implements Remote {

    private boolean isOn = false; // Tracks TV power state
    private int currentChannel = 1; // Default channel

    // Implement powerOn() method
    @Override
    public void powerOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("TV is now ON");
        } else {
            System.out.println("TV is already ON");
        }
    }

    // Implement powerOff() method
    @Override
    public void powerOff() {
        if (isOn) {
            isOn = false;
            System.out.println("TV is now OFF");
        } else {
            System.out.println("TV is already OFF");
        }
    }

    // Implement changeChannel() method
    @Override
    public void changeChannel(int channel) {
        if (isOn) {
            if (channel > 0) {
                currentChannel = channel;
                System.out.println("Channel changed to " + currentChannel);
            } else {
                System.out.println("Invalid channel number. Please enter a positive number.");
            }
        } else {
            System.out.println("TV is OFF. Turn it ON to change channels.");
        }
    }

    public static void main(String[] args) {
        // Remote reference holding a Television object (Polymorphism)
        Remote myTV = new Television();

        // Using the remote to control the TV
        myTV.powerOn();
        myTV.changeChannel(5);
        myTV.changeChannel(12);
        myTV.powerOff();
        myTV.changeChannel(3); // Should display message that TV is off
    }

}
