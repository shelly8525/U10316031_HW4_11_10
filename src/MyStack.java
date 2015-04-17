import java.util.ArrayList;

class MyStack extends ArrayList<String> {
	//create a boolean method
	public boolean isEmpty(){
		return super.isEmpty();
	}
	//create a getSize method
	public int getSize(){
		return super.size();
	}
	//create a peek method
	 public String peek() {
		 return super.get(getSize() - 1);
	 }
	 //create a pop method
	 public String pop() {
		 String o = super.get(getSize() - 1);
		 super.remove(getSize() - 1);
		 return o;
	 }
	 //create a push method
	 public void push(String o){
		super.add(o); 
	 }
	 
	 @Override
	 public String toString(){
		 return "stack:"+super.toString();
	 }
}
