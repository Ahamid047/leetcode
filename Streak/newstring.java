
class newstring {

    protected  static void main(String[] args) {
        String str = "aaabccdddaaabb";
        char[] arr = str.toCharArray();
        int right = arr.length-1;
        int count = 1;

        for (int i = 0; i <= right; i++) {
            if(i==right){
                if (arr[right-1] == arr[right-2]) {
                    count++;
                } else {
                    System.out.print(count);
                    System.out.print(arr[i]);
                    count = 1;

                }

            }else if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                System.out.print(count);
                System.out.print(arr[i]);
                count = 1;

            }

        }

    }

}
// String str = "aaabccdddaaabb";
// String str = "3a1b2c3d3a2b";

