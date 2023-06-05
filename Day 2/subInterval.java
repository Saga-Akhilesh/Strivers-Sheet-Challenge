public class subInterval{
    public int[][] merge(int[][] intervals) {
        List<int[]>res=new ArrayList<>();
        if(intervals.length==0 || intervals==null){
            return res.toArray(new int[0][]);
        }
        Arrays.sort(intervals,(a,b) -> a[0]-b[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int []i:intervals){
            if(i[0]<=end){
                end=Math.max(end,i[1]); //for merging, we take right maximum of both intervals 
            }else{ //if they are not merging then add them to data structure.
                res.add(new int[]{start,end});
                //then reassign start and end to new intervals which are mnot merging with interval which is add to data structure.
                start =i[0]; 
                end=i[1];
           }
        }
        //after iteration is completed, whatever is there in start and end, it wil be added in data structure. that means the interval which is left after all iterations.
        res.add(new int[]{start,end});
        return res.toArray(new int[0][]);
    }
}