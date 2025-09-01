public class StandardPackage implements PackageFactory {
    public Microcontroller createMicrocontroller() {
        return new ArduinoMega();
    }

    public Display createDisplay() {
        return new LED();
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
