class Solution {
    public static int[] AddElements(int min, ArrayList<Integer> l1, ArrayList<Integer> l2)
    {
        ArrayList<Integer> List = new ArrayList<>();
        for(int i = 0; i < l1.size(); i++)
        {
            if(l2.contains(l1.get(i)))
            {
                List.add(l1.get(i));
                l2.remove(l1.get(i));
            }
        }
        // Converting final list into an array
        int arr[] = new int[List.size()];
        for(int j = 0; j < List.size(); j++)
        {
            arr[j] = List.get(j);
        }
        return arr;
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        // Converting Arrays to ArryLists
        for(int i = 0; i < nums1.length; i++)
        {
            list1.add(nums1[i]);
        }
        for(int j = 0 ; j < nums2.length; j++)
        {
            list2.add(nums2[j]);
        }
        
        int min = (list1.size() > list2.size()) ? list2.size() : list1.size();
        if(min == list1.size()) {
            return AddElements(min, list1, list2);
         }
         else {
            return AddElements(min, list2, list1);
         }
    }
}