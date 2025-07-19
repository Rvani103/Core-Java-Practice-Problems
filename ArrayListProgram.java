import java.util.ArrayList;
public class ArrayListProgram {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add ("Apple");
        list.add("Mango");
        list.add("grapes");
        list.add("Apple");
        System.out.println("ArrayList: " + list);
        list.remove("grapes");//delete an element
        System.out.println("After removing grapes: " + list );
        //access an element
        String firstElement = list.get(0);
        System.out.println("First element:" + firstElement);
    }
}