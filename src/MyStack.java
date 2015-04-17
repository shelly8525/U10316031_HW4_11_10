import java.util.ArrayList;

class MyStack extends ArrayList<String> {
	public boolean isEmpty(){
		return super.isEmpty();
	}
	
	public int getSize(){
		return super.size();
	}
	
	 public String peek() {
		 return super.get(getSize() - 1);
	 }
	 
	 public String pop() {
		 String o = super.get(getSize() - 1);
		 super.remove(getSize() - 1);
		 return o;
	 }
	 
	 public void push(String o){
		super.add(o); 
	 }
	 
	 @Override
	 public String toString(){
		 return "stack:"+super.toString();
	 }
}
