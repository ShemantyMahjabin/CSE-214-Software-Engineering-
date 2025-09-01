import java.util.Scanner;

public class KhaidaiBistro {
    private static Menu menu = new Menu();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Press 1 to create a combo, 2 to view menu, and 0 to exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1:
                    createCombo(scanner);
                    break;
                case 2:
                    menu.display();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    

    private static void createCombo(Scanner scanner){
        System.out.println("Enter the name of the combo:");
        String comboName = scanner.nextLine();
        Combo newCombo=new Combo(comboName);
        //Combo combo = new Combo(comboName);
        while(true){
            System.out.println("Available commands: Add [item], Remove [item], Free [item], Discount [percentage], Done");
            String input = scanner.nextLine();
            String[] command = input.split(" ", 2);
            String action = command[0];

            if(action.equalsIgnoreCase("Add")){
                MenuComponent item=menu.findItem(command[1]);
                if(item!=null){
                    newCombo.add(item);  
                }else{
                    System.out.println("Item not found.");
                }
            }else if(action.equalsIgnoreCase("Remove")){
                MenuComponent item=menu.findItem(command[1]);
                if(item!=null){
                    newCombo.remove(item);
                } else{
                    System.out.println("Item not found.");
                }
            }else if(action.equalsIgnoreCase("Free")){
                MenuComponent item=menu.findItem(command[1]);
                if(item!=null){
                    newCombo.addFreeItem(item);
                    
                } else{
                    System.out.println("Item not found.");
                    
                }
            }else if(action.equalsIgnoreCase("Discount")){
                int Discount = Integer.parseInt(command[1]);
                newCombo.setDiscountPercentage(Discount);
                
            }else if (action.equalsIgnoreCase("Done")) {
                System.out.println("Your combo:");
                newCombo.menudetails();
                break;
            } else {
                System.out.println("Invalid command.");
            }
        }
        //System.out.println("Your combo:");
        //newCombo.display();
        menu.addMenuItems(newCombo);;

    }
}
