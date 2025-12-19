public class prodexceptcurr {
    public static void main(String[] args) {
        int [] nums={1,2,0,4};
        int [] res= new int[nums.length];    
        int prod=1;
        for(int num:nums){
            prod *= num;
        }
        for(int i=0;i<nums.length;i++){
            res[i]=prod /nums[i];
            System.out.println(res[i]);
            
        }
        
    }
}
