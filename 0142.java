import java.util.ArrayList;

public class RemoveElement {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("Java");
    list.add("Python");
    list.add("C++");
    System.out.println(list);
    list.remove(1);
    System.out.println(list);
  }
}
