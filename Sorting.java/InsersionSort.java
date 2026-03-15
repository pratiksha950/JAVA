// ************Insersion sort********************
public class InsersionSort{
    public static void Insersion( int arr[]) {
        for(int i=1;i<=arr.length-1;i++){
            int cur=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>cur){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=cur;
        }
    }

    public static void main(String[] args) {
        int arr[]={5,2,3,4,1};
        Insersion(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
