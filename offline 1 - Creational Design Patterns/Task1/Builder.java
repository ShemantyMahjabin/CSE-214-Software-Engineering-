public class Builder {
    
    private Microcontroller microcontroller;
    private Display display;
    private Storage storage;
    private InternetConnection internetConnection;
    private TicketingCard ticketingCard;
    private WebServer webServer;
    private Controller controller;
    private Payment payment;

    
    public Builder setPackageComponents(PackageFactory packageFactory) {
        this.microcontroller = packageFactory.createMicrocontroller();
        this.display = packageFactory.createDisplay();
        this.storage = packageFactory.createStorage();
        this.ticketingCard = packageFactory.createTicketing();
        this.controller = packageFactory.createController();
        this.payment = packageFactory.createPayment();
        return this;
    }

    
    public Builder setInternetConnection(InternetConnection internetConnection) {
        this.internetConnection = internetConnection;
        return this;
    }

    
    public Builder setWebServer(WebServer webServer) {
        this.webServer = webServer;
        return this;
    }

   

    
    public TicketingSystem build() {
        return new TicketingSystem(microcontroller, display, storage, internetConnection, ticketingCard, webServer,controller,payment);
    }
}
