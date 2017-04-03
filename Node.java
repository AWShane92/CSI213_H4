package H4;

public class Node {

	public int id;
	public String data;
	public Node next;
	
	public Node(int id, String data){
		
		this.id = id;
		this.data = data;
		
	}
	//Getters and setter.
	public int getId(){		
		return this.id;
	}
	
	public void setId(int i){
		this.id = i;
	}
	
	public String getData(){	
		return this.data;
	}
	
	public void setData(String data){	
		this.data = data;
	}
	
}
