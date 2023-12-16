import java.util.ArrayList;
import java.util.List;

public class Crud<T>{
    private List<T> database = new ArrayList<>();


    public void setAll(T t) {
        database.add(t);
        System.out.println("Element dobavlen");

    }


    public void getAll() {
        if (database.isEmpty()) {
            System.out.println("[0]");
        } else {
            for (T item : database) {
                System.out.println(item);
            }
        }
    }
}

