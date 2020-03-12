package t0305;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public int lengthOfLongestSubstring(String s) {
		int num=1,i=0;
		char[] str = s.toCharArray();
		List list = new ArrayList();
		while(i<str.length) {
			for(int j=i;j<str.length;j++) {
				if(list.contains(str[j]))
					break;
				list.add(str[j]);
				if(num<j-i+1)
					num = j-i+1;
			}
			i++;
			list.clear();
		}
		return num;
	}
}
