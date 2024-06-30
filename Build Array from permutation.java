 import java .util.*;

class Solution {
    public static int[] buildArray(int[] n) {
        Scanner sc=new Scanner(System.in);
	     int a[]=new int[n.length];
        
	    
        for(int i=0;i<n.length;i++){
	        a[i]=n[n[i]];
	    }
        return a;


    }
   
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String ar=sc.nextLine();
	    String[] s = ar.replace("[", "").replace(",","").split(" ");
	    int a[]=new int[s.length];
	    for(int i=0;i<s.length;i++){
	        a[i]=Integer.parseInt(s[i]);
	    }
         int[] ans = buildArray(a);
        
        // Printing the result array
        System.out.print("[");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
            if (i < ans.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
}
}