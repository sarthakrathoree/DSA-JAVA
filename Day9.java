public class Day9 {
    static boolean check(int speed, int distance, int time){
        if(speed*time>=distance) return true;
        return false;
    }

    static int binarysearch(int distance,int time){
        int low=0;
        int high=1000;
        int ans=0;
        while(low<=high){
            int mid=(high+low)/2;
            if(check(mid,distance,time)){
                ans=mid;
                high=mid-1;
            }
            else 
            low=mid+1;
        }
        return ans;
    }
    public static void main(String[] args){
        int distance=100;
        int time=3;
        System.out.print(binarysearch(distance,time));
    }
}
