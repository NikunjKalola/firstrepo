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
//using 2nd mtehod 
/*public class gcdusingrecursion{
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
}*/
// using 3rd very efficient method
public class gcdusingrecursion{
	public static void main(String[] args){
		int a,b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(gcd(a,b));
	}
	public static int gcd(int a,int b){
		if(a==b)
			return a;
		if(a%b==0)
			return b;
		if(b%a==0)
			return a;
		if(a>b)
			return gcd(a%b,b);
		else 
			return gcd(a,b%a);
	}
}

