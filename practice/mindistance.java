// 📝 Problem Statement

// A company wants to provide a cab service for its N employees.
// The employees have IDs ranging from 0 to N−1.

// The company has calculated the distance from each employee’s residence to the company.

// Distance of the company from itself is 0.

// Employees living on the left side of the company have negative distance.

// Employees living on the right side of the company have positive distance.

// The cab will be allotted a distance range defined by start and end.

// Write an algorithm to find the distances of employees who live within the given distance range (inclusive).

// 📥 Input Format

// An integer N, representing the number of employees

// An integer array inputDist of size N, where inputDist[i] represents the distance of the i-th employee

// An integer start, representing the starting distance of the range

// An integer end, representing the ending distance of the range

// 📤 Output Format

// An integer array containing the distances of employees that lie within the given distance range, arranged in ascending order

// 📌 Constraints

// 1 ≤ N ≤ 100

// -10⁵ ≤ inputDist[i] ≤ 10⁵

// start ≤ end

// 🧪 Sample Input
// 6
// -10 5 8 -3 2 0
// -5
// 5

// ✅ Sample Output
// -3 0 2 5
import java.util.*;

public class mindistance {

    public static int[] funcDistance(int[] inputDist, int start, int end) {
        Arrays.sort(inputDist);
        int count =0;
        for(int i =0;i<inputDist.length;i++){
            if(inputDist[i]>=start && inputDist[i]<=end){
                count ++;
            }
        }
        int [] arr = new int[count];
        int index =0;
        for(int j =0;j<inputDist.length;j++){
            if(inputDist[j]>=start && inputDist[j]<=end){
                arr[index]=inputDist[j];
                index++;
                
            }
            
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int inputDist_size = in.nextInt();
        int[] inputDist = new int[inputDist_size];

        for (int i = 0; i <inputDist_size; i++) {
            inputDist[i] = in.nextInt();
        }

        int start = in.nextInt();
        int end = in.nextInt();

        int[] result = funcDistance(inputDist, start, end);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

