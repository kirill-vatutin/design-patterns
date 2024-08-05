public class Main {
    public static void main() {
        Device smartphone = new Smartphone();
        Device tablet = new Tablet();
        Device smartWatch = new SmartWatch();

        MobileOS ios = new IOS(smartphone);
        ios.run();

        MobileOS android = new Android(tablet);
        android.run();

        MobileOS harmonyOS = new HarmonyOS(smartWatch);
        harmonyOS.run();
    }
}
