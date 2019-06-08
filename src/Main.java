import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("N1:");
        double n1= scanner.nextDouble();
        System.out.println("N2:");
        double n2= scanner.nextDouble();
        boolean b=true;

        if(Math.abs(n1-n2)> 0.01){
            b=false;
        }
        System.out.println(b);
    }
}