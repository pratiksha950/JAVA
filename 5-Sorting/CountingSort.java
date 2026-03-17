// ****************Counting Sort************************
public class CountingSort {
    public static void Count(int arr[]) {
        int Largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            Largest=Math.max(Largest,arr[i]);
        }
        int count[]=new int[Largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,3,2,1,2};
        Count(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
}
