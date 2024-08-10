import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value: ");
        int n = sc.nextInt();
        for (int i = 0; i <n-1; i++) {
            for(int j=0;j<=i;j++)
                System.out.print("*");
            for(int j=n-2;j>i;j--){
                System.out.print(" ");
            }
            for(int j=n-3;j>i;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                    System.out.print((j==n-2)?"":"*");
            }
            System.out.println();
        }
    }
}
