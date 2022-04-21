class Solution {
    public int lengthOfLastWord(String s) {
		char[] ca = s.toCharArray();
		
		int index = ca.length - 1;
		
		while (index >= 0 && ca[index] == ' ') index--;
		if (index == -1) return 0;

		int end = index;
		index--;

		while (index >= 0 && ca[index] != ' ') index--;

		return end - index;
	}
}