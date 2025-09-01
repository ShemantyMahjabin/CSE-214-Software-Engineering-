import java.util.List;
import java.util.ArrayList;

public class Menu implements MenuComponent{
    private List<MenuComponent> menuItems;
    
    public Menu(){
        this.menuItems = new ArrayList<>();
        setMenu();
    }

    private void setMenu(){
        menuItems.add(new FoodItem("Burger",300));
        menuItems.add(new FoodItem("Fries",100));
        menuItems.add(new FoodItem("Wedges",150));
        menuItems.add(new FoodItem("Shawarma",200));
        menuItems.add(new FoodItem("Drink",25));

        Combo combo1=new Combo("Combo1");
        combo1.add(new FoodItem("Burger",300));
        combo1.add(new FoodItem("Fries",100));
        combo1.add(new FoodItem("Drink",25));
        menuItems.add(combo1);

        Combo combo2=new Combo("Combo2");
        combo2.add(new FoodItem("Shawarma",200));
        combo2.add(new FoodItem("Drink",25));
        //combo2.setDiscountPercentage(4.4);
        combo2.setCustomPrice(215);
        menuItems.add(combo2);

    }

        public void addMenuItems(MenuComponent Items) {
            menuItems.add(Items);
        }

      
        public List<MenuComponent> getMenuItems() {
            return menuItems;
        }
        
        public String getName(){
            return "Khaidai Bistro Menu";
        }

        public int getPrice(){
            int totalPrice=0;
            for(MenuComponent item: menuItems){
                totalPrice+=item.getPrice();
            }
            return totalPrice;
        }
        
        public void display(){
            System.out.println(getName()+":");
            for(MenuComponent item: menuItems){
                item.display();
                
            }
            //System.out.println(" -  "+getPrice());
        }

        public MenuComponent findItem(String name){
            for(MenuComponent item: menuItems){
                if(item.getName().equalsIgnoreCase(name)){
                    return item;
                }
            }
            return null;
        }

    
}
