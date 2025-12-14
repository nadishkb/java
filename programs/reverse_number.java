
import java.util.Scanner;

class Reverse_num{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("enter number = ");
        System.out.println(Reverse_num(ip.nextInt()));
        
    }

    static String Reverse_num(int ip){
        int result = 0;
        while(ip>0){
            result = (result*10) + ip%10;
            ip = ip/10;
        }
        return String.valueOf(result);

    }
}