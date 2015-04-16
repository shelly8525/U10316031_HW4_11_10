import java.util.ArrayList;
public class MyStack<s> extends ArrayList<s> {
	public Mystack(){
		super();
	}
	
	public boolean isEmpty(){
		if(this.isEmpty()){
			return true;
		}
		else{
			return false;
		}
	}
	
	public int getSize(){
		return 
	}
	
	 public s peek() {
	        return get(size() - 1);
	 }
	 
	 public s pop() {
	        return remove(size() - 1);
	 }
	 
	 public void push(s o){
		add(o); 
	 }
}
