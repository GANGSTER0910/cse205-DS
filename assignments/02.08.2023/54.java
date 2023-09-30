class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int rowbegin =0;
        int rowend = matrix.length-1;
        int colowmbegin =0;
        int colowmend = matrix[0].length-1;
        while(rowbegin<=rowend && colowmbegin<=colowmend){
            for(int i=colowmbegin;i<=colowmend;i++){
                list.add(matrix[rowbegin][i]);
            }
            rowbegin++;
            for(int i=rowbegin;i<=rowend;i++){
                list.add(matrix[i][colowmend]);
            }
            colowmend--;
            if(rowbegin<=rowend){
                for(int i=colowmend;i>=colowmbegin;i--){
                    list.add(matrix[rowend][i]);
                }
                rowend--;
            }
            if(colowmbegin<=colowmend){
                for(int i=rowend;i>=rowbegin;i--){
                    list.add(matrix[i][colowmbegin]);
                }
                colowmbegin++;
            }
        }
       return list;
    }
}