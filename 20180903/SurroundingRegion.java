class Solution {
    public Queue<Point> q = new LinkedList<Point>();
    public void solve(char[][] board) {
        //BFS
        if(board.length == 0 ) return;
        // check all the boundary


        int row = board.length;

        int col = board[0].length;
        // Queue<Point> q = new LinkedList<Point>();

        for(int i = 0; i< col; i++){
            if(board[0][i]== 'O'){
                q.add(new Point(0,i));
                board[0][i] = '+';
            }

            if(board[row-1][i] == 'O') {
                q.add(new Point(row-1, i));
                board[row-1][i] = '+';
            }
        }

        // check two board col
        for(int j =0; j<row; j++) {
            if(board[j][0]=='O') {
                q.add(new Point(j,0));
                board[j][0] = '+';
            }
            if(board[j][col-1]=='O') {
                q.add(new Point(j,col-1));
                board[j][col-1] = '+';
            }
        }

        while(!q.isEmpty()){
            Point p = q.poll();
            int x = p.x;
            int y = p.y;
            // check around
            if(x-1 >=0 && board[x-1][y] == 'O') {
                q.add(new Point(x-1,y));
                board[x-1][y] = '+';
            }
            if(x+1<row && board[x+1][y] == 'O') {
                q.add(new Point(x+1,y));
                board[x+1][y] = '+';

            }
            if(y-1>=0 && board[x][y-1] == 'O' ) {
                q.add(new Point(x,y-1));
                board[x][y-1] = '+';
            }
            if(y+1<col && board[x][y+1] == 'O') {
                q.add(new Point(x, y+1));
                board[x][y+1] = '+';
            }
        }


        // change all '+'
        for(int i = 0; i< row; i++) {
            for(int j =0; j< col; j++) {
                if(board[i][j] == '+') {
                    board[i][j] = 'O';
                } else if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }

    }


}
