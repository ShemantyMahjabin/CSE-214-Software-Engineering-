public interface Subject {
    void addUser(observer Observer);
    void removeUser(observer Observer);
    void notifyUsers(String movie);
}
