import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(),count=0,check = 1;
        int[] a = new int [N];
        while(check == 1){
            for(int i = 0;i<N;i++){
                if(count == 0)a[i] = sc.nextInt();
                if(a[i]%2!=0)check=0;
                a[i]/=2;
            }
            if(check == 1) count++;
        }
        System.out.print(count);
    }
}
