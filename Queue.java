package H4;

public class Queue extends Stack {
	
		
		public Node bottom = null;
		
		//Adds item to end of Queue. 
		public void enqueue(Node newNode){
			
			if(this.isEmpty()){	
				this.top = bottom = newNode;
			}
			else{
				this.bottom.setNext(newNode);
				this.bottom = newNode;
			}
			
		}
		//Removes item from beginning of Queue. 
		public Node dequeue(){
			
			if(this.isEmpty()){
				return null;
				
			}else{
				
			Node temp = this.top;
			this.top = this.top.getNext();
			
			 if(this.top == null){	
				this.bottom = null;
				
			 }
			return temp;
			}
						
		}
		//Destroy Queue. 
		public void destroy(){
			this.top = null;
			this.bottom = null;
		}
		
	
}
