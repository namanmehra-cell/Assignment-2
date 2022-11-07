package demo;

public class Assignment2 {
public static int minDays(int samDaily,int kellyDaily, int diff) {
        
        
        int samSolved=diff+samDaily;
        int kellySolved=kellyDaily;
        int count=1;
        
        if(samDaily>=kettyDaily){
            return -1;
            }
        
        while(samSolved-kellySolved>=0){
            
        	 samSolved=samSolved+samDaily;
             kellySolved=kellySolved+kellyDaily;
             count++;
             }
         return count;
         }
    
    public static void main(String[] args) {
        
        System.out.println(minDays(3,5,2));
    }



}
