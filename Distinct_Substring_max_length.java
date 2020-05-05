class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = 128;  
		int n = s.length(); 
		int sub = 1;  
		int res = 1; 
		int val;   
		int arr[] = new int[len]; 
		for (int i = 0; i < len; i++) { 
			arr[i] = -1; 
		} 
        if(s.length()>0)
		arr[s.charAt(0)] = 0; 
        else
            return 0;
		for (int i = 1; i < n; i++) { 
			val = arr[s.charAt(i)]; 
			if (val == -1 || i - sub > val) 
				sub++; 
			else { 
				if (sub > res) 
					res = sub; 

				sub = i - val; 
			} 
			arr[s.charAt(i)] = i; 
		}  
		if (sub > res) 
			res = sub; 

		return res; 
	} 

}