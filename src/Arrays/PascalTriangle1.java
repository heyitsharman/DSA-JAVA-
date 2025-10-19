package Arrays;

public class PascalTriangle1 {
//    in this variation of pascal triangle we have tell element at particular row and column given by user
    public static int ncr(int a, int b){
        int res = 1;
        for(int i=0; i<b;i++){
            res*=(a-i);
            res/=(i+1);
        }
        return res;
    }
    public static void main(String[] args) {
        int row = 5;
        int col = 3;
        System.out.println(ncr(row-1,col-1));
    }
}
