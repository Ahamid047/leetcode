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
package practice;
import java.util.*;

public class solntn {

    public static int[] funcDistance(int[] inputDist, int start, int end) {
        Arrays.sort(inputDist);
        int count = 0;
        for (int i = start; i <= end; i++) {
            count++;

        }
        int[] arr = new int[count];
        int index = 0;
        for (int j = start; j <= end; j++) {
            arr[index] = inputDist[j];
            index++;

        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int inputDist_size = in.nextInt();
        int[] inputDist = new int[inputDist_size];

        for (int i = 0; i < inputDist_size; i++) {
            inputDist[i] = in.nextInt();
        }

        int start = in.nextInt();
        int end = in.nextInt();

        int[] result = funcDistance(inputDist, start, end);

        for (int i = 0; i <= result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

// package practice;
// import java.lang.*;
// import java.util.*;
// public class solntn
// {
//     public static int[] funcDistance(int[] inputDist, int start, int end){
//         Arrays.sort(inputDist);
//         int n =0;
//         for(int i =start; i <=end;i++){
//             System.out.println(i);
//         }
//     }
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         // input for inputDist
//         int inputDist_size = sc.nextInt();
//         int inputDist[] = new int[inputDist_size];
//         for(int idx = 0; idx < inputDist_size; idx++)
//         {
//             inputDist[idx] = sc.nextInt();
//         }
//         // input for start
//         int start = sc.nextInt();
//         // input for end
//         int end = sc.nextInt();
//         int[] result = funcDistance(inputDist, start, end);
//         for(int idx = 0; idx < result.length; idx++)
//         {
//             System.out.print(result[idx] + " ");
//         }
//     }
// }
