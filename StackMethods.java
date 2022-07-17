import java.util.Scanner;
class Stack{
	int[] s = new int[8];
	int top = -1;
	public void push(int x){
		if(top>=8){
			System.out.println("Stack overflow");
			return;
		}
		top = top+1;
		s[top] = x;
	}
	public int pop(){
		int item;
		if(top<0){
			System.out.println("Stack underflow");
		}
		item = s[top];
		top--;
		return (item);
	}
	public int peep(int i){
		if(top-i+1<=-1){
			System.out.println("Stack underflow");
			return 0;
		}
		return (s[top-i+1]);
	}
	public void change(int i,int x){
		if(top-i+1<=-1){
			System.out.println("stack underflow");
			return;
		}
		s[top-i+1] = x;
 	}
	public void display(){
		int i=top;
		while(i!=-1){
			System.out.println(s[i]);
			i--;
		}
	}
}
public class pushpoppeep{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		int choice;
		Stack s = new Stack();
		while(b){
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3. peep");
			System.out.println("4.change");
			System.out.println("5.display");
			System.out.println("6.exit");
			System.out.println("enter choice");
			choice = sc.nextInt();
			switch (choice) {
				case 1:{
					System.out.println("Enter value to push in stack");
					int x = sc.nextInt();
					s.push(x);
					break;
				}
				case 2:{
					System.out.println("poped element is"+s.pop());
					break;
				}
				case 3:{
					System.out.println("enter value of index from top to display");
					int i = sc.nextInt();
					System.out.println("element is "+s.peep(i));
					break;
				}
				case 4:{
					int x,i;
					System.out.println("enter element to change");
					x = sc.nextInt();
					System.out.println("enter index from top to change");
					i = sc.nextInt();
					s.change(i,x);
					break;
				}
				case 5:{
					s.display();
					break;
				}
				case 6:{
					b = false;
					break;
				}
				default:
					break;
			}
		}
	}		
}
