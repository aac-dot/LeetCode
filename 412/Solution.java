import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        System.out.println(fizzBuzz(20));
    }
 
    public static List<String> fizzBuzz(int n) {
        
        List<String> answers = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            
            if (i % 3 == 0 && i % 5 == 0) {
                answers.add("FizzBuzz");
            } else if (i % 3 == 0) {
                answers.add("Fizz");
            } else if (i % 5 == 0) {
                answers.add("Buzz");
            } else {
                answers.add(Integer.toString(i));
            }
        }

        return answers;
    }
}