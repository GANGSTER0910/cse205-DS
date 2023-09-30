class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
            char c= board[i][j];
            if(c=='.'){
                continue;
            }
            String row = "row"+i+c;
            if(set.contains(row)){
                return false;
            }
            set.add(row);
            String col = "col"+j+c;
            if(set.contains(col)){
                return false;
            } 
            set.add(col);
            int box = (i/3)*3+(j/3);
            String boxi = "box "+ box+c;
            if(set.contains(boxi)){
                return false;
            }
            set.add(boxi);
        }}
        return true;
}
}