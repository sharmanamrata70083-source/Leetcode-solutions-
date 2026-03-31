class Solution {

    public static void Solve(int i ,  List<List<Integer>> ans , int[] arr , ArrayList<Integer> temp)
    {
        if(i == arr.length)
        {
            ans.add(new ArrayList<Integer>(temp)) ;
            return ;
        }

        
        temp.add(arr[i]) ;
        Solve(i+1,ans,arr,temp) ;

        temp.remove(temp.size()-1) ;
        Solve(i+1,ans,arr,temp) ;
    }
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList() ;
        Solve(0,ans,nums,new ArrayList<Integer>()) ;
        return ans ;
    }
}