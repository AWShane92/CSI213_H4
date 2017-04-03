package H4;

public class Queue extends Stack {
	
		
		public Node bottom = null;
		
		public void enqueue(Node newNode){
			
			if(this.isEmpty()){	
				this.top = bottom = newNode;
			}
			else{
				this.bottom.setNext(newNode);
				this.bottom = newNode;
			}
			
		}
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
		
		public void destroy(){
			this.top = null;
			this.bottom = null;
		}
		
	
}
