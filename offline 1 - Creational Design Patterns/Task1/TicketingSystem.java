public class TicketingSystem {
    private Microcontroller microcontroller;
    private Display display;
    private Storage storage;
    private InternetConnection internetConnection;
    private TicketingCard ticketingCard;
    private WebServer webServer;
    private Controller controller;
    private Payment payment;

    public TicketingSystem(Microcontroller microcontroller, Display display, Storage storage,
                           InternetConnection internetConnection, TicketingCard ticketingCard, WebServer webServer,Controller controller,Payment payment) {
        this.microcontroller = microcontroller;
        this.display = display;
        this.storage = storage;
        this.internetConnection = internetConnection;
        this.ticketingCard = ticketingCard;
        this.webServer = webServer;
        this.controller = controller;
        this.payment = payment;
    }

   
    public void showDetails() {
        microcontroller.addMicrocontroller();
        display.addDisplay();
        storage.addStorage();
        ticketingCard.addTicketing();
        internetConnection.addInternetConnection();
        webServer.addWebServer();
        controller.addController();
        payment.addPayment();
    }
}
