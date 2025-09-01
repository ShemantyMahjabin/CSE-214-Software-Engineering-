import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Select a Package: 1. Basic 2. Standard 3. Advanced 4. Premium");
            int packageChoice = scanner.nextInt();
            PackageFactory packageFactory = null;
            boolean isRaspberryPi = false;  

            switch (packageChoice) {
                case 1:
                    packageFactory = new BasicPackage();
                    break;
                case 2:
                    packageFactory = new StandardPackage();
                    break;
                case 3:
                    packageFactory = new AdvancedPackage();
                    isRaspberryPi = true;  
                    break;
                case 4:
                    packageFactory = new PremiumPackage();
                    isRaspberryPi = true;  
                    break;
                default:
                    System.out.println("Invalid package choice. Exiting.");
                    return;
            }

            
            System.out.println("Select an Internet Connection:");
            if (isRaspberryPi) {
                System.out.println("1. WiFi 2. Ethernet 3. GSM");
            } else {
                System.out.println("1. WiFi 2. GSM");
            }

            int internetChoice = scanner.nextInt();
            InternetConnection internetConnection = null;

            if (isRaspberryPi) {
                switch (internetChoice) {
                    case 1:
                        internetConnection = new WiFi();
                        break;
                    case 2:
                        internetConnection = new Ethernet();
                        break;
                    case 3:
                        internetConnection = new GSM();
                        break;
                    default:
                        System.out.println("Invalid internet connection choice. Exiting.");
                        return;
                }
            } else {
                switch (internetChoice) {
                    case 1:
                        internetConnection = new WiFi();
                        break;
                    case 2:
                        internetConnection = new GSM();
                        break;
                    default:
                        System.out.println("Invalid internet connection choice. Exiting.");
                        return;
                }
            }

            
            System.out.println("Select a Web Framework: 1. Django 2. NodeJS 3. Ruby");
            int webChoice = scanner.nextInt();
            WebServer webServer = null;
            switch (webChoice) {
                case 1:
                    webServer = new Django();
                    break;
                case 2:
                    webServer = new NodeJS();
                    break;
                case 3:
                    webServer = new Ruby();
                    break;
                default:
                    System.out.println("Invalid web framework choice. Exiting.");
                    return;
            }

            Builder builder = new Builder();
            TicketingSystemDirector director = new TicketingSystemDirector(builder, packageFactory, webServer, internetConnection);
    
           
            TicketingSystem system = director.constructTicketingSystem();
    
            
            System.out.println("\nTicketing System Details:");
            system.showDetails();
        }
    }
}
