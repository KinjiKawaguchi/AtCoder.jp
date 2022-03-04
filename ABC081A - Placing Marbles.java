import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        String a = sc.next();
        String[] ary = a.split("");
        for(int i = 0; i<ary.length;i++){
            if("1".equals(ary[i])){
                count++;
            }
        }
        System.out.println(count);
    }
}
