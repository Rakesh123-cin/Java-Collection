package com.rakesh.String;

public class Test {
	
	static void checkString(String s) {
        int v = 0;
        int c = 0;

        // Your code here
        String vowels="aeiou";
        for(int i=0;i<s.length();i++)
        {
        	if(s.charAt(i)==' ')
        		continue;
        	
            if(vowels.contains(Character.toString(s.charAt(i))))
                v++;
            else
                c++;
                
        }

        if (v > c)
            System.out.print("Yes");
        else if (c > v)
            System.out.print("No");
        else
            System.out.print("Same");

        System.out.println();
    }

	public static void main(String[] args) {
		checkString("a i u e o t m n s w");
	}

}
