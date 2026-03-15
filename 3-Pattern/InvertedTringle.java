// ******************inverted tringle******************
public class InvertedTringle {
    public static void tringle(int n) {
        //outer
        for(int i=1;i<=n;i++){
            //stars
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
                 }
                //no need of spaces automatically spaces due to next line 
                
            System.out.println();
        }
    }
    public static void main(String[] args) {
        tringle(5);
    }
}
