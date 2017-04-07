package H4;

public class Main {

	//Methods
	//Transfer a stack to a queue
	public static void transferStacktoQueue(Stack st, Queue qu){
		
		//While the stack is not empty remove item from stack and place in queue.
		while(!st.isEmpty()){	
			qu.enqueue(st.pop());
		}
	}
	//Transfer from a queue to a stack
	public static void transferQueuetoStack(Queue qu, Stack st1, Stack st2){
		
		//While the queue is not empty remove item from queue and place in the stack.
		while(!qu.isEmpty()){		
			st2.push(qu.dequeue());
		}		
		while(!st2.isEmpty()){
			st1.push(st2.pop());
		}
	}
	//Transfer from stack to stack
	public static void transferStacktoStack(Stack st1, Stack st2, Stack st3){
		//remove items from stack 1 to queue.
		while(!st1.isEmpty()){	
			st2.push(st1.pop());
		}
		while(!st2.isEmpty()){
			st3.push(st2.pop());
		}
	}
	
	public static void main(String[]args){
		
		Node a = new Node(0, "Alpha");
		Node b = new Node(1, "Bravo");
		Node c = new Node(2, "Charlie");
		Node d = new Node(3, "Delta");
		Node e = new Node(4, "Echo");
		Node f = new Node(5, "Foxtrot");
		
		
		Stack st = new Stack();
		Stack st2 = new Stack();
		Stack st3 = new Stack();
		Queue qu = new Queue();
		
		st.push(a);
		st.push(b);
		st.push(c);	
		qu.enqueue(d);
		qu.enqueue(e);
		qu.enqueue(f);
		
		System.out.println("Print stack");
		st.print();
		System.out.println(" ");
		System.out.println("Print Queue");
		qu.print();
		System.out.println(" ");
		System.out.println("Peek at top of stack");
		System.out.println(st.peek().toSring());
		System.out.println(" ");
		System.out.println("Peek at top of Queue");
		System.out.println(qu.peek().toSring());
		System.out.println(" ");
		qu.destroy();
		System.out.println("Destroy Queue print to show is empty");
		qu.print();
		System.out.println(" ");	
		System.out.println("Transfer stack to queue and print queue");
		System.out.println("Print stack");
		st.print();
		transferStacktoQueue(st,qu);
		System.out.println(" ");
		System.out.println("Print Queue");
		qu.print();
		System.out.println(" ");
		//Shows the stack is empty. 
		System.out.println("Print Stack to show is empty");
		st.print();
		System.out.println(" ");		
		System.out.println("Transfer queue to stack and print stack");
		System.out.println("Print Queue");
		qu.print();
		System.out.println(" ");
		transferQueuetoStack(qu,st,st2);
		System.out.println("Print stack");
		st.print();
		System.out.println(" ");
		//Shows the queue is empty.
		System.out.println("Print Queue to show is empty");
		qu.print();
		System.out.println(" ");	
		System.out.println("Transfer from Stack 1 to Stack 2 and print Stack 2");
		System.out.println("Print stack 1:");
		st.print();
		System.out.println(" ");
		transferStacktoStack(st,st2,st3);
		System.out.println("Print stack 2:");
		st3.print();
		//Shows that stack 1 is empty. 
		System.out.println(" ");
		System.out.println("Print Stack 1 to show is empty");
		st.print();
		
	}
}
