import java.util.*;
public class positive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>0){
            System.out.println("Number is positive");
        }else{
            System.out.println("negative");
        }
        String result=num%2==0?"even":"odd";
        System.out.println(result);
        for(int i=0;i<5;i++){
            System.out.println("hii"+i);
            i+=2;
        }
    }
}
