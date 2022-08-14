class Solution {
public int mySqrt(int x) { 
	if (x == 0)//if x is 0 
        return 0;
	for (int i = 1; i <= x / i; i++)//search from 1 till x 		
		if (i <= x / i && (i + 1) > x / (i + 1))//i less than quotient of x/i && i+1 bigger than x/(i+1)
			return i;		
	return -1;
}
}