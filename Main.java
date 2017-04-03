package H4;

public class Main {

	public static void transferStacktoQueue(Stack st, Queue qu){
		
		while(!st.isEmpty()){	
			qu.enqueue(st.pop());
		}
	}
	public static void transferQueuetoStack(Queue qu, Stack st){
		
		while(!qu.isEmpty()){		
			st.push(qu.dequeue());
		}		
	}
	public static void transferStacktoStack(Stack st1, Stack st2, Queue qu){
		
		while(!st1.isEmpty()){	
			qu.enqueue(st1.pop());
		}
		while(!qu.isEmpty()){	
			st2.push(qu.dequeue());
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
		Queue qu = new Queue();
		
		st.push(a);
		st.push(b);
		st.push(c);	
		qu.enqueue(d);
		qu.enqueue(e);
		qu.enqueue(f);
		
		st.print();
		System.out.println(" ");
		qu.print();
		System.out.println(" ");
		System.out.println(st.peek().toSring());
		System.out.println(qu.peek().toSring());
		System.out.println(" ");
		qu.destroy();
		qu.print();
		System.out.println(" ");
		transferStacktoQueue(st,qu);
		qu.print();
		System.out.println(" ");
		transferQueuetoStack(qu,st);
		st.print();
		System.out.println(" ");
		transferStacktoStack(st,st2,qu);
		st.print();
		System.out.println(" ");
		st2.print();
		
	}
}
