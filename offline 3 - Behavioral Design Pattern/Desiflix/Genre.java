import java.util.ArrayList;
import java.util.List;

public  class Genre implements Subject {
    private String name;
    private List<observer> observers;
    
    public Genre(String name){
        this.name = name;
        this.observers = new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    
    public void addUser(observer observer){
        observers.add(observer);
    }
    
    public void removeUser(observer observer){
        observers.remove(observer);
    }
    
    public void notifyUsers(String movie){
        for(observer observer : observers){
            new Thread(() -> observer.notify(movie,name)).start();
        }
    }
}
