import java.util.LinkedList;
public class LinkedListProgram{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("White");
        list.addFirst("Black");//add it begning
        list.addLast("violet");//add it last
        System.out.println("LinkedList: " + list);
        //remove at element
        list.remove("Gre(en");
        System.out.println("After removing Green: " + list);
        //Access elements
        String firstElements = list.getFirst();
        String lastElements = list.getLast();
        System.out.println("First Elements: " + firstElements);
        System.out.println("Last Elements: " + lastElements);
    }
}