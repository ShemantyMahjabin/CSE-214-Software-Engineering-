public class BasicPackage implements PackageFactory {
    public Microcontroller createMicrocontroller() {
        return new ATMega32();
    }

    public Display createDisplay() {
        return new LCD();
    }

    public TicketingCard createTicketing() {
        return new RFID();
    }

    public Storage createStorage() {
        return new SDCard();
    }


    public Controller createController() {
        return new BasicController();
    }

    public Payment createPayment() {
        return new PaymentSystem();
    }
}