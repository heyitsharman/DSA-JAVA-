package Backtracking;

import java.util.Arrays;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for(char[] s : board){
            Arrays.fill(s,'.');

        }
        solve(board,0,n);
    }
    public static Boolean isSafe(char[][] board, int row, int col){
        //row
        for(int i=0; i< board.length; i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //col
        for(int i=0; i< board.length; i++){
            if(board[row][i]=='Q'){
                return false;
            }
        }

        //urd
        int r = row;
        int c = col;
        while(r>=0 && c<4){
            if(board[r][c]=='Q'){
                return false;
            }
            r--;
            c++;
        }


        //uld
        r = row;
        c = col;
        while(r>=0 && c>=0){
            if(board[r][c]=='Q'){
                return false;
            }
            r--;
            c--;
        }

        return true;
    }
    public static void solve(char[][] board, int row, int n){
        if(row==n){
            //print
           for(char[] r: board){
               System.out.println(Arrays.toString(r));
           }
            return;
        }
        for(int col = 0; col<n; col++){
            if(isSafe(board,row,col)) {
                board[row][col] = 'Q';
                solve(board, row + 1, n);
                board[row][col] = '.';
            }

        }

    }
}
