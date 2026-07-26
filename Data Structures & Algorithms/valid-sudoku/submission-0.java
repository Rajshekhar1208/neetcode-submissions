class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        Map<Integer,Set<Character>> row = new HashMap<>();
        Map<Integer,Set<Character>> col = new HashMap<>();
        Map<String,Set<Character>> square = new HashMap<>();

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){

                String sqr = (i/3) + "," + (j/3);

                if(board[i][j] == '.'){
                    continue;
                }

                if(row.computeIfAbsent(i,k->new HashSet<>()).contains(board[i][j]) || col.computeIfAbsent(j,k->new HashSet<>()).contains(board[i][j]) 
                                || square.computeIfAbsent(sqr,k->new HashSet<>()).contains(board[i][j])){
                                    return false;
                                }

                row.get(i).add(board[i][j]);
                col.get(j).add(board[i][j]);
                square.get(sqr).add(board[i][j]);
            }
        }

        return true;
        
    }
}
