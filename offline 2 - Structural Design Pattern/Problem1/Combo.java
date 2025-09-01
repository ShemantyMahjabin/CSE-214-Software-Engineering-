import java.util.ArrayList;
import java.util.List;

public class Combo implements MenuComponent{
    private String comboName;
    private double discountPercentage=0;
    private boolean hasDiscount = false;
    private Integer customPrice = null;
   // private int comboPrice=0;
    private List<MenuComponent> combos = new ArrayList<MenuComponent>();
    private List<MenuComponent> freeItems=new ArrayList<>();

    public Combo(String comboName){
        this.comboName = comboName;;
    }

    public void setCustomPrice(int price) {
        this.customPrice = price;  // Set a custom price
    }

    public int getOriginalPrice() {
        if (customPrice != null) {
            return customPrice;  // Return custom price if it’s set
        }
        int comboPrice = 0;
        for (MenuComponent menuComponent : combos) {
            comboPrice += menuComponent.getPrice();
        }
        return comboPrice;
    }


    
    public void add(MenuComponent menuComponent){
        combos.add(menuComponent);
    }
    
    public void remove(MenuComponent menuComponent){
        combos.remove(menuComponent);
    }

    public void addFreeItem(MenuComponent freeItem){
        freeItems.add(freeItem);
    } 
    
    public void setDiscountPercentage(double discountPercentage){
        this.discountPercentage = discountPercentage;
        this.hasDiscount = true;
    }

    // public void setComboPrice(int comboPrice){
    //     this.comboPrice = comboPrice;
    // }

    public String getName(){
        return comboName;
    }
    
    // public int getPrice(){
    //     int comboPrice=0;
    //     for(MenuComponent menuComponent : combos){
    //         comboPrice += menuComponent.getPrice();
    //     }

    //     //setComboPrice(comboPrice);
    //     return comboPrice;
    //}

    public int getPrice() {
        if (hasDiscount) {
            return getDiscountedPrice();
        }
        return getOriginalPrice();
    }


    public int getDiscountedPrice(){
        int comboPrice = getOriginalPrice();
        return (int) (comboPrice * (100 - discountPercentage) / 100);
    }

    public void display(){
        System.out.println(comboName);
        for(MenuComponent menuComponent : combos){
            System.out.print(" - ");
            menuComponent.display();
        }

        for(MenuComponent freeItem:freeItems){
            System.out.print("  - ");
            //freeItem.display();
            System.out.println(freeItem.getName()+"(Free!!!)");
        }
        System.out.println("Total -  " + getDiscountedPrice()+"tk");
    }

    public void menudetails(){
        System.out.println(comboName);
        for(MenuComponent menuComponent : combos){
            System.out.print(" - ");
            menuComponent.display();
        }

        for(MenuComponent freeItem:freeItems){
            System.out.print("  - ");
            //freeItem.display();
            System.out.println(freeItem.getName()+"(Free!!!)");
        }
        System.out.println("Total -  " + getOriginalPrice()+"tk");
        if(discountPercentage>0){
            System.out.println("Discount - " + discountPercentage +"%");
            System.out.println("Discounted total - "+ getDiscountedPrice()+ "tk");
        }

    }
    
}
