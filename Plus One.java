class Solution {
    static ArrayList<Integer> increment(ArrayList<Integer> arr , int n) {
        // code here
        for(int i=n-1;i>=0;i--){
            if(arr.get(i)<9){
                arr.set(i, arr.get(i)+1);
                return arr;
            }
            arr.set(i,0);
        }
        arr.add(0,1); // will add 1 at front idx
        return arr;
    }
};
