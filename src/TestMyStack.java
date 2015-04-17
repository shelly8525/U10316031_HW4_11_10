import java.util.Scanner;

public class TestMyStack {
	//main method
	public static void main(String[] args){
		MyStack s = new MyStack();//new an object
		Scanner input = new Scanner(System.in);//create a Scanner
		System.out.print("Enter five strings:");//print five strings
		//create a forloop
		for(int i = 0;i <= 4;i++){
			s.push(input.next());
		}
		//create a forloop
		for(int a = s.getSize();a >= 1;a--){
			System.out.print(s.pop());
		}
	}
}
