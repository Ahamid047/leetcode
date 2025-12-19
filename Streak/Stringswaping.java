public class Stringswaping {
    public static void main(String[] args) {
        String str ="Hamid";

        char [] arr= str.toCharArray();
        int left = 0;
        int right = arr.length-1;

        while(left <right ){
            if(!isVowel(arr[left])){
                left++;
            }
            if(!isVowel(arr[right])){
                right--;
            }
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] =temp;
            left++;
            right--;
        }
        String result = new String(arr);
        System.out.println(result);
        
    }
    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

}


// public class Stringswaping {
//     public static void main(String[] args) {
//         String str = "Abdul";

//         char[] arr = str.toCharArray();
//         int left = 0;
//         int right = arr.length - 1;

//         while (left < right) {
//             char temp = arr[left];
//             arr[left] = arr[right];
//             arr[right] = temp;

//             left++;
//             right--;
//         }

//         String result = new String(arr);
//         System.out.println(result);
//     }
// }


// import java.util.Arrays;

// public class Stringswaping{
//     public static void main(String[] args) {
//         String str = "Hamid";
//         char [] arr = str.toCharArray();
//         System.out.println(Arrays.toString(arr));
//     }
// }