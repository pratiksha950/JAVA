// ******************hollow Reactangle******************
public class HollowRectangle {
    public static void hollowRectangle(int totRow,int totColoumn){
        for(int i=1;i<=totRow;i++){
            for(int j=1;j<=totColoumn;j++){
                if(i==1||i==totRow||j==1||j==totColoumn){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        hollowRectangle(10,7);
    }
}
