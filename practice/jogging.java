package practice;

import java.lang.*;
import java.util.*;

/*
 parentPos  -> initial position of the parent
 childPos   -> initial position of the child
 velParent  -> speed of the parent (meters per step)
 steps      -> number of steps taken by the parent
 */
public class jogging {

    public static int[] commonFootsteps(int parentPos, int childPos,
            int velParent, int steps) {
        int[] answer = new int[2];

        // TODO:
        // 1. Determine the maximum number of common footsteps (F)
        // 2. Determine the speed (V) of the child
        // 3. If multiple speeds give same F, choose the highest V
        // 4. Store results in answer[0] = F, answer[1] = V
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int parentPos = in.nextInt();
        int childPos = in.nextInt();
        int velParent = in.nextInt();
        int steps = in.nextInt();

        int[] result = commonFootsteps(parentPos, childPos, velParent, steps);

        System.out.print(result[0] + " " + result[1]);
    }
}
