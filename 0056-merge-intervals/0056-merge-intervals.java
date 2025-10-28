class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> a[0]-b[0]);
       int index=0;
       List<int[]> list=new ArrayList<>();
       while(index < intervals.length){
        int newstart=intervals[index][0];
        int curend=intervals[index][1];

        while(index < intervals.length-1 && curend>=intervals[index+1][0]){
            curend=Math.max(curend,intervals[index+1][1]);
            index+=1;
        }
                int newend=curend;
                list.add(new int[]{newstart,newend});
                index+=1;
       } 

       int[][] res= new int[list.size()][2];
       int ind=0;
       for(int[] ans:list){
        res[ind++]=ans;
       }
       return res;
    }
}