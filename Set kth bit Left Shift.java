class Solution {
    static int setKthBit(int n, int k) {
        // code here
        int num=1<<k;
        n=n|num;
        return n;
    }
}
