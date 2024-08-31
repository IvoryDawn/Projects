class Solution {
    public int[] add(int min, int[] arr1, int[]arr2)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < min; i++)
        {
            int found = Arrays.binarySearch(arr2, arr1[i]);
            if((!list.contains(arr1[i])) && found >= 0)
            {
               list.add(arr1[i]);
            }
        }
        int arr[] = new int[list.size()];
        for(int j = 0; j < list.size(); j++)
        {
            int el = list.get(j);
            arr[j] = el;
        }
        return arr;
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n1 = nums1.length, n2 = nums2.length;
        int min = (n1 > n2) ? n2 : n1;
        if(min == n1) {
           return add(min, nums1, nums2);
        }
        else {
           return add(min, nums2, nums1);
        }
    }
}