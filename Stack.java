package H4;

public class Stack {
	
	public Node top = null;
	
	public void push(Node node){	
		node.setNext(this.top);
		this.top = node;	
	}
	
	public Node peek(){
		return this.top;
	}
	
	public Node pop(){
		
		if(this.isEmpty()){
			return null;
		}
		
		Node temp = this.top;
		this.top = this.top.getNext();
		
		return temp;
	}
	
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
	
	public boolean isEmpty(){
		
		return this.top==null;
	}
	
	public void destroy(){
		
		this.top = null;
	}
}
