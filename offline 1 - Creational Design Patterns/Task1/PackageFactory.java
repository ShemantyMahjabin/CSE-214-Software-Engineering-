public interface PackageFactory {
    Microcontroller createMicrocontroller();
    Display createDisplay();
    TicketingCard createTicketing();
    Storage createStorage();
    Controller createController();
    Payment createPayment();
}
