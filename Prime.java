import java.util.Scanner;
/**国庆作业level 2：20150918后面的质数
 *by 卫潜昊*/
public class Prime {
    public static void main(String[] args) {
        int count = 0;
        int number;
/*
       System.out.println("20150918后面的质数");
        Scanner num = new Scanner(System.in);
        System.out.println("要求第几个？( 别太大了♪(´▽｀)  慢的很)");
        number = num.nextInt();
*/
        for (int n=20150918;n>0;n++){ /**蛤蛤*/
            boolean b = true;
            for (int i = 2; i < n/2; i++){
                if (n % i == 0){
                    b = false;
                    break;
                }
            }
            if (b){
               /*
                count++;
				if (count == number)
				*/
                {
                System.out.println("20150918后第"+count+"个质数:"+n);
				break;
				}
            }
        }
    }
}