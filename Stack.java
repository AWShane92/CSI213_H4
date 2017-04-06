package H4;

public class Stack {
	
	public Node top = null;
	
	//Adds node item to top of the stack. 
	public void push(Node node){	
		node.setNext(this.top);
		this.top = node;	
	}
	
	public Node peek(){
		return this.top;
	}
	//Removes top item from Stack. 
	public Node pop(){
		
		if(this.isEmpty()){
			return null;
		}
		
		Node temp = this.top;
		this.top = this.top.getNext();
		
		return temp;
	}
	//Iterates thru the list and prints in order. 
	public void print(){
		
		if(this.isEmpty()){
			System.out.println("The list is empty");
			return;
		}
		
		Node temp = this.top;
		while(temp != null){
			
			System.out.println(temp.toSring());
			temp = temp.getNext();
		}
	}
	//Determines if the list is empty 
	public boolean isEmpty(){
		
		return this.top==null;
	}
	
	//Destroy Stack
	public void destroy(){
		
		this.top = null;
	}
}
