import java.util.Arrays;

public class Solution {
    
    public static void main(String[] args) {
        int result;

        int [][] case1 = {{1,2,3},{3,2,1}};
        int [][] case2 = {{1,5},{7,3},{3,5}};
        int [][] case3 = {{2,8,7},{7,1,3},{1,9,5}};

        result = new SolutionProblem().maximumWealth(case1);
        System.out.println(result);

        result = new SolutionProblem().maximumWealth(case2);
        System.out.println(result);

        result = new SolutionProblem().maximumWealth(case3);
        System.out.println(result);
    }
}


class SolutionProblem {

    public int maximumWealth(int[][] accounts) {
        int highestWealth = 0;
        int currentWealth;

        for (int i = 0; i < accounts.length; i++) {
            
            // Sum all money that client i'th has in all banks
            currentWealth = (Arrays.stream(accounts[i]).reduce(0, (a,b) -> a+b));

            if (currentWealth > highestWealth) {
                highestWealth = currentWealth;
            }
        }

        return highestWealth;
    }
}