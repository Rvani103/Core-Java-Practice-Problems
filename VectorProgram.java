import java.util.Vector;
public class VectorProgram {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        numbers.add(24);
        numbers.add(12);
        numbers.add(23);
        numbers.add(12);
        System.out.println("Vector: " + numbers);
        //remove an element
        numbers.remove(Integer.valueOf(23));
        System.out.println("After removing 23: " + numbers);
        //it allows duplicate elements and maintains the list
    }
    
}