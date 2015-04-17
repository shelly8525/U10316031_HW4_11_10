import java.util.Scanner;

public class TestMyStack {
	public static void main(String[] args){
		MyStack s = new MyStack();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter five strings:");
		
		for(int i = 0;i <= 4;i++){
			s.push(input.next());
		}
		
		for(int a = s.getSize();a >= 1;a--){
			System.out.print(s.pop());
		}
	}
}
