import java.util.HashSet;
public class HappyNumber {
	public static void main(String[] args) {
		System.out.println(isHappy(19));

	}
	public static boolean isHappy(int n) {
    	HashSet<Integer> tracker = new HashSet<Integer>();
    	return isHappyHelper(n, tracker) == 1;
    }
    
    public static int isHappyHelper(int n, HashSet<Integer> tracker){
    	if (n == 1)
    		return 1;
    	else if(tracker.contains(n)){
    		return 0;
    	}
    	else{
    		tracker.add(n);
    		int sum = 0;
    		while(n/1 != 0){
    			sum += (n%10) * (n%10);
    			n = n/10;
    		}
    		System.out.print(sum);
    		System.out.println(tracker.toString());
    		return isHappyHelper(sum, tracker);
    	}	
    }
}
