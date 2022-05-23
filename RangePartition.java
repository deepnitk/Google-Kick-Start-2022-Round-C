import java.util.*;

class Solution {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int T = in.nextInt();
        
        for ( int t = 0; t < T; t++){
            long n = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long totalSum = (n * (n + 1))/ 2;
            if (totalSum % (x + y) != 0) {
                System.out.println("Case #" + (t+1) + ": " + "IMPOSSIBLE");
                return;
            }
            else {
                System.out.println("Case #" + (t+1) + ": " + "POSSIBLE");
            }
            long alanSetSum = x * (totalSum/(x + y));
            ArrayList<Long> res = new ArrayList<>();
            for( long i = n ;i > 0; i--){
                if(i <= alanSetSum){
                    res.add(i);
                    alanSetSum -= i;
                }
            }
            Collections.sort(res);
            
            System.out.println(res.size());
            for(Long a: res){
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
