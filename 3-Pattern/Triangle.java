// ******************tringle******************
// ********************pattern programs*********************
// ********************int i=number of stars********************
// ********************int j=number of spaces********************

public class Triangle {
    public static void tringle(int n) {
        //outer
        for(int i=1;i<=n;i++){
            //stars
            for(int j=1;j<=i;j++){
                System.out.print(j);
                 }
                //spaces
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        tringle(5);
    }
}

