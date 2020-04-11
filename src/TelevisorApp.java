public class TelevisorApp {
    public static void main(String[] args) {
        Televisor tv = new Televisor();

        tv.showStatus();
        tv.turnOn();
        tv.showStatus();
        tv.turnOff();
        tv.showStatus();
    }
}
