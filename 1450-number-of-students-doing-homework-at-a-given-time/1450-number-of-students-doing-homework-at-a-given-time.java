class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int c=0;
        for(int i=0;i<startTime.length;i++){
            if(queryTime>=startTime[i] && endTime[i]>=queryTime)
                c++;
        }
        return c;
    }
}