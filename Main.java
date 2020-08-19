import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        testStream();
        testStringLines();
        testStream2List();
    }

    public static void testStream() {
        System.out.println("testStream");
    }
    
    public static void testStringLines() {
        String s = "Diep\nTran\nsays\nhello";
        s.lines().forEach(line->System.out.println(line));
    }

    public static void testStream2List() {
        System.out.println("testStream2List----");
        List<Integer> ints = new ArrayList<>();
        for(int i=0; i<10; i++) {
            ints.add(i);
        }

        // get odds array only
        List<Integer> odds = ints.stream().filter(i -> i%2==0).collect(Collectors.toList());
        odds.stream().forEach(o->System.out.println(o));
    }
}


