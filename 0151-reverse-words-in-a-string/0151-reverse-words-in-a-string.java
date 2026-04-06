class Solution {
    public String reverseWords(String str) {
        str=str.trim();
        String[] st=str.split("\\s+");

        int l=0;
        int r=st.length-1;
        while(l<r){
            String temp=st[l];
            st[l]=st[r];
            st[r]=temp;
            l++;
            r--;
        }
        return String.join(" ",st).trim();
    }
}