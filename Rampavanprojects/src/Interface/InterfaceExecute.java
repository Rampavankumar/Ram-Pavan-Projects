package Interface;

public class InterfaceExecute implements Rampavan,Nelakuditi{

	public void funram(){
		System.out.println("ram");
	}
	public void funpavan(){
		System.out.println("pavan");
		
	}
	public void funkumar(){
		System.out.println("kumar");
	}

public void funnela(){
	System.out.println("nela");
}
public void funkuditi(){
	System.out.println("nela");
}



public static void main(String[] args){
	InterfaceExecute ex=new InterfaceExecute();
	ex.funkuditi();
	ex.funkumar();
	ex.funnela();
	ex.funpavan();
	ex.funram();
	
}
	
	
}
