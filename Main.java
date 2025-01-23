import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        /*
        list.add(6);
        list.add(36);
        list.add(19);
        list.add(45);
        System.out.print("Elements before reversing: " + list);
        list = reverseLinkedList(list);
        System.out.print("\nElements after reversing: " + list);
         */

        //powerFunction(2, 5);

        digPow(46288, 3);
    }

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {
        LinkedList<Integer> revLinkedList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {

            revLinkedList.add(list.get(i));
        }
        return revLinkedList;
    }

    public static long digPow(int n, int p) {

        String stringN = String.valueOf(n);
        long finalResult = 0;

        for (int i = 0; i < stringN.length(); i++) {

            System.out.println("Index: " + i);
            System.out.println("CharAt: " + stringN.charAt(i));
            System.out.println("p: " + p + "\n");

            powerFunction(stringN.charAt(i), p);

            p++;

        }
        System.out.println(finalResult);

        return -1; //doesn't affect the printing
    }

    //calling powerFunction(2, 5) should be 32 but is 20
    static long powerFunction(int base, int exponent) {
        long result = 1; // Start with 1 since anything raised to 0 is 1

        //Multiply 'base' by itself 'exponent' times
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        System.out.println(result);
        return result;
    }

}
