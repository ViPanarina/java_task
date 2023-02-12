import java.util.ArrayList;

public class ArrayListHW {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello!");
        list.add(0,"Mikhail");
        list.add("There is my ArrayList homework");
        System.out.println(list);
        System.out.println(list.get(1));


        list.remove(0);
        list.remove("Hello!");
        System.out.println(list);
    }
}
