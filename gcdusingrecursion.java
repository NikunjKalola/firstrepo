import java.util.Scanner;
/*using simple method
public class gcdusingrecurssion{
	public static void main(String[] args){
		int a,b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		int small = a>b?b:a;
		int gcd = 0;
		for(int i=small;i>=1;i--){
			if(a%i==0&&b%i==0){
				gcd = i;
				break;
			}
		}
		System.out.println(gcd);
	}
}*/
//using recursion
public class gcdusingrecursion{
	public static void main(String[] args){
		int a,b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		int small = a>b?b:a;
		int res = gcd(a,b,small);
		System.out.println(res);
	}
	public static int gcd(int a,int b,int small){
		if(a%small==0&&b%small==0){
			return small;
		}
		return gcd(a,b,small=small-1);
	}
}

