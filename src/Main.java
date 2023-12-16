// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


               User  user1 = new User("user1", "Urmat.email.com", "Urmat", "Taichikov", 25);
                User user2 = new User("user2", "Ulan.@email.com", "Ulan", "Temirov", 30);

                Crud<User> user = new Crud<>();

                user.setAll(user1);
                user.setAll(user2);
                System.out.println("**************************************************");
                user.getAll();





            }
        }


