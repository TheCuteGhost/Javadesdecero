public class Maindos {
    public static void main(String[] args) {
        User user = new User("Nicolas");

        User user2 = new User("Josh");

        System.out.println(user.name);
        System.out.println(user2.name);

        System.out.println(user.tableName);
    }
}
