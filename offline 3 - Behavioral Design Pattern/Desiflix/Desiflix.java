public class Desiflix {
    public static void main(String[] args){
        Genre thriller = new Genre("Thriller");
        Genre horror = new Genre("Horror");
        Genre comedy = new Genre("Comedy");


        User a = new User("A");
        User b = new User("B");
        User c = new User("C");

        a.addFavoriteGenre("Thriller");
        a.addFavoriteGenre("Horror");
        b.addFavoriteGenre("Comedy");
        c.addFavoriteGenre("Thriller");
        c.addFavoriteGenre("Comedy");

        if(a.isSubscribedTo("Thriller")){
            thriller.addUser(a);
        }
        if(a.isSubscribedTo("Horror")){
            comedy.addUser(a);
        }
        if(b.isSubscribedTo("Comedy")){
            comedy.addUser(b);
        }
        if(c.isSubscribedTo("Thriller")){
            thriller.addUser(c);
        }
        if(c.isSubscribedTo("Comedy")){
            comedy.addUser(c);
        }

        System.out.println("Uploading Thriller movie 1");
        thriller.notifyUsers("Thriller Movie 1");
        System.out.println("Uploading Comedy movie 1");
        comedy.notifyUsers("Comedy Movie 1");
        System.out.println("Uploading Horror movie 1");
        horror.notifyUsers("Horror Movie 1");


    }
}
