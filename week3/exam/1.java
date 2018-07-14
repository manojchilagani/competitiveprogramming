class Solution {
    
    public static int Distance(int x, int y) {
        int xor = x ^ y;
        return Integer.bitCount(xor);
    }

    public static void main(String[] args){
        int s=Distance(0,255);
        System.out.println("Hamming distance is "+s);
    }
}