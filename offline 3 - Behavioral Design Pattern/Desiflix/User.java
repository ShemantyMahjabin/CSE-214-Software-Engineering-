import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;


public class User implements observer{
    private String name;
    private Set<String> favoriteGenres;

    public User(String name){
        this.name = name;
        this.favoriteGenres = ConcurrentHashMap.newKeySet();
    }

    public void addFavoriteGenre(String genre){
        favoriteGenres.add(genre);
    }
    
    public void removeFavoriteGenre(String genre){
        favoriteGenres.remove(genre);
    }

    public boolean isSubscribedTo(String genre){
        return favoriteGenres.contains(genre);
    }

    @Override
    public void notify(String movie,String genre){
        System.out.println(name + " is notified that " + movie + " is released in " + genre);
    }
    
}
