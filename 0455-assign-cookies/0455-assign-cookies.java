class Solution {
    public void SortArr(int arr[], int low, int hi){
        if(low >= hi){ return; }
        int s = low; 
        int e = hi; 
        int m = s + (e - s) / 2;
        int pivot = arr[m];
        while(s <= e){
            while(arr[s] < pivot){ s++; }
            while(arr[e] > pivot){ e--; }
            if(s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++; 
                e--;
            }
        }
        SortArr(arr, low, e);
        SortArr(arr, s, hi);
    }
    public int findContentChildren(int[] g, int[] s) {
        SortArr(g, 0, g.length - 1);
        SortArr(s, 0, s.length - 1);
        int i = 0, j = 0, count = 0;
        while(i < g.length && j < s.length){
            if(s[j] >= g[i]){
                count++;
                i++;
            }
            j++;
        }
        return count;
    }
}