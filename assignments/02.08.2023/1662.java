class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        Arrays.sort(word1);
        Arrays.sort(word2);
        String [] temp1 = new String[word1.length+1];
        String [] temp2 = new String[word2.length+1];
        for (int i=0;i<word1.length;i++){
            temp1[i] = word1[0]+word1[i];
        }
        for(int j=0;j<word2.length;j++){
            temp2[j] = word2[0]+word2[j];
        }
        if(temp1==temp2){
            return true;
        }
        else{
            return false;
        }

    }
}