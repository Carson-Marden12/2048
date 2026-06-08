public class twentyFourtyEight {
    

    public static void main(String[] args) {
        int[][] board = new int[4][4];
        int rx = (int) Math.random() * 4;
        int ry = (int) Math.random() * 4;
        int rz = (int) Math.random() * 10;
        if(rz < 9) {
            board[rx][ry] = 2;

        } else {
             board[rx][ry] = 4;
        }  

        rx = (int) Math.random() * 4;
        ry = (int) Math.random() * 4;
        rz = (int) Math.random() * 10;
        if(rz < 9) {
            board[rx][ry] = 2;

        } else {
             board[rx][ry] = 4;
        }  
        
        for(int x = 0; x < board.length; x ++){
            for(int y = 0; y < board[x].length; y++) {
            
            }
        }
    }
}
