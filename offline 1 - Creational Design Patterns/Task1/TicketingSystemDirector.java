public class TicketingSystemDirector {
    private Builder ticketingSystemBuilder;
    private PackageFactory selectedPackage;
    private WebServer selectedWebServer;
    private InternetConnection selectedInternetConnection;

   
    public TicketingSystemDirector(Builder ticketingSystemBuilder, PackageFactory selectedPackage,
                                   WebServer selectedWebServer, InternetConnection selectedInternetConnection) {
        this.ticketingSystemBuilder = ticketingSystemBuilder;
        this.selectedPackage = selectedPackage;
        this.selectedWebServer = selectedWebServer;
        this.selectedInternetConnection = selectedInternetConnection;
    }

    
    public TicketingSystem constructTicketingSystem() {

        ticketingSystemBuilder.setPackageComponents(selectedPackage);

      
        ticketingSystemBuilder.setWebServer(selectedWebServer);

       
        ticketingSystemBuilder.setInternetConnection(selectedInternetConnection);

        
        return ticketingSystemBuilder.build();
    }
}
