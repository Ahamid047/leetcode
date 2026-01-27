// 🟦 Problem Statement: Common Footsteps

// A child's parent goes for a jog every morning.
// The parent starts jogging from a position parentPos meters away from home and runs in a straight line at a constant speed of velParent meters per step for steps steps.

// The child starts jogging from the same position (childPos), but begins a few minutes later.
// The child runs at a constant speed V meters per step.

// The child wants to:

// Step on as many of the parent’s footsteps as possible

// The first step taken by the child must coincide with a step already taken by the parent

// Let:

// F = maximum number of common footsteps

// V = child’s speed that achieves this maximum

// ⚠️ If multiple speeds result in the same maximum F, return the highest possible speed V.

// 🟦 Input Format

// First line: Integer parentPos

// Second line: Integer childPos

// Third line: Integer velParent

// Fourth line: Integer steps

// 🟦 Output Format

// Return an integer array of size 2:

// [F, V]


// where

// F = maximum number of common footsteps

// V = child’s speed corresponding to F

// 🟦 Constraints
// 1 ≤ parentPos, childPos ≤ 10^5
// 1 ≤ velParent ≤ 10^5
// 1 ≤ steps ≤ 10^5

import java.util.*;
import java.lang.*;
import java.io.*;

public class commonfootstep
{
    /*
     * parentPos: initial position of the parent
     * childPos : initial position of the child
     * velParent: speed of the parent (meters per step)
     * steps    : number of steps taken by the parent
     */
    public static int[] commonFootsteps(int parentPos, int childPos, int velParent, int steps)
    {
        int[] answer = new int[2];
        // Write your logic here
        return answer;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int parentPos = in.nextInt();
        int childPos = in.nextInt();
        int velParent = in.nextInt();
        int steps = in.nextInt();

        int[] result = commonFootsteps(parentPos, childPos, velParent, steps);

        System.out.print(result[0] + " " + result[1]);
    }
}

