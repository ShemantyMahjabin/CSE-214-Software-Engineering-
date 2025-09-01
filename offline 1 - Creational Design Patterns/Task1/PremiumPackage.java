public class PremiumPackage implements PackageFactory {
    public Microcontroller createMicrocontroller() {
        return new RaspberryPi();
    }

    public Display createDisplay() {
        return new TouchscreenDisplay();
    }

    public TicketingCard createTicketing() {
        return new NFC();
    }

    public Storage createStorage() {
        return new InternalStorage();
    }

    public Controller createController() {
        return new TouchScreenController();
    }
    public Payment createPayment() {
        return new PaymentSystem();
    }
}